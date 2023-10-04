public class ArvausPeli extends Peli {
    private int salainenNumero;
    private int[] pelaajienArvaukset;
    private int voittaja = -1;

    void alustaPeli() {
        salainenNumero = (int) (Math.random() * 100) + 1;
        pelaajienArvaukset = new int[pelaajienLkm];
        System.out.println("Arvaa salainen numero väliltä 1 ja 100!");
    }

    void teeSiirto(int pelaaja) {
        
        pelaajienArvaukset[pelaaja] = (int) (Math.random() * 100) + 1;
        System.out.println("Pelaaja " + (pelaaja + 1) + " arvaa: " + pelaajienArvaukset[pelaaja]);
        if (pelaajienArvaukset[pelaaja] == salainenNumero) {
            voittaja = pelaaja;
        }
    }

    boolean onkoPeliOhi() {
        return voittaja != -1; 
    }

    void tulostaVoittaja() {
        System.out.println("Pelaaja " + (voittaja + 1) + " arvasi oikein! " + salainenNumero);
    }
}
