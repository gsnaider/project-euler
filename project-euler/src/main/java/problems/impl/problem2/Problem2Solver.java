package problems.impl.problem2;

import problems.ProblemSolver;

public final class Problem2Solver implements ProblemSolver {

	private static final int MAX = 4000000;
	
	@Override
	public String solve() {
		int prev = 1;
		int fib = 2;
		
		int sum = 0;
		
		do {
			if (fib % 2 == 0){
				sum += fib;
			}
			int next = prev + fib;
			prev = fib;
			fib = next;
		} while (fib <= MAX);
	
		return String.valueOf(sum);
	}
}
