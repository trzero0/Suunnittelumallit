import java.util.ArrayList;

public class Burger {
    private ArrayList<BurgerPart> partsList;
    private String partsString;

    public Burger(ArrayList<BurgerPart> partsList) {
        this.partsList = partsList;
    }

    public Burger(String partsString) {
        this.partsString = partsString;
    }

    public void display() {
        if (partsList != null) {
            System.out.println("Hesburger Burger Parts:");
            for (BurgerPart part : partsList) {
                System.out.println("- " + part.getName());
            }
        } else {
            System.out.println("McDonald's Burger Parts: " + partsString);
        }
    }
}