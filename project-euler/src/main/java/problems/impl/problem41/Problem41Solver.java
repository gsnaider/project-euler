package problems.impl.problem41;

import java.util.Set;

import common.util.PrimeUtil;
import common.util.StringUtil;
import problems.ProblemSolver;

// TODO: Try to improve.
public class Problem41Solver implements ProblemSolver {

	@Override
	public String solve() {
		int max = 0;
		String digits = "";
		for (int lastDigit = 1; lastDigit <= 9; lastDigit++) {
			digits += lastDigit;
			Set<String> pandigitals = StringUtil.permutations(digits);
			for (String pandigital : pandigitals) {
				int num = Integer.valueOf(pandigital);
				if (num > max && PrimeUtil.isPrime(num)) {
					max = num;
				}
			}
		}

		return String.valueOf(max);
	}

}
