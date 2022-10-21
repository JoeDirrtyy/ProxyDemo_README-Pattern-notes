package proxy;

public class DatabaseActualProxy implements DatabaseExecutor {
    boolean ifAdmin;
    DatabaseService dbExecutor;

    public DatabaseActualProxy(String name, String password){
        if(name == "Admin" && password == "Admin123"){
            ifAdmin = true;
            dbExecutor = new DatabaseService();
        }
    }
    @Override
    public void executeDatabase(String command) throws Exception {
        if(ifAdmin){
            dbExecutor.executeDatabase(command);
        }else{
            if(command.equals("DELETE")){
                throw new Exception("DELETE function only allowed for admin users");
            }else{
                dbExecutor.executeDatabase(command);
            }
        }
    }
}
