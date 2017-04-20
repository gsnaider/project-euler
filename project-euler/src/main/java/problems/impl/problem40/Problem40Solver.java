package problems.impl.problem40;

import problems.ProblemSolver;

public class Problem40Solver implements ProblemSolver {

	private static final int MAX = 1000000;

	@Override
	public String solve() {
		int product = 1;
		int currentDigit = 1;
		int i = 1;
		do {
			i++;
			String num = String.valueOf(i);
			for (int d = currentDigit + 1; d <= currentDigit + num.length(); d++) {
				if (d == 10 || d == 100 || d == 1000 || d == 10000 || d == 100000 || d == 1000000) {
					product *= Integer.valueOf(num.substring(d - currentDigit - 1, d - currentDigit));
				}
			}
			currentDigit += num.length();
		} while (currentDigit <= MAX);

		return String.valueOf(product);
	}

}
