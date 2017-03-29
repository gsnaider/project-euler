package problems.impl.problem6;

import problems.ProblemSolver;

public final class Problem6Solver implements ProblemSolver {

//	private static final int MAX = 10;
	private static final int MAX = 100;
	
	@Override
	public String solve() {
		int sum = 0;
		int sumOfSquares = 0;
		
		for (int i = 1; i <= MAX; i++) {
			sum += i;
			sumOfSquares += i*i;
		}
		
		return String.valueOf(sum*sum - sumOfSquares);
		
	}

}
