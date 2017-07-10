package problems.impl.problem48;

import java.math.BigInteger;

import problems.ProblemSolver;

public class Problem48Solver implements ProblemSolver {

	
	private static final int MAX = 1000;
	
	@Override
	public String solve() {

		BigInteger answer = BigInteger.ZERO;
		
		for (int i = 1; i <= MAX; i++) {
			answer = answer.add(BigInteger.valueOf(i).pow(i));
		}
		String digits = answer.toString();
		return digits.substring(digits.length() - 10);
	}

}
