package problems.impl.problem39;

import problems.ProblemSolver;

public class Problem39Solver implements ProblemSolver {

	private static final int MAX_P = 1000;

	@Override
	public String solve() {
		int maxSolutions = 0;
		int maxP = 0;
		for (int p = 3; p <= MAX_P; p++) {
			int solutions = calculateSolutions(p);
			if (solutions > maxSolutions) {
				maxSolutions = solutions;
				maxP = p;
			}
		}
		return String.valueOf(maxP);
	}

	private static int calculateSolutions(int p) {
		int solutions = 0;
		for (int a = 1; a <= p - 2; a++) {
			for (int b = 1; b <= a; b++) {
				if (isRightTriangle(a, b, p)) {
					solutions++;
				}
			}
		}
		return solutions;
	}

	private static boolean isRightTriangle(int a, int b, int p) {
		int expectedC = a*a + b*b;
		int c = p - a - b;
		c *= c;
		return c == expectedC;
	}

}
