public class App {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();

        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        director.setBurgerBuilder(hesburgerBuilder);

        System.out.println("Hesburger Burger 1:");
        director.constructBurger1();
        Burger hesburger1 = director.getBurger();
        hesburger1.display();

        System.out.println("\nHesburger Burger 2:");
        director.constructBurger2();
        Burger hesburger2 = director.getBurger();
        hesburger2.display();

        McDonaldsBuilder mcdonaldsBuilder = new McDonaldsBuilder();
        director.setBurgerBuilder(mcdonaldsBuilder);

        System.out.println("\nMcDonald's Burger 1:");
        director.constructBurger1();
        Burger mcdonalds1 = director.getBurger();
        mcdonalds1.display();

        System.out.println("\nMcDonald's Burger 2:");
        director.constructBurger2();
        Burger mcdonalds2 = director.getBurger();
        mcdonalds2.display();
    }
}