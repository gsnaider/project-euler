package problems.impl.problem1;

import problems.ProblemSolver;

public final class Problem1Solver implements ProblemSolver {

	@Override
	public String solve() {
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			if(isMultiple(i)) {
				sum += i;
			}
		}
		
		return String.valueOf(sum);
	}
	
	private static boolean isMultiple(int i) {
		return(i % 3 == 0 || i % 5 == 0);
	}

}
