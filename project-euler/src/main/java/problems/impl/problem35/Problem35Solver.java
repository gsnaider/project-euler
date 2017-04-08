package problems.impl.problem35;

import common.util.PrimeUtil;
import problems.ProblemSolver;

public class Problem35Solver implements ProblemSolver {

	private static final int MAX = 1000000;
//	private static final int MAX = 100;

	private static final boolean[] checkedCircularPrime = new boolean[MAX];
	private static final boolean[] isCircularPrime = new boolean[MAX];

	@Override
	public String solve() {
		int circularPrimeCount = 0;
		for (int num = 1; num < MAX; num++) {
			if (isCircularPrime(num)) {
				circularPrimeCount++;
			}
		}

		return String.valueOf(circularPrimeCount);
	}

	private static boolean isCircularPrime(int num) {
		if (checkedCircularPrime[num]) {
			return isCircularPrime[num];
		}

		boolean circularPrime = true;
		String rotation = String.valueOf(num);
		for (int i = 0; i < rotation.length(); i++) {
			if (!PrimeUtil.isPrime(Long.valueOf(rotation))) {
				circularPrime = false;
				break;
			}
			char first = rotation.charAt(0);
			rotation = rotation.substring(1, rotation.length()) + first;
		}

		for (int i = 0; i < rotation.length(); i++) {
			int rotatedNum = Integer.valueOf(rotation);
			checkedCircularPrime[rotatedNum] = true;
			isCircularPrime[rotatedNum] = circularPrime;
			char first = rotation.charAt(0);
			rotation = rotation.substring(1, rotation.length()) + first;
		}

		return circularPrime;
	}

}
