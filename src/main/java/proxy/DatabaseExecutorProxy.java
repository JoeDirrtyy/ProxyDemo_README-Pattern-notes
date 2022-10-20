package proxy;

public class DatabaseExecutorProxy implements DatabaseExecutor {
    boolean ifAdmin;
    DatabaseExecutorImpl dbExecutor;

    public DatabaseExecutorProxy(String name, String password){
        if(name == "Admin" && password == "Admin123"){
            ifAdmin = true;
            dbExecutor = new DatabaseExecutorImpl();
        }
    }
    @Override
    public void executeDatabase(String query) throws Exception {
        if(ifAdmin){
            dbExecutor.executeDatabase(query);
        }else{
            if(query.equals("DELETE")){
                throw new Exception("DELETE function only allowed for admin users");
            }else{
                dbExecutor.executeDatabase(query);
            }
        }
    }
}
