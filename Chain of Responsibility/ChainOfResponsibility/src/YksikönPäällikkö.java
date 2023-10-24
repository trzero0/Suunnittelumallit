public class YksikönPäällikkö implements Handler {
    private Handler seuraavaKäsittelijä;

    @Override
    public void käsittelePyyntö(Palkankorotuspyyntö pyyntö) {
        if (pyyntö.getPalkankorotusProsentti() > 2 && pyyntö.getPalkankorotusProsentti() <= 5) {
            System.out.println("Yksikön päällikkö hyväksyy palkankorotuspyynnön.");
        } else if (seuraavaKäsittelijä != null) {
            seuraavaKäsittelijä.käsittelePyyntö(pyyntö);
        }
    }

    @Override
    public void asetaSeuraavaKäsittelijä(Handler seuraavaKäsittelijä) {
        this.seuraavaKäsittelijä = seuraavaKäsittelijä;
    }
}