package problems.impl.problem40;

import problems.ProblemSolver;

public class Problem40Solver implements ProblemSolver {

	private static final int MAX = 1000000;
	
	@Override
	public String solve() throws Exception {
		String fractional = "";
		int i = 0;
		do {
			fractional += i;
			i++;
		} while (fractional.length() <= MAX);
		int d1 = Integer.valueOf(fractional.substring(1, 2));
		int d10 = Integer.valueOf(fractional.substring(10, 11));
		int d100 = Integer.valueOf(fractional.substring(100, 101));
		int d1000 = Integer.valueOf(fractional.substring(1000, 1001));
		int d10000 = Integer.valueOf(fractional.substring(10000, 10001));
		int d100000 = Integer.valueOf(fractional.substring(100000, 100001));
		int d1000000 = Integer.valueOf(fractional.substring(1000000, 1000001));
		

		return String.valueOf(d1 * d10 * d100* d1000* d10000 * d100000 * d1000000);
	}


}
