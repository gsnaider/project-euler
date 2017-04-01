package problems.impl.problem31;

import problems.ProblemSolver;

public class Problem31Solver implements ProblemSolver {

	private static final int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };
	private static final int MONEY = 200;
	private static final int[][] combinations = new int[coins.length][MONEY];
	
	@Override
	public String solve() {
		int combinations = makeChange(0, 6);
		return String.valueOf(combinations);
	}

	private int makeChange(int maxCoinIdx,int money) {
		if (maxCoinIdx == coins.length - 1) {
			// Only one possible combination using only 1p coins.
			return 1;
		}
		int combinations = 0;
		int coin = coins[maxCoinIdx];
		
		// Calculate combinations without using this coin.
		combinations += makeChange(maxCoinIdx + 1, money);
		
		// Calculate combinations using this coin as many times as possible.
		while (money >= coin) {
			money -= coin;
			combinations += makeChange(maxCoinIdx, money);
		}
		
		return combinations;
	}

}
