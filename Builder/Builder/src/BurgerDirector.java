public class BurgerDirector {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder builder) {
        burgerBuilder = builder;
    }

    public Burger getBurger() {
        return burgerBuilder.getBurger();
    }

    public void constructBurger1() {
        burgerBuilder.addPart(new BurgerPart("Bun"));
        burgerBuilder.addPart(new BurgerPart("Cheese"));
        burgerBuilder.addPart(new BurgerPart("Lettuce"));
        burgerBuilder.addPart(new BurgerPart("Patty"));
    }

    public void constructBurger2() {
        burgerBuilder.addPart(new BurgerPart("Bun"));
        burgerBuilder.addPart(new BurgerPart("Patty"));
        burgerBuilder.addPart(new BurgerPart("Tomato"));
        burgerBuilder.addPart(new BurgerPart("Onion"));
    }
}