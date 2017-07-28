package problems.impl.problem52;

import java.util.HashMap;
import java.util.Map;

import problems.ProblemSolver;

public class Problem52Solver implements ProblemSolver {

	private static final int MAX_PRODUCT = 6;
	
	@Override
	public String solve() {
		
		long n = 2;
		while(!sameDigits(n)) {
			n++;
		}
		
		return String.valueOf(n);
	}

	private static boolean sameDigits(long n) {
		Map<Character, Integer> digitsCount = getDigitsCount(n);
		for (int i = 2; i <= MAX_PRODUCT; i++) {
			if (!getDigitsCount(n*i).equals(digitsCount)) {
				return false;
			}
		}
		return true;
	}

	private static Map<Character, Integer> getDigitsCount(long n) {
		String number = String.valueOf(n);
		Map<Character, Integer> digitsCount = new HashMap<>();
		for (Character c : number.toCharArray()) {
			if (digitsCount.containsKey(c)) {
				digitsCount.put(c, digitsCount.get(c) + 1);
			} else {
				digitsCount.put(c, 1);
			}
		}
		return digitsCount;
	}


}
