package problems.impl.problem38;

import common.util.NumberUtil;
import problems.ProblemSolver;

public class Problem38Solver implements ProblemSolver {

	/*
	 * The concatenated product of 10000 and (1,2) is 1000020000, which is a
	 * ten-digit number. So any concatenated product of a number above 10000 can
	 * never be pandigital.
	 * 
	 */
	private static final int MAX = 10000;

	private static final int MAX_N = 9;

	@Override
	public String solve() {
		int max = 0;
		for (int num = 1; num < MAX; num++) {
			String concatenatedProduct = String.valueOf(num);
			for (int n = 2; n <= MAX_N; n++) {
				String newProduct = String.valueOf(num * n);
				if (!isPossiblePandigital(concatenatedProduct, newProduct)) {
					break;
				}
				concatenatedProduct += newProduct;
				if (isPanDigital(concatenatedProduct)) {
					int product = Integer.valueOf(concatenatedProduct);
					if (product > max) {
						max = product;
					}
					break;
				}
			}
		}
		return String.valueOf(max);
	}

	private static boolean isPossiblePandigital(String num, String newNum) {
		if ((num + newNum).length() > 9) {
			return false;
		}
		for (int i = 0; i < newNum.length(); i++) {
			if (num.contains(newNum.substring(i, i + 1))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPanDigital(String num) {
		return NumberUtil.isPandigital(Long.valueOf(num));
	}

}
