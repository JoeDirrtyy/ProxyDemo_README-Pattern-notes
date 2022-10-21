package proxy;

public class ProxyPatternExample {
    public static void main(String[] args) throws Exception {
//        DatabaseExecutor nonAdminExecutor = new DatabaseActualProxy("NonAdmin", "Admin123");
//        nonAdminExecutor.executeDatabase("DELETE");

        DatabaseExecutor adminExecutor = new DatabaseActualProxy("Admin","Admin123");
        adminExecutor.executeDatabase("DELETE");
    }
}
