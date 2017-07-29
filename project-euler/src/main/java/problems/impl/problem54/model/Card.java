package problems.impl.problem54.model;

public final class Card {

	private final Value value;
	private final Suit suit;
	
	public Card(Value value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}

	public Value getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}
	
}
