package problems.impl.problem55;

import java.math.BigInteger;

import common.util.StringUtil;
import problems.ProblemSolver;

public class Problem55Solver implements ProblemSolver {

	private static final int MAX_NUM = 10000;
	private static final int MAX_ITERATIONS = 50;

	@Override
	public String solve() {
		int lychrelCount = 0;
		for (int n = 1; n < MAX_NUM; n++) {
			if (isLychrelNumber(BigInteger.valueOf(n))) {
				lychrelCount++;
			}
		}
		return String.valueOf(lychrelCount);
	}

	private static boolean isLychrelNumber(BigInteger n) {
		int i = 1;
		while (i < MAX_ITERATIONS) {
			n = n.add(reverse(n));
			if (StringUtil.isPalindrome(String.valueOf(n))) {
				return false;
			}
			i++;
		}
		return true;
	}

	private static BigInteger reverse(BigInteger n) {
		return new BigInteger(StringUtil.reverse(String.valueOf(n)));
	}

}
