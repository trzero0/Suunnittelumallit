import java.util.Random;

// Asiakas-luokka
public class Asiakas extends Thread {
    private final Arvuuttaja arvuuttaja;
    private final Memento memento;

    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.memento = arvuuttaja.liityPeliin();
    }

    @Override
    public void run() {
        int arvaus;
        do {
            arvaus = new Random().nextInt(100) + 1; // Arvotaan uusi arvaus
        } while (!arvuuttaja.tarkistaArvaus(memento, arvaus)); // Yritetään arvata, kunnes arvaus on oikein
        System.out.println("Asiakas arvasi oikein: " + arvaus);
    }
}