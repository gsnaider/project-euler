package problems.impl.problem54.model;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

public final class Hand implements Comparable<Hand> {

	private static final int ALLOWED_CARDS = 5;

	private ImmutableSet<Card> cards;

	public Hand(ImmutableSet<Card> cards) {
		if (cards.size() != ALLOWED_CARDS) {
			throw new IllegalArgumentException();
		}
		this.cards = cards;
	}

	public Set<Card> getCards() {
		return cards;
	}

	@Override
	public int compareTo(Hand that) {
		// TODO Auto-generated method stub
		return 0;
	}

}
