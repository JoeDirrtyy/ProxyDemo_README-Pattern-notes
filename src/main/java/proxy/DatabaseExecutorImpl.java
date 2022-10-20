package proxy;

public class DatabaseExecutorImpl implements DatabaseExecutor {
    @Override
    public void executeDatabase(String query) throws Exception {
        System.out.println("This will execute the Query: " + query);
    }
}
