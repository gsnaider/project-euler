package problems.impl.problem57;

import org.apache.commons.math3.fraction.BigFraction;

import problems.ProblemSolver;

public class Problem57Solver implements ProblemSolver {

	private static final int EXPANSIONS = 1000;

	@Override
	public String solve() {
		
		double previous = 0;
		int result = 0;
		for (int i = 0; i < EXPANSIONS; i++) {
			double expansion = 1 + 1/(2 + previous);
			previous = expansion - 1;
			
			BigFraction fraction = new BigFraction(expansion);
			if (fraction.getNumerator().toString().length() > fraction.getDenominator().toString().length()) {
				result++;
			}
			
		}
		return String.valueOf(result);
	}

}
