package problems.impl.problem31;

import problems.ProblemSolver;

public class Problem31Solver implements ProblemSolver {

	private static final int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };
	private static final int MONEY = 200;

	@Override
	public String solve() {
		int combinations = 0;
		for (int coinIdx = 0; coinIdx < coins.length; coinIdx++) {
			combinations += makeChangeStartingWithCoin(coinIdx, MONEY);
		}
		return String.valueOf(combinations);
	}

	/**
	 * Returns the possible {@code coins} combinations to form {@code money},
	 * using at least one coin of {@code coins[coinIdx]} and lower denomination
	 * coins.
	 */
	private static int makeChangeStartingWithCoin(int coinIdx, int money) {
		int coin = coins[coinIdx];
		if (coin == money) {
			// Only one possibility: take only one of this coin.
			return 1;
		} else if (coin > money) {
			// No way to form money using this coin.
			return 0;
		}
		int combinations = 0;
		for (int i = coinIdx; i < coins.length; i++) {
			combinations += makeChangeStartingWithCoin(i, money - coin);
		}
		return combinations;
	}
}
