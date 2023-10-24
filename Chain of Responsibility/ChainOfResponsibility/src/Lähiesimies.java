public class Lähiesimies implements Handler {
    private Handler seuraavaKäsittelijä;

    @Override
    public void käsittelePyyntö(Palkankorotuspyyntö pyyntö) {
        if (pyyntö.getPalkankorotusProsentti() <= 2) {
            System.out.println("Lähiesimies hyväksyy palkankorotuspyynnön.");
        } else if (seuraavaKäsittelijä != null) {
            seuraavaKäsittelijä.käsittelePyyntö(pyyntö);
        }
    }

    @Override
    public void asetaSeuraavaKäsittelijä(Handler seuraavaKäsittelijä) {
        this.seuraavaKäsittelijä = seuraavaKäsittelijä;
    }
}