package problems.impl.problem34;

import common.util.NumberUtil;
import problems.ProblemSolver;

public class Problem34Solver implements ProblemSolver {

	@Override
	public String solve() {
		int max = findMax();
		int sum = 0;
		for (int i = 2; i < max; i++) {
			if (isFactorialSum(i)) {
				sum += i;
			}
		}
		return String.valueOf(sum);
	}

	private static int findMax() {
		int maxDigitFact = (int) NumberUtil.factorial(9);
		int max = 10;
		int digits = 2;
		while (max < digits * maxDigitFact) {
			max *= 10;
			digits++;
		}
		return max;
	}

	private static boolean isFactorialSum(int num) {
		if (num < 10) {
			// One-digit nums are not considered a sum of digits.
			return false;
		}
		int factorialSum = 0;
		int aux = num;
		while (aux > 0) {
			int digit = aux % 10;
			factorialSum += NumberUtil.factorial(digit);
			aux /= 10;
		}
		return num == factorialSum;
	}
	
}
