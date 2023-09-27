public class CharizardState implements PokemonState {
    private Pokemon pokemon;

    public CharizardState(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attack() {
        System.out.println("Charizard attacks with Fire Blast!");
    }

    @Override
    public void defend() {
        System.out.println("Charizard defends with Flamethrower!");
    }

    @Override
    public void evolve() {
        System.out.println("Charizard is already in its final form!");
    }
}
