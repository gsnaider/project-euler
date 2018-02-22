package problems.impl.problem9;

import exception.NoSolutionFoundException;
import problems.ProblemSolver;

public final class Problem9Solver implements ProblemSolver {

	private static final int SUM = 1000;
	
	@Override
	public String solve() throws NoSolutionFoundException {
		
		for (int a = 1; a < SUM - 3; a++) {
			for (int b = a + 1; b < SUM - 2; b++) {
				for (int c = b + 1; c < SUM - 1; c++) {
					if (isPythagoreanTriplet(a,b,c) && (a + b + c == SUM)) {
						return String.valueOf(a*b*c);
					}
				}
			}
		}
		throw new NoSolutionFoundException();

	}

	private static boolean isPythagoreanTriplet(int a, int b, int c) {
		return (a*a + b*b == c*c);
	}

}
