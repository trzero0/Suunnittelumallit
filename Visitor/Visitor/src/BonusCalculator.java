public class BonusCalculator implements BonusVisitor {
    @Override
    public void visit(NormalState state) {
        System.out.println("Normaalitila: Lisätään 10 bonuspistettä.");
    }

    @Override
    public void visit(SuperState state) {
        System.out.println("Supertila: Lisätään 20 bonuspistettä.");
    }
}