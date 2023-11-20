public class App {
    public static void main(String[] args) {
        OldService oldService = new OldService();

        NewService normalImplementation = new NormalImplementation(oldService);
        NewService adapterImplementation = new Adapter(oldService);

        Client client = new Client();
        client.useService(normalImplementation);
        client.useService(adapterImplementation);
    }
}