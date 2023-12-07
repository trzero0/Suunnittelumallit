public class Kello implements Cloneable {
    private Viisari tuntiViisari;
    private Viisari minuuttiViisari;

    public Kello(int tunti, int minuutti) {
        tuntiViisari = new Viisari(tunti);
        minuuttiViisari = new Viisari(minuutti);
    }

    public Viisari getTuntiViisari() {
        return tuntiViisari;
    }

    public Viisari getMinuuttiViisari() {
        return minuuttiViisari;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Kello clonedKello = (Kello) super.clone();
        clonedKello.tuntiViisari = (Viisari) tuntiViisari.clone();
        clonedKello.minuuttiViisari = (Viisari) minuuttiViisari.clone();
        return clonedKello;
    }
}