public class Toimitusjohtaja implements Handler {
    @Override
    public void käsittelePyyntö(Palkankorotuspyyntö pyyntö) {
        if (pyyntö.getPalkankorotusProsentti() > 5) {
            System.out.println("Toimitusjohtaja hyväksyy palkankorotuspyynnön.");
        } else {
            System.out.println("Palkankorotuspyyntö hylättiin.");
        }
    }

    @Override
    public void asetaSeuraavaKäsittelijä(Handler seuraavaKäsittelijä) {
        // Toimitusjohtajalla ei ole seuraavaa käsittelijää
    }
}