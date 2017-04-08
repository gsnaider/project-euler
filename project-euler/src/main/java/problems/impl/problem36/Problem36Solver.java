package problems.impl.problem36;

import problems.ProblemSolver;

public class Problem36Solver implements ProblemSolver {

	private static final int MAX = 1000000;
	
	@Override
	public String solve() {
		long palindromicSum = 0;
		for (int num = 1; num < MAX; num++) {
			if (isPalindromicBaseTen(num) && isPalindromicBaseTwo(num)) {
				palindromicSum += num;
			}
		}
		return String.valueOf(palindromicSum);
	}

	private boolean isPalindromicBaseTwo(int num) {
		String number = String.valueOf(num);
		return isPalindrome(number);
	}

	private boolean isPalindromicBaseTen(int num) {
		String binary = Integer.toBinaryString(num);
		return isPalindrome(binary);
	}

	private static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
	
}
