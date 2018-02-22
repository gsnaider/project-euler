package problems.impl.problem10;

import common.util.PrimeUtil;

import problems.ProblemSolver;

public final class Problem10Solver implements ProblemSolver {

	// private static final int MAX = 10;
	private static final int MAX = 2000000;

	@Override
	public String solve() {

		long sum = 2;

		long i = 3;
		while (i < MAX) {
			if (PrimeUtil.isPrime(i)) {
				sum += i;
			}
			i += 2;
		}
		return String.valueOf(sum);
	}
}
