public class Character {
    private CharacterState state;

    public Character(CharacterState state) {
        this.state = state;
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void accept(BonusVisitor visitor) {
        state.accept(visitor);
    }
}