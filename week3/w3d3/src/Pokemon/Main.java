package Pokemon;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Pokemon> pokemonOfAsh = initializePokemons();

        String goodPokemon = "null";

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        for (int i = 0; i < pokemonOfAsh.size(); i++) {
            if (wildPokemon.type == pokemonOfAsh.get(i).effectiveAgainst) {
                goodPokemon = pokemonOfAsh.get(i).name;
            }

        }

        // Which pokemon should Ash use?

        System.out.print("I choose you, " + goodPokemon);
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}
