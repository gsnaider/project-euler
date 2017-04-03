package problems.impl.problem33;

import common.util.NumberUtil;
import problems.ProblemSolver;

public class Problem33Solver implements ProblemSolver {

	private static final int MIN = 10;
	private static final int MAX = 99;

	@Override
	public String solve() {

		int denominatorProduct = 1;
		int numeratorProduct = 1;
		for (int numerator = MIN; numerator < MAX; numerator++) {
			for (int denominator = numerator + 1; denominator <= MAX; denominator++) {
				// It is enough to search for just one common digit. If they had
				// two common digits, when canceling one of them
				// we would get a fraction equal to 1.
				int commonDigit = findCommonDigit(numerator, denominator);
				if (commonDigit <= 0) {
					// We pass on numbers that don't share a common digit, or
					// they common digit is 0.
					continue;
				}
				double fraction = (double) numerator / denominator;
				double oneDigitFraction = (double) removeDigit(numerator, commonDigit)
						/ removeDigit(denominator, commonDigit);
				if (fraction == oneDigitFraction) {
					numeratorProduct *= numerator;
					denominatorProduct *= denominator;
				}
			}
		}
		
		int gcd = NumberUtil.gcd(numeratorProduct, denominatorProduct);
		return String.valueOf(denominatorProduct / gcd);
	}

	/**
	 * Returns the digit of {@code num} that is not equal to {@code digit}
	 * 
	 * @param num
	 *            A positive two digit number.
	 * @param digit
	 *            The digit to remove from {@code num}. Must be a digit present
	 *            in {@code num}.
	 */
	private static int removeDigit(int num, int digit) {
		int firstDigit = num / 10;
		if (firstDigit == digit) {
			return num % 10;
		} else {
			return firstDigit;
		}
	}

	/**
	 * Returns the common digit between {@code a} and {@code b}, or {@code -1}
	 * if they don't have a common digit or have more than one common digit.
	 * 
	 * @param a
	 *            A positive two digit number.
	 * @param b
	 *            A positive two digit number.
	 * 
	 */
	private static int findCommonDigit(int a, int b) {

		int[] aDigits = { a / 10, a % 10 };
		int[] bDigits = { b / 10, b % 10 };

		int commonDigitsCount = 0;
		int commonDigit = -1;
		for (int aDigit : aDigits) {
			for (int bDigit : bDigits) {
				if (aDigit == bDigit) {
					commonDigit = aDigit;
					commonDigitsCount++;
				}
			}
		}

		if (commonDigitsCount == 1) {
			return commonDigit;
		} else {
			return -1;
		}

	}
}
