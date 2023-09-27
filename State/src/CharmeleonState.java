public class CharmeleonState implements PokemonState {
    private Pokemon pokemon;

    public CharmeleonState(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attack() {
        System.out.println("Charmeleon attacks with Flame Burst!");
        pokemon.evolve();
    }

    @Override
    public void defend() {
        System.out.println("Charmeleon defends with Fire Spin!");
    }

    @Override
    public void evolve() {
        System.out.println("Charmeleon evolves to Charizard!");
        pokemon.setState(pokemon.getCharizardState());
    }
}