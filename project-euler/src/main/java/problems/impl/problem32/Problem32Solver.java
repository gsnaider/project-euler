package problems.impl.problem32;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import problems.ProblemSolver;

public class Problem32Solver implements ProblemSolver {

	// If any of the factors has 5 or more digits, the total number of digits of
	// the factors would be 6 or more.
	// The lowest product of two numbers whose digits sum 6 or more, gives as a
	// 5 digit number. So the total number of digits between the factors and the
	// product would be 11 digits in total, and that cannot be a pandigital
	// product.
	private static final int MAX = 9999;

	@Override
	public String solve() {

		final Set<Long> products = new HashSet<>();
		final List<Integer> nonRepeatingDigits = new ArrayList<>();

		for (int i = 1; i < MAX; i++) {
			if (!hasRepeatingDigits(i)) {
				nonRepeatingDigits.add(i);
			}
		}

		for (int i = 0; i < nonRepeatingDigits.size(); i++) {
			for (int j = 0; j < i; j++) {
				int a = nonRepeatingDigits.get(i);
				int b = nonRepeatingDigits.get(j);
				long res = a * b;
				if (isPanDigital(a, b, res)) {
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

	private static boolean hasRepeatingDigits(int n) {
		String num = String.valueOf(n);
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (num.indexOf(c) != num.lastIndexOf(c)) {
				return true;
			}
		}
		return false;
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
