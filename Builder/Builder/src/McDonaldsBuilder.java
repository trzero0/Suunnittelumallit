public class McDonaldsBuilder implements BurgerBuilder {
    private StringBuilder builder = new StringBuilder();

    @Override
    public void addPart(BurgerPart part) {
        builder.append(part.getName()).append(" ");
    }

    @Override
    public Burger getBurger() {
        return new Burger(builder.toString());
    }
}