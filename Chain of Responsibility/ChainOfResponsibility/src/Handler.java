public interface Handler {
    void käsittelePyyntö(Palkankorotuspyyntö pyyntö);
    void asetaSeuraavaKäsittelijä(Handler seuraavaKäsittelijä);
}