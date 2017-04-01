package problems.impl.problem31;

import problems.ProblemSolver;

public class Problem31Solver implements ProblemSolver {

	private static final int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };
	private static final int MONEY = 1000;
	private static final int[][] memo = new int[coins.length][MONEY + 1];
	
	private static final int UNINITIALIZED = -1;
	
	@Override
	public String solve() {
		for (int i = 0; i < memo.length; i++) {
			for (int j = 0; j < memo[i].length; j++) {
				memo[i][j] = UNINITIALIZED;
			}
		}
		
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
		if (memo[coinIdx][money] != UNINITIALIZED) {
			return memo[coinIdx][money];
		}
		int combinations;
		int coin = coins[coinIdx];
		if (coin == money) {
			// Only one possibility: take only one of this coin.
			combinations = 1;
		} else if (coin > money) {
			// No way to form money using this coin.
			combinations = 0;
		} else {
			combinations = 0;
			for (int i = coinIdx; i < coins.length; i++) {
				combinations += makeChangeStartingWithCoin(i, money - coin);
			}
		}
		memo[coinIdx][money] = combinations;
		return combinations;
	}
}
