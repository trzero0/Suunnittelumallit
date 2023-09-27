public class CharmanderState implements PokemonState {
    private Pokemon pokemon;

    public CharmanderState(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attack() {
        System.out.println("Charmander attacks with Ember!");
        pokemon.evolve();
    }

    @Override
    public void defend() {
        System.out.println("Charmander defends with Smoke Screen!");
    }

    @Override
    public void evolve() {
        System.out.println("Charmander evolves to Charmeleon!");
        pokemon.setState(pokemon.getCharmeleonState());
    }
}



