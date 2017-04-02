package problems.impl.problem32;

import java.util.HashSet;
import java.util.Set;

import problems.ProblemSolver;

public class Problem32Solver implements ProblemSolver {

	// If any of the factors has 5 or more digits, the total number of digits of
	// the factors would be 6 or more.
	// The lowest product of two numbers whose digits count is 6 or more, gives
	// as a
	// 5 digit number. So the total number of digits between the factors and the
	// product would be 11 digits in total, and that cannot be a pandigital
	// product.
	private static final int MAX_FACTOR = 9999;
	private static final int MAX_FACTORS_DIGITS = 5;

	@Override
	public String solve() {

		final Set<Long> products = new HashSet<>();

		for (int i = 1; i <= MAX_FACTOR; i++) {
			for (int j = 1; j < i; j++) {
				int factorsDigitCount = (String.valueOf(i) + String.valueOf(j)).length();
				if (factorsDigitCount > MAX_FACTORS_DIGITS) {
					break;
				}
				long res = i * j;
				if (isPanDigital(i, j, res)) {
					products.add(res);
				}
			}
		}

		long sum = 0;
		for (long product : products) {
			sum += product;
		}
		return String.valueOf(sum);
	}

	private boolean isPanDigital(int i, int j, long res) {
		String digits = String.valueOf(i) + String.valueOf(j) + String.valueOf(res);
		if (digits.length() != 9) {
			return false;
		}
		for (char digit = '1'; digit <= '9'; digit++) {
			if (digits.indexOf(digit) < 0) {
				return false;
			}
		}
		return true;
	}
}
