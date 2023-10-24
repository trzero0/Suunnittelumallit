public class Main {
    public static void main(String[] args) {
        Handler lähiesimies = new Lähiesimies();
        Handler yksikönPäällikkö = new YksikönPäällikkö();
        Handler toimitusjohtaja = new Toimitusjohtaja();

        // Määritellään ketju käsittelijöitä
        lähiesimies.asetaSeuraavaKäsittelijä(yksikönPäällikkö);
        yksikönPäällikkö.asetaSeuraavaKäsittelijä(toimitusjohtaja);

        // Luodaan palkankorotuspyyntö ja käsitellään se
        Palkankorotuspyyntö pyyntö = new Palkankorotuspyyntö(5);
        lähiesimies.käsittelePyyntö(pyyntö);
    }
}