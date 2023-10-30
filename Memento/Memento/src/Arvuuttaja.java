import java.util.Random;

// Arvuuttaja-luokka
public class Arvuuttaja {
    private final int secretNumber;

    public Arvuuttaja() {
        // Arpoo satunnaisen luvun välillä 1-100
        this.secretNumber = new Random().nextInt(100) + 1;
    }

    // Liity peliin ja saa Memento, jossa on arvottu luku
    public Memento liityPeliin() {
        return new Memento(secretNumber);
    }

    // Tarkista arvaus ja palauta true, jos arvaus on oikein
    public boolean tarkistaArvaus(Memento memento, int arvaus) {
        return memento.getNumber() == arvaus;
    }
}
