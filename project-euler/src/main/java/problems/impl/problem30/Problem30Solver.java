package problems.impl.problem30;

import problems.ProblemSolver;

public class Problem30Solver implements ProblemSolver {

	private static final int POW = 5;
	
	@Override
	public String solve() {
		int max = findMax();
		int sum = 0;
		for (int i = 2; i < max; i++) {
			if (sumOfPowers(i) == i) {
				sum += i;
			}
		}
		return String.valueOf(sum);
	}

	private static int findMax() {
		int maxDigitPow = (int) Math.pow(9, 5);
		int max = 10;
		int digits = 2;
		while (max < digits*maxDigitPow) {
			max *= 10;
			digits++;
		}
		return max;
	}

	private static int sumOfPowers(int num) {
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, POW);
			num /= 10;
		}
		return sum;
	}

}
