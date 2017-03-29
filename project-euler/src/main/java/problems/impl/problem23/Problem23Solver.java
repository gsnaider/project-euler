package problems.impl.problem23;

import java.util.HashSet;
import java.util.Set;

import problems.ProblemSolver;

public final class Problem23Solver implements ProblemSolver {

	private static final int MAX = 28123;
//	private static final int[] abundantNumbers = new int[MAX];

	private static final Set<Integer> abundantNumbers = new HashSet<>();
	
	@Override
	public String solve() {
		long notAbundantSum = 0;
		int idx = 0;
		for (int i = 1; i <= MAX; i++) {
			if (isAbundant(i)) {
				abundantNumbers.add(i);
			}
		}
		for (int i = 1; i <= MAX; i++) {
			if (!isSumOfAbundant(i)) {
				notAbundantSum += i;
			}
		}
		return String.valueOf(notAbundantSum);
	}

	private static boolean isSumOfAbundant(int n) {
		for (int a : abundantNumbers) {
			if (abundantNumbers.contains(n - a)) {
				return true;
			}
		}
		return false;
	}
	
//	private static boolean isSumOfAbundant(int n) {
//		for (int a : abundantNumbers) {
//			if (a >= n) {
//				break;
//			}
//			for (int b : abundantNumbers) {
//				if (b > a || b > (n - a)) {
//					break;
//				}
//				if (a + b == n) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}

	private static boolean isAbundant(int n) {
		// 1 is always a proper divisor.
		int divisorsSum = 1;
		
		long sqrt = Math.round(Math.sqrt(n));
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0) {
				divisorsSum += i;
				divisorsSum += n / i;
			}
		}

		// Correction for perfect square.
		if (n == sqrt*sqrt) {
			divisorsSum -= sqrt;
		}
		
		return divisorsSum > n;
	}

}
