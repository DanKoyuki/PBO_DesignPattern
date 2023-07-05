package pdp.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import pdp.AbstractFactory.CreatorHandler;
import pdp.FactoryMethod.Moves;
import pdp.FactoryMethod.Pokemon;
import pdp.Prototype.PokemonCopy;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pokemon> listPokemon = new ArrayList<>();
		List<Moves> listMoves = new ArrayList<>();
		List<PokemonCopy> listPokemonCopy = new ArrayList<>();
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		
		while (loop) {
			System.out.println("Menu:\n1. Create Pokemon\n2. Create Moves\n3. Display\n4. Exit");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("1. Existing Pokemon\n2. New Pokemon");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					System.out.print("Pokemon Name: ");
					String tPokemonName = sc.next();
					listPokemon.add(CreatorHandler.createPokemon(tPokemonName));				// Usage Example for Abstract Factory and Factory Method
					listPokemonCopy.add(CreatorHandler.createPokemon(tPokemonName).clone());	// Prototype Implementation
				} else if (choice2 == 2) {
					int tPokemonHP = 0;
					int tPokemonATK = 0;
					int tPokemonDEF = 0;
					int tPokemonSPA = 0;
					int tPokemonSPD = 0;
					int tPokemonSPE = 0;
					String userInput;
					System.out.print("Enter Pokemon Name: ");
					String tPokemonName = sc.next();
					sc.nextLine();
					System.out.print("Enter Pokemon HP: ");
					userInput = sc.nextLine();
					if (!userInput.isEmpty()) {
						tPokemonHP = Integer.parseInt(userInput);
					}
					System.out.print("Enter Pokemon ATK: ");
					userInput = sc.nextLine();
					if (!userInput.isEmpty()) {
						tPokemonATK = Integer.parseInt(userInput);
					}
					System.out.print("Enter Pokemon DEF: ");
					userInput = sc.nextLine();
					if (!userInput.isEmpty()) {
						tPokemonDEF = Integer.parseInt(userInput);
					}
					System.out.print("Enter Pokemon SPA: ");
					userInput = sc.nextLine();
					if (!userInput.isEmpty()) {
						tPokemonSPA = Integer.parseInt(userInput);
					}
					System.out.print("Enter Pokemon SPD: ");
					userInput = sc.nextLine();
					if (!userInput.isEmpty()) {
						tPokemonSPD = Integer.parseInt(userInput);
					}
					System.out.print("Enter Pokemon SPE: ");
					userInput = sc.nextLine();
					if (!userInput.isEmpty()) {
						tPokemonSPE = Integer.parseInt(userInput);
					}
					
					// Builder Implementation
					Pokemon pokemon = new Pokemon(tPokemonName)			// usage example for Builder Pattern
							.withHP(tPokemonHP)
							.withATK(tPokemonATK)
							.withDEF(tPokemonDEF)
							.withSPA(tPokemonSPA)
							.withSPD(tPokemonSPD)
							.withSPE(tPokemonSPE);
					
					listPokemon.add(pokemon);
					listPokemonCopy.add(pokemon.clone());	// Prototype Implementation
				}
				break;
				
			case 2:
				sc.nextLine();
				System.out.print("Moves name:");
				String movesName = sc.nextLine();
				listMoves.add(CreatorHandler.createMoves(movesName));
				break;
				
			case 3:
				System.out.println("          Pokemon");
				System.out.println("===========================");
				for (Pokemon p : listPokemon) {
					System.out.println(p);
				}
				System.out.println("          Moves");
				System.out.println("=========================");
				for (Moves m : listMoves) {
					System.out.println(m);
				}
				System.out.println("          Pokemon Copy");
				System.out.println("================================");
				for (PokemonCopy p : listPokemonCopy) {
					System.out.println(p);
				}
				break;
				
			case 4:
				System.out.println("BYE");
				loop = false;
				break;
	
			default:
				JOptionPane.showMessageDialog(null, "Error!!");
				break;
			}
			
		}
	}

}
