package problems.impl.problem54.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.collect.ImmutableList;

import problems.impl.problem54.model.Card;
import problems.impl.problem54.model.Hand;
import problems.impl.problem54.model.Suit;
import problems.impl.problem54.model.Value;
import problems.impl.problem54.model.rank.HandRank;
import problems.impl.problem54.model.rank.Rank;

public final class RankEvaluator {

	public static HandRank evaluateRank(Hand hand) {
		Rank rank = null;

		List<Integer> values = new ArrayList<>();
		if (allValuesDifferent(hand)) {
			boolean flush = flush(hand);
			if (straight(hand)) {
				if (flush) {
					if (royalFlush(hand)) {
						rank = Rank.ROYAL_FLUSH;
					} else {
						rank = Rank.STRAIGHT_FLUSH;
						orderValues(hand, values);
					}
				} else {
					rank = Rank.STRAIGHT;
				}
			} else if (flush) {
				rank = Rank.FLUSH;
				orderValues(hand, values);
			} else {
				rank = Rank.HIGH_CARD;
				orderValues(hand, values);
			}
		} else {
			if (fourOfAKind(hand, values)) {
				rank = Rank.FOUR_OF_A_KIND;
			}
			if (fullHouse(hand, values)) {
				rank = Rank.FULL_HOUSE;
			}
			if (flush(hand)) {
				rank = Rank.FLUSH;
				orderValues(hand, values);
			}
			if (threeOfAKind(hand, values)) {
				rank = Rank.THREE_OF_A_KIND;
			}
			if (twoPairs(hand, values)) {
				rank = Rank.TWO_PAIRS;
			}
			if (onePair(hand, values)) {
				rank = Rank.ONE_PAIR;
			}
		}
		ImmutableList.Builder<Integer> valuesBuilder = ImmutableList.builder();
		valuesBuilder.addAll(values);
		return new HandRank(rank, valuesBuilder.build());
	}

	private static boolean allValuesDifferent(Hand hand) {
		Set<Integer> values = new HashSet<>();
		for (Card card : hand.getCards()) {
			values.add(card.getValue().number());
		}
		return (values.size() == hand.getCards().size());
	}

	private static void orderValues(Hand hand, List<Integer> values) {
		for (Card card : hand.getCards()) {
			values.add(card.getValue().number());
		}
		Collections.sort(values, Comparator.reverseOrder());
	}
	
	private static boolean onePair(Hand hand, List<Integer> values) {
		Map<Integer, Integer> valuesCount = countCardValues(hand);
		boolean isPair = valuesCount.size() == 4 && valuesCount.containsValue(2);
		if (isPair) {
			int pairValue = 0;
			for (Entry<Integer, Integer> count : valuesCount.entrySet()) {
				if (count.getValue().equals(1)) {
					values.add(count.getKey());
				} else {
					pairValue = count.getKey();
				}
			}
			Collections.sort(values, Comparator.reverseOrder());
			values.add(0, pairValue);
		}
		return isPair;
	}

	private static boolean twoPairs(Hand hand, List<Integer> values) {
		Map<Integer, Integer> valuesCount = countCardValues(hand);
		boolean isTwoPairs = valuesCount.size() == 3 && valuesCount.containsValue(2);
		if (isTwoPairs) {
			int remainingNumber = 0;
			for (Entry<Integer, Integer> count : valuesCount.entrySet()) {
				if (count.getValue().equals(2)) {
					values.add(count.getKey());
				} else {
					remainingNumber = count.getKey();
				}
			}
			Collections.sort(values, Comparator.reverseOrder());
			values.add(remainingNumber);
		}
		return isTwoPairs;
	}

	private static boolean threeOfAKind(Hand hand, List<Integer> values) {
		Map<Integer, Integer> valuesCount = countCardValues(hand);
		boolean isThreeOfAKind = false;
		isThreeOfAKind = valuesCount.size() == 3 && valuesCount.containsValue(3);
		if (isThreeOfAKind) {
			int threeValue = 0;
			for (Entry<Integer, Integer> count : valuesCount.entrySet()) {
				if (count.getValue().equals(3)) {
					threeValue = count.getKey();
				} else {
					values.add(count.getKey());
				}
			}
			Collections.sort(values, Comparator.reverseOrder());
			values.add(0, threeValue);
		}
		return isThreeOfAKind;
	}

	private static boolean fullHouse(Hand hand, List<Integer> values) {
		Map<Integer, Integer> valuesCount = countCardValues(hand);
		boolean isFullHouse = valuesCount.size() == 2 && valuesCount.containsValue(3);
		if (isFullHouse) {
			for (Entry<Integer, Integer> count : valuesCount.entrySet()) {
				if (count.getValue().equals(3)) {
					values.add(0, count.getKey());
				} else {
					values.add(1, count.getKey());
				}
			}
		}
		return isFullHouse;
	}

	private static boolean fourOfAKind(Hand hand, List<Integer> values) {
		Map<Integer, Integer> valuesCount = countCardValues(hand);
		boolean isFourOfAKind = valuesCount.size() == 2 && valuesCount.containsValue(4);
		if (isFourOfAKind) {
			for (Entry<Integer, Integer> count : valuesCount.entrySet()) {
				if (count.getValue().equals(4)) {
					values.add(0, count.getKey());
				} else {
					values.add(1, count.getKey());
				}
			}
		}
		return isFourOfAKind;
	}

	private static boolean straight(Hand hand) {
		List<Integer> sortedValues = new ArrayList<>();
		for (Card card : hand.getCards()) {
			sortedValues.add(card.getValue().number());
		}
		Collections.sort(sortedValues);
		int previousNumber = 0;
		for (int number : sortedValues) {
			if (previousNumber != 0) {
				if (number - 1 != previousNumber) {
					return false;
				}
			}
			previousNumber = number;
		}
		return true;
	}

	private static boolean flush(Hand hand) {
		Set<Suit> suits = new HashSet<>();
		for (Card card : hand.getCards()) {
			suits.add(card.getSuit());
		}
		return suits.size() == 1;
	}

	private static boolean royalFlush(Hand hand) {
		for (Card card : hand.getCards()) {
			if (card.getValue().equals(Value.ACE)) {
				return true;
			}
		}
		return false;
	}

	private static Map<Integer, Integer> countCardValues(Hand hand) {
		Map<Integer, Integer> valuesCount = new HashMap<>();
		for (Card card : hand.getCards()) {
			int number = card.getValue().number();
			if (valuesCount.containsKey(number)) {
				valuesCount.put(number, valuesCount.get(number) + 1);
			} else { 
				valuesCount.put(number, 1);
			}
		}
		return valuesCount;
	}
}
