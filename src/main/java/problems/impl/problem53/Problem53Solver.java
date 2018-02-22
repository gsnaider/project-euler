package problems.impl.problem53;

import java.math.BigInteger;

import problems.ProblemSolver;

public class Problem53Solver implements ProblemSolver {

	private static final int MAX_N = 100;
	private static final BigInteger MIN_COMBINATORIAL = BigInteger.valueOf(1000000);
	
	
	private static BigInteger[] factorials;
	
	@Override
	public String solve() {
		factorials = new BigInteger[MAX_N + 1];
		
		int greaterCombinatorials = 0;
		for (int n = 1; n <= MAX_N; n++) {
			for (int r = 1; r <= n; r++) {
				if (combinatorial(n, r).compareTo(MIN_COMBINATORIAL) > 0) {
					greaterCombinatorials++;
				}
			}
		}
		
		return String.valueOf(greaterCombinatorials);
	}

	private static BigInteger combinatorial(int n, int r) {
		return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
	}

	private static BigInteger factorial(int n) {
		BigInteger factorial;
		if (factorials[n] != null) {
			return factorials[n];
		} else if (n < 2) {
			factorial = BigInteger.ONE;
		} else {
			factorial = factorial(n - 1).multiply(BigInteger.valueOf(n));
		}
		factorials[n] = factorial;
		return factorial;
	}

}
