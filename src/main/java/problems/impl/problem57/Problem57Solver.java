package problems.impl.problem57;

import org.apache.commons.math3.fraction.BigFraction;

import problems.ProblemSolver;

public class Problem57Solver implements ProblemSolver {

	private static final int EXPANSIONS = 1000;

	@Override
	public String solve() {
		
		BigFraction previous = BigFraction.ZERO;
		int result = 0;
		for (int i = 0; i < EXPANSIONS; i++) {
			BigFraction expansion = BigFraction.ONE.add(BigFraction.ONE.divide(BigFraction.TWO.add(previous)));
			previous = expansion.subtract(BigFraction.ONE);
			if (expansion.getNumerator().toString().length() > expansion.getDenominator().toString().length()) {
				result++;
			}
		}
		return String.valueOf(result);
	}

}
