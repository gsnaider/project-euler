package problems.impl.problem5;

import problems.ProblemSolver;

public final class Problem5Solver implements ProblemSolver {

	// private static final int MAX = 10;
	private static final int MAX = 20;

	@Override
	public String solve() {
		int i = 2;
		while (!evenlyDivisible(i)) {
			i += 2;
		}
		return String.valueOf(i);
	}

	private static boolean evenlyDivisible(int num) {
		for (int i = 1; i <= MAX; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}
}
