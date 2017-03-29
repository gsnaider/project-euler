package problems.impl.problem16;

import java.math.BigInteger;

import problems.ProblemSolver;

public final class Problem16Solver implements ProblemSolver {

//	private static final int EXP = 15;
	private static final int EXP = 1000;
	
	@Override
	public String solve() {
		
		BigInteger two = new BigInteger("2");
		String result = two.pow(EXP).toString();
		
		long sum = 0;
		for (int i = 0; i < result.length(); i++) {
			int digit = Character.digit(result.charAt(i), 10);
			sum += digit;
		}
		return String.valueOf(sum);
	}

}
