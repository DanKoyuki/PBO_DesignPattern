package pdp.FactoryMethod;

public class Moves {
	protected String vMovesName;
	protected int vMovesPower;
	protected int vMovesAccuracy;
	protected String vMovesCategory;
	
	public Moves(String pMovesName, int pMovesPower, int pMovesAccuracy, String pMovesCategory) {
		this.vMovesName = pMovesName;
		this.vMovesPower = pMovesPower;
		this.vMovesAccuracy = pMovesAccuracy;
		this.vMovesCategory = pMovesCategory;
	}
	
	@Override
	public String toString() {
		return "Name: " + vMovesName +
				"\nPower: " + vMovesPower +
				"\nAccuracy: " + vMovesAccuracy +
				"\nCategory: " + vMovesCategory;
	}
}
