import java.util.ArrayList;

public class HesburgerBuilder implements BurgerBuilder {
    private ArrayList<BurgerPart> parts = new ArrayList<>();

    @Override
    public void addPart(BurgerPart part) {
        parts.add(part);
    }

    @Override
    public Burger getBurger() {
        return new Burger(parts);
    }
}