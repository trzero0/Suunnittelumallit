public class Main {
    public static void main(String[] args) {
        // Luodaan konkreettinen tietokanta
        Database database = new ConcreteDatabase();
        
        // Asetetaan salasana ja luodaan dekoraattori pääsynvalvonnalla
        String password = "password123";
        Database accessControlDatabase = new AccessControlDecorator(database, password);
        
        // Yritetään kirjoittaa ja lukea dataa ilman salasanaa
        accessControlDatabase.writeData("Sensitive Data");
        accessControlDatabase.readData();
        
        // Yritetään kirjoittaa ja lukea dataa oikealla salasanalla
        ((AccessControlDecorator) accessControlDatabase).writeData("Sensitive Data", password);
        ((AccessControlDecorator) accessControlDatabase).readData(password);
        
        // Yritetään kirjoittaa ja lukea dataa väärällä salasanalla
        ((AccessControlDecorator) accessControlDatabase).writeData("Sensitive Data", "wrongPassword");
        ((AccessControlDecorator) accessControlDatabase).readData("wrongPassword");
    }
}
