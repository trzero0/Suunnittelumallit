public class KelloTesti {
    public static void main(String[] args) {
        Kello alkupera = new Kello(12, 30);

        try {
            Kello klooni = (Kello) alkupera.clone();

            System.out.println("Alkuperäinen: " + alkupera.getTuntiViisari().getAika() + ":" +
                    alkupera.getMinuuttiViisari().getAika());
            System.out.println("Klooni: " + klooni.getTuntiViisari().getAika() + ":" +
                    klooni.getMinuuttiViisari().getAika());

            alkupera.getTuntiViisari().setAika(6);
            alkupera.getMinuuttiViisari().setAika(45);

            System.out.println("Muutoksen jälkeen alkuperäinen: " +
                    alkupera.getTuntiViisari().getAika() + ":" + alkupera.getMinuuttiViisari().getAika());
            System.out.println("Muutoksen jälkeen klooni: " +
                    klooni.getTuntiViisari().getAika() + ":" + klooni.getMinuuttiViisari().getAika());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}