public class Pokemon {
    private PokemonState charmanderState;
    private PokemonState charmeleonState;
    private PokemonState charizardState;
    private PokemonState currentState;

    public Pokemon() {
        this.charmanderState = new CharmanderState(this);
        this.charmeleonState = new CharmeleonState(this);
        this.charizardState = new CharizardState(this);
        this.currentState = charmanderState;
    }

    public void attack() {
        currentState.attack();
    }

    public void defend() {
        currentState.defend();
    }

    public void evolve() {
        currentState.evolve();
    }

    public void setState(PokemonState state) {
        this.currentState = state;
    }

    public PokemonState getCharmanderState() {
        return charmanderState;
    }

    public PokemonState getCharmeleonState() {
        return charmeleonState;
    }

    public PokemonState getCharizardState() {
        return charizardState;
    }
}
