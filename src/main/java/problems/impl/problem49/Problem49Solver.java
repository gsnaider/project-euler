package problems.impl.problem49;

import java.util.Arrays;

import common.util.PrimeUtil;
import problems.ProblemSolver;

public class Problem49Solver implements ProblemSolver {

	private static final int MIN = 1000;
	private static final int MAX = 9999;
	
	private static final int INVALID_ANSWER = 1487;
	
	@Override
	public String solve() {
		for (int n = MIN; n <= MAX; n++) {
			if (n == INVALID_ANSWER) {
				continue;
			}
			
			int increment = 1;
			int secondNumber = n + increment;
			int thirdNumber = secondNumber + increment;
			while (thirdNumber <= MAX) {
				if (checkPermutations(n, secondNumber, thirdNumber) && checkPrimes(n, secondNumber, thirdNumber)) {
					return String.format("%d%d%d", n, secondNumber, thirdNumber);
				}
				increment++;
				secondNumber = n + increment;
				thirdNumber = secondNumber + increment;
			}
		}
		return null;
	}

	private boolean checkPermutations(int i, int j, int k) {
		char[] iChars = String.valueOf(i).toCharArray();
		char[] jChars = String.valueOf(j).toCharArray();
		char[] kChars = String.valueOf(k).toCharArray();
		
		Arrays.sort(iChars);
		Arrays.sort(jChars);
		Arrays.sort(kChars);
		
		for (int idx = 0; idx < iChars.length; idx++) {
			char c = iChars[idx];
			if (c != jChars[idx] || c != kChars[idx]) {
				return false;
			}
		}
		return true;
		
	}

	private boolean checkPrimes(int i, int j, int k) {
		return PrimeUtil.isPrime(i) && PrimeUtil.isPrime(j) && PrimeUtil.isPrime(k);
	}

}
