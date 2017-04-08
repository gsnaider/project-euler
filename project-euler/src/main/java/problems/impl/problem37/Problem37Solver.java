package problems.impl.problem37;

import common.util.PrimeUtil;
import problems.ProblemSolver;

public class Problem37Solver implements ProblemSolver {

	private static final int TRUNCATABLE_PRIMES = 11;

	@Override
	public String solve() {
		int sum = 0;
		int truncatablePrimesFound = 0;
		int num = 1;
		while (truncatablePrimesFound < TRUNCATABLE_PRIMES) {
			if (isTruncatablePrimeFromLeft(num) && isTruncatablePrimeFromRight(num)) {
				truncatablePrimesFound++;
				sum += num;
			}
			num++;
		}
		return String.valueOf(sum);
	}

	private static boolean isTruncatablePrimeFromRight(int num) {
		if (num < 10) {
			return false;
		}

		while (num > 0) {
			if (!PrimeUtil.isPrime(num)) {
				return false;
			}
			num /= 10;
		}

		return true;
	}

	private static boolean isTruncatablePrimeFromLeft(int num) {
		if (num < 10) {
			return false;
		}

		int divisor = (int) Math.pow(10, String.valueOf(num).length() - 1);
		while (num > 0) {
			if (!PrimeUtil.isPrime(num)) {
				return false;
			}
			num %= divisor;
			divisor /= 10;
		}

		return true;
	}

}
