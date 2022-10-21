package proxy;

public class DatabaseService implements DatabaseExecutor {
    @Override
    public void executeDatabase(String command) {
        System.out.println("This will execute the Command: " + command);
    }
}
