package problems.impl.problem12;

import problems.ProblemSolver;

public final class Problem12Solver implements ProblemSolver {

//	private static final int MIN_FACTORS = 5;
	private static final int MIN_FACTORS = 500;
	
	
	
	@Override
	public String solve() {

		long triangle = 0;
		long i = 1;
		
		while (countFactors(triangle) <= MIN_FACTORS) {
			triangle += i++;
		}
		
		return String.valueOf(triangle);
		
	}

	public static int countFactors(long n) {
		int factors = 0;
		long max = Math.round(Math.sqrt(n));
		for (int i = 1; i <= max; i++) {
			if (n % i == 0) {
				factors += 2;
			}
		}
		
		// Correction for cases where n is a perfect square.
		if (n == max*max) {
			factors--;
		}
		
		return factors;
	}
	
}
