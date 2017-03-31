package problems.impl.problem31;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

import problems.ProblemSolver;

public class Problem31Solver implements ProblemSolver {

	// TODO: This is now returning possible combinations using only one of each coin.
	
	@Override
	public String solve() {
		final ImmutableSet<Integer> coins = ImmutableSet.of(
				Integer.valueOf(1),
				Integer.valueOf(2),
				Integer.valueOf(5),
				Integer.valueOf(10),
				Integer.valueOf(20),
				Integer.valueOf(50),
				Integer.valueOf(100),
				Integer.valueOf(200));
		int combinations = makeChange(coins, 200);
		return String.valueOf(combinations);
	}

	private int makeChange(Set<Integer> coins, int money) {
		if (coins.size() == 1) {
			return coins.iterator().next().equals(money) ? 1 : 0;
		}
		int combinations = 0;
		for (Integer coin : coins) {
			Set<Integer> newCoins = new HashSet<>(coins);
			newCoins.remove(coin);
			// Calculate combinations of remaining coins when taking and not taking the coin.
			combinations += makeChange(newCoins, money);
			combinations += makeChange(newCoins, money - coin);
		}
		return combinations;
	}
	
	

}
