package problems.impl.problem56;

import java.math.BigInteger;

import problems.ProblemSolver;

public class Problem56Solver implements ProblemSolver {

	private static final int MAX = 100;

	@Override
	public String solve() {
		
		int maxDigitSum = 0;
		
		for (int a = 1; a < MAX; a++) {
			for (int b = 1; b < MAX; b++) {
				int digitSum = digitSum(BigInteger.valueOf(a).pow(b));
				if (digitSum > maxDigitSum) {
					maxDigitSum = digitSum;
				}
			}
		}
		
		return String.valueOf(maxDigitSum);
	}

	private static int digitSum(BigInteger n) {
		String digits = n.toString();
		int digitSum = 0;
		for (char c : digits.toCharArray()) {
			digitSum += Character.digit(c, 10);
		}
		return digitSum;
	}
}
