package problems.impl.problem54.model;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

import problems.impl.problem54.model.rank.HandRank;
import problems.impl.problem54.model.rank.Rank;
import problems.impl.problem54.util.RankEvaluator;

public final class Hand implements Comparable<Hand> {

	private ImmutableSet<Card> cards;

	public Hand(ImmutableSet<Card> cards) {
		if (cards.size() != Poker.ALLOWED_CARDS) {
			throw new IllegalArgumentException();
		}
		this.cards = cards;
	}

	public Set<Card> getCards() {
		return cards;
	}

	@Override
	public int compareTo(Hand that) {
		HandRank thisRank = this.rank();
		HandRank thatRank = that.rank();
		if (thisRank.compareTo(thatRank) > 0) {
			return 1;
		} else {
			return -1;
		}
	}

	private HandRank rank() {
		return RankEvaluator.evaluateRank(this);
	}

}
