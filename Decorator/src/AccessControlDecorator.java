public class AccessControlDecorator implements Database {
    private final Database database;
    private final String password;
    
    public AccessControlDecorator(Database database, String password) {
        this.database = database;
        this.password = password;
    }
    
    private boolean authenticate(String inputPassword) {
        return inputPassword.equals(password);
    }
    
    @Override
    public void writeData(String data) {
        System.out.println("Access denied: Write operation not permitted.");
    }
    
    @Override
    public String readData() {
        System.out.println("Access denied: Read operation not permitted.");
        return null;
    }
    
    public void writeData(String data, String password) {
        if (authenticate(password)) {
            database.writeData(data);
            System.out.println("Write operation successful.");
        } else {
            System.out.println("Access denied: Incorrect password.");
        }
    }
    
    public String readData(String password) {
        if (authenticate(password)) {
            System.out.println("Read operation successful.");
            return database.readData();
        } else {
            System.out.println("Access denied: Incorrect password.");
            return null;
        }
    }
}
