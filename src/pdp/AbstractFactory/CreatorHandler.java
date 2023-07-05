package pdp.AbstractFactory;

import pdp.FactoryMethod.Bulbasaur;
import pdp.FactoryMethod.Flamethrower;
import pdp.FactoryMethod.Ivysaur;
import pdp.FactoryMethod.Moves;
import pdp.FactoryMethod.Pokemon;

public class CreatorHandler {
	// the method is factory method design patter while the whole class is abstract factory
	// either make 1000+ Pokemon subclasses (for each pokemon) or put them on an Enum(?)
	public static Pokemon createPokemon(String pPokemonName) {
		if (pPokemonName.equalsIgnoreCase("Bulbasaur")) {
			return new Bulbasaur();
		} else if (pPokemonName.equalsIgnoreCase("Ivysaur")) {
			return new Ivysaur();
		} else {
			throw new IllegalArgumentException(pPokemonName + " not available");
		}
	}
	
	public static Moves createMoves(String pMovesName) {
		if (pMovesName.equalsIgnoreCase("Flamethrower")) {
			return new Flamethrower();
		} else {
			throw new IllegalArgumentException(pMovesName + " not available");
		}
	}
	// there will be several creator method
}
