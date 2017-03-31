package problems.impl.problem30;

import problems.ProblemSolver;

public class Problem30Solver implements ProblemSolver {

	// TODO: Find a cleverer way to determine when to stop looking.
	private static final int MAX = 200000;
	
	private static final int POW = 5;
	
	@Override
	public String solve() {
		int sum = 0;
		for (int i = 2; i < MAX; i++) {
			if (sumOfPowers(i) == i) {
				sum += i;
			}
		}
		return String.valueOf(sum);
	}

	private int sumOfPowers(int num) {
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, POW);
			num /= 10;
		}
		return sum;
	}

}
