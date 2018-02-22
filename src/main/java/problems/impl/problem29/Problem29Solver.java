package problems.impl.problem29;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import problems.ProblemSolver;

public class Problem29Solver implements ProblemSolver {

//	private static final int MAX = 5;
	 private static final int MAX = 100;

	@Override
	public String solve() {
		final Set<BigInteger> results = new HashSet<>();
		for (int a = 2; a <= MAX; a++) {
			for (int b = 2; b <= MAX; b++) {
				results.add(BigInteger.valueOf(a).pow(b));
			}
		}
		return String.valueOf(results.size());
	}

}
