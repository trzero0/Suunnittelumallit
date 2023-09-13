public class main {
    public static void main(String[] args) {
        // Luo yksittäisiä laiteosia
        Laiteosa muistipiiri = new yksLaiteosa("Muistipiiri", 50.0);
        Laiteosa prosessori = new yksLaiteosa("Prosessori", 200.0);
        Laiteosa verkkokortti = new yksLaiteosa("Verkkokortti", 30.0);
        Laiteosa naytonohjain = new yksLaiteosa("Näytönohjain", 150.0);

        // Luo koostekomponentit
        koosteLaiteosa emolevy = new koosteLaiteosa("Emolevy");
        emolevy.lisaaLaiteosa(muistipiiri);
        emolevy.lisaaLaiteosa(prosessori);

        koosteLaiteosa kotelo = new koosteLaiteosa("Kotelo");
        kotelo.lisaaLaiteosa(emolevy);
        kotelo.lisaaLaiteosa(verkkokortti);
        kotelo.lisaaLaiteosa(naytonohjain);

        // Laske kokoonpanon hinta
        double kokoonpanonHinta = kotelo.getHinta();

        // Tulosta kokoonpanon hinta
        System.out.println("Pöytätietokoneen kokoonpanon hinta: " + kokoonpanonHinta + " euroa");
    }
}