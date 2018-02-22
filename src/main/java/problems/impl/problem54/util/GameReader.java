package problems.impl.problem54.util;

import static problems.impl.problem54.model.Suit.CLUBS;
import static problems.impl.problem54.model.Suit.DIAMONDS;
import static problems.impl.problem54.model.Suit.HEARTS;
import static problems.impl.problem54.model.Suit.SPADES;
import static problems.impl.problem54.model.Value.ACE;
import static problems.impl.problem54.model.Value.EIGHT;
import static problems.impl.problem54.model.Value.FIVE;
import static problems.impl.problem54.model.Value.FOUR;
import static problems.impl.problem54.model.Value.JACK;
import static problems.impl.problem54.model.Value.KING;
import static problems.impl.problem54.model.Value.NINE;
import static problems.impl.problem54.model.Value.QUEEN;
import static problems.impl.problem54.model.Value.SEVEN;
import static problems.impl.problem54.model.Value.SIX;
import static problems.impl.problem54.model.Value.TEN;
import static problems.impl.problem54.model.Value.THREE;
import static problems.impl.problem54.model.Value.TWO;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import problems.impl.problem54.model.Card;
import problems.impl.problem54.model.Game;
import problems.impl.problem54.model.Hand;
import problems.impl.problem54.model.Poker;
import problems.impl.problem54.model.Suit;
import problems.impl.problem54.model.Value;

public final class GameReader {
	
	private static final int VALUE_IDX = 0;
	private static final int SUIT_IDX = 1;
	
	private static final ImmutableMap<Character, Value> values;
	private static final ImmutableMap<Character, Suit> suits;
	
	
	static {
		ImmutableMap.Builder<Character, Value> valuesBuilder = ImmutableMap.builder();
		valuesBuilder.put('2', TWO);
		valuesBuilder.put('3', THREE);
		valuesBuilder.put('4', FOUR);
		valuesBuilder.put('5', FIVE);
		valuesBuilder.put('6', SIX);
		valuesBuilder.put('7', SEVEN);
		valuesBuilder.put('8', EIGHT);
		valuesBuilder.put('9', NINE);
		valuesBuilder.put('T', TEN);
		valuesBuilder.put('J', JACK);
		valuesBuilder.put('Q', QUEEN);
		valuesBuilder.put('K', KING);
		valuesBuilder.put('A', ACE);
		values = valuesBuilder.build();
		
		ImmutableMap.Builder<Character, Suit> suitsBuilder = ImmutableMap.builder();
		suitsBuilder.put('C', CLUBS);
		suitsBuilder.put('D', DIAMONDS);
		suitsBuilder.put('S', SPADES);
		suitsBuilder.put('H', HEARTS);
		suits = suitsBuilder.build();
	}
	
	public static Game read(String gameCode) {
		String[] cards = gameCode.split(" ");
		ImmutableSet.Builder<Card> playerOneCardsBuilder = ImmutableSet.builder();
		for (int i = 0; i < Poker.ALLOWED_CARDS; i++) {
			Card card = readCard(cards[i]);
			playerOneCardsBuilder.add(card);
		}
		
		ImmutableSet.Builder<Card> playerTwoCardsBuilder = ImmutableSet.builder();
		for (int i = Poker.ALLOWED_CARDS; i < cards.length; i++) {
			Card card = readCard(cards[i]);
			playerTwoCardsBuilder.add(card);
		}
		
		return new Game(new Hand(playerOneCardsBuilder.build()), new Hand(playerTwoCardsBuilder.build()));
	}

	private static Card readCard(String cardCode) {
		char valueCode = cardCode.charAt(VALUE_IDX);
		char suitCode = cardCode.charAt(SUIT_IDX);
		return new Card(values.get(valueCode), suits.get(suitCode));
	}
	
}
