package problems.impl.problem41;

import common.util.NumberUtil;
import common.util.PrimeUtil;
import problems.ProblemSolver;

// TODO: Try to improve.
public class Problem41Solver implements ProblemSolver {

	// The largest n-digit pandigital number.
	private static final int MAX = 987654321;

	@Override
	public String solve() {
		int max = 0;
		for (int i = 1; i <= MAX; i++) {
			String num = String.valueOf(i);
			if (NumberUtil.isNPandigital(i, num.length())) {
				if (PrimeUtil.isPrime(i)) {
					max = i;
				}
			}
		}

		return String.valueOf(max);
	}

}
