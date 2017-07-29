package problems.impl.problem54.model;

public final class Game {

	private Hand playerOneHand;
	private Hand playerTwoHand;
	
	public Game(Hand playerOneHand, Hand playerTwoHand) {
		this.playerOneHand = playerOneHand;
		this.playerTwoHand = playerTwoHand;
	}
	
	public int winner() {
		if (playerOneHand.compareTo(playerTwoHand) > 0) {
			return 1;
		} else {
			return 2;
		}
	}
	
}
