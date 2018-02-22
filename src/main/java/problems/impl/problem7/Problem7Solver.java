package problems.impl.problem7;

import common.util.PrimeUtil;

import problems.ProblemSolver;

public final class Problem7Solver implements ProblemSolver {

//	private static final int N = 6;
	private static final int N = 10001;
	
	
	@Override
	public String solve() {
		
		return String.valueOf(PrimeUtil.findPrime(N));

	}

}
