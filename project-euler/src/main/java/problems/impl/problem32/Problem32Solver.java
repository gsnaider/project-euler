package problems.impl.problem32;

import java.util.HashSet;
import java.util.Set;

import problems.ProblemSolver;

public class Problem32Solver implements ProblemSolver {

	// TODO: Try to improve.
	private static final int MAX = 9876543;
	
	@Override
	public String solve() {

		final Set<Long> products = new HashSet<>();
		
		for (int i = 1; i <= MAX; i++) {
			for (int j = 1; j <= MAX; j++) {
				
				long res = i * j;
				if (isPanDigital(i, j, res)) {
					products.add(res);
				}
				
			}
		}
		
		long sum = 0;
		for (long product : products) {
			sum += product;
		}
		return String.valueOf(sum);
	}

	private boolean isPanDigital(int i, int j, long res) {
		String digits = String.valueOf(i) + String.valueOf(j) + String.valueOf(res);
		if (digits.length() != 9) {
			return false;
		}
		for (int digit = 1; digit <= 9; digit++) {
			// TODO: Try to improve.
			if (digits.indexOf("" + digit) < 0){
				return false;
			}
		}
		return true;
		
	}

}
