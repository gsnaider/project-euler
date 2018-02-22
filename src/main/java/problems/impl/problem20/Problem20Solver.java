package problems.impl.problem20;

import java.math.BigInteger;

import problems.ProblemSolver;

public final class Problem20Solver implements ProblemSolver {

//	private static final int MAX = 10;
	private static final int MAX = 100;
	
	
	@Override
	public String solve() {

		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= MAX; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		String digits = fact.toString();
		long sum = 0;
		for (int i = 0; i < digits.length(); i++) {
			int digit = Character.digit(digits.charAt(i), 10);
			sum += digit;
		}
		return String.valueOf(sum);
		
	}
	
}
