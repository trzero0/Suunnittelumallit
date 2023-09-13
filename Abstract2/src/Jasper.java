import Vaatteet.*;

public class Jasper {
    private Lippis lippis;
    private Paita paita;
    private Farkut farkut;
    private Kengat kengat;

    public Jasper(String merkki) {
        this.lippis = new Lippis(merkki);
        this.paita = new Paita(merkki);
        this.farkut = new Farkut(merkki);
        this.kengat = new Kengat(merkki);
    }

    public Lippis getLippis() {
        return lippis;
    }

    public void setLippis(Lippis lippis) {
        this.lippis = lippis;
    }

    public Paita getPaita() {
        return paita;
    }

    public void setPaita(Paita paita) {
        this.paita = paita;
    }

    public Farkut getFarkut() {
        return farkut;
    }

    public void setFarkut(Farkut farkut) {
        this.farkut = farkut;
    }

    public Kengat getKengat() {
        return kengat;
    }

    public void setKengat(Kengat kengat) {
        this.kengat = kengat;
    }

    @Override
    public String toString() {
        return "Jasper{" +
                "lippis=" + lippis +
                ", paita=" + paita +
                ", farkut=" + farkut +
                ", kengat=" + kengat +
                '}';
    }
}