package problems.impl.problem33;

import problems.ProblemSolver;

public class Problem33Solver implements ProblemSolver {

	private static final int MIN = 10;
	private static final int MAX = 99;

	@Override
	public String solve() {
		int denominatorProduct = 1;
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
				double oneDigitFraction = 
						(double) removeDigit(numerator, commonDigit)
						/ removeDigit(denominator, commonDigit);
				if (fraction == oneDigitFraction) {
					denominatorProduct = updateDenominatorProduct(numerator, denominator, denominatorProduct);
				}
			}
		}

		return String.valueOf(denominatorProduct);
	}

	private static int updateDenominatorProduct(int numerator, int denominator, int denominatorProduct) {
		int lowestDenominator = findLowestDenominator(numerator, denominator);
		return denominatorProduct * lowestDenominator;
	}

	private static int findLowestDenominator(int numerator, int denominator) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int removeDigit(int num, int digit) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Returns the common digit between {@code a} and {@code b}, or {@code -1}
	 * if they don't have a common digit or have more than one common digit.
	 */
	private static int findCommonDigit(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
