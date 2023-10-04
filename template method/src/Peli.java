public abstract class Peli {
    protected int pelaajienLkm;

    abstract void alustaPeli();

    abstract void teeSiirto(int pelaaja);

    abstract boolean onkoPeliOhi();

    abstract void tulostaVoittaja();

    public final void pelaaYksiPeli(int pelaajienLkm) {
        this.pelaajienLkm = pelaajienLkm;
        alustaPeli();
        int j = 0;
        while (!onkoPeliOhi()){
            teeSiirto(j);
            j = (j + 1) % pelaajienLkm;
        }
        tulostaVoittaja();
    }
}
