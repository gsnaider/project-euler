package problems.impl.problem21;

import problems.ProblemSolver;

public final class Problem21Solver implements ProblemSolver {

	private static final int MAX = 10000;
	
	@Override
	public String solve() {
		
		
		final long[] divisorsSum = new long[MAX];
		
		long amicableNumbersSum = 0;
		for (int i = 0; i < MAX; i++) {
			int sum = sumDivisors(i);
			divisorsSum[i] = sum;
			if (sum < i && divisorsSum[sum] == i) {
				amicableNumbersSum += i + sum;
			}
		}
		return String.valueOf(amicableNumbersSum);

	}

	public static int sumDivisors(int n) {
		if (n < 2) {
			return n;
		}
		int divisorsSum = 0;
		long sqrt = Math.round(Math.sqrt(n));
		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) {
				divisorsSum += i;
				divisorsSum += n / i;
			}
		}
		
		// Correction for cases where n is a perfect square.
		if (n == sqrt*sqrt) {
			divisorsSum -= sqrt;
		}
		
		// Proper divisors don't include the number itself.
		divisorsSum -= n;
		
		return divisorsSum;
	}
	
}
