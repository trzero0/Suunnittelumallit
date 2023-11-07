public class Main {
    public static void main(String[] args) {
        Character character1 = new Character(new NormalState());
        Character character2 = new Character(new SuperState());

        BonusVisitor bonusVisitor = new BonusCalculator();

        character1.accept(bonusVisitor);
        character2.accept(bonusVisitor);
    }
}