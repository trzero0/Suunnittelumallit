public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        int asiakkaidenMaara = 5; // Voit muuttaa asiakkaiden määrää tarvittaessa

        Asiakas[] asiakkaat = new Asiakas[asiakkaidenMaara];
        for (int i = 0; i < asiakkaidenMaara; i++) {
            asiakkaat[i] = new Asiakas(arvuuttaja);
            asiakkaat[i].start();
        }

        // Odota, kunnes kaikki asiakkaat ovat arvanneet oikein
        for (Asiakas asiakas : asiakkaat) {
            try {
                asiakas.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Peli päättyi, kaikki asiakkaat arvasivat oikein!");
    }
}