package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus opettajaKahvilla = new OpettajaKahvilla();
        AterioivaOtus opettajaTeella = new OpettajaTeella();

        opettajaKahvilla.aterioi();
        opettajaTeella.aterioi();
    }
}
