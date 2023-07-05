package pdp.FactoryMethod;

import pdp.Prototype.PokemonCopy;

public class Pokemon implements PokemonCopy{
	protected String vPokemonName;
	protected int vPokemonHP;
	protected int vPokemonATK;
	protected int vPokemonDEF;
	protected int vPokemonSPA;
	protected int vPokemonSPD;
	protected int vPokemonSPE;
	
	public Pokemon(String pPokemonName, int pPokemonHP, int pPokemonATK, int pPokemonDEF, int pPokemonSPA, int pPokemonSPD, int pPokemonSPE) {
		
		this.vPokemonName = pPokemonName;
		this.vPokemonHP = pPokemonHP;
		this.vPokemonATK = pPokemonATK;
		this.vPokemonDEF = pPokemonDEF;
		this.vPokemonSPA = pPokemonSPA;
		this.vPokemonSPD = pPokemonSPD;
		this.vPokemonSPE = pPokemonSPE;
		
	}
	
	// Builder Version
	public Pokemon(String pPokemonName) {
		this.vPokemonName = pPokemonName;
	}
	
	public Pokemon withHP(int pPokemonHP) {
		this.vPokemonHP = pPokemonHP;
		return this;
	}
	
	public Pokemon withATK(int pPokemonATK) {
		this.vPokemonATK = pPokemonATK;
		return this;
	}
	
	public Pokemon withDEF(int pPokemonDEF) {
		this.vPokemonDEF = pPokemonDEF;
		return this;
	}
	
	public Pokemon withSPA(int pPokemonSPA) {
		this.vPokemonSPA = pPokemonSPA;
		return this;
	}
	
	public Pokemon withSPD(int pPokemonSPD) {
		this.vPokemonSPD = pPokemonSPD;
		return this;
	}
	
	public Pokemon withSPE(int pPokemonSPE) {
		this.vPokemonSPE = pPokemonSPE;
		return this;
	}
	
	// Prototype Desing
	@Override
	public PokemonCopy clone() {
		return new Pokemon(vPokemonName, vPokemonHP, vPokemonATK, vPokemonDEF, vPokemonSPA, vPokemonSPD, vPokemonSPE);
	}
	
	@Override
	public String toString() {
		return "Pokemon Name: " + vPokemonName +
				"\nStat: " + vPokemonHP + " " + vPokemonATK + " " + vPokemonDEF + " " + vPokemonSPA + " " + vPokemonSPD + " " + vPokemonSPE;
	}
	
}
