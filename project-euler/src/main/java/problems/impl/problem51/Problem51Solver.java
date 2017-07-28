package problems.impl.problem51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableList;

import common.util.PrimeUtil;
import common.util.StringUtil;
import problems.ProblemSolver;

public class Problem51Solver implements ProblemSolver {

	private static final int PRIME_FAMILY = 8;
	
	private static final char REPLACE_DIGIT_CODE = '*';
	private static final char KEEP_DIGIT_CODE = '.';
	
	private static List<Long> knownPrimes;
	private static Set<Long> knownPrimesSet;
	private static Set<String> digitReplacements;
	private static List<Character> digitReplacementChars;
	
	@Override
	public String solve() {
		
		knownPrimes = new ArrayList<>();
		knownPrimesSet = new HashSet<>();
		digitReplacements = new HashSet<>();
		digitReplacementChars = ImmutableList.of(REPLACE_DIGIT_CODE, KEEP_DIGIT_CODE);
		
		long n = 1;
		long minFromFamily = -1;
		while(minFromFamily < 0) {
			minFromFamily = primeFamily(n);
			n++;
		}
		
		return String.valueOf(minFromFamily);
	}

	private static long primeFamily(long n) {
		if (!PrimeUtil.isPrime(n, knownPrimes)) {
			return -1;
		}
		knownPrimes.add(n);
		knownPrimesSet.add(n);
		String number = String.valueOf(n);
		updateReplacementsIfNeeded(number);
		for (String digitReplacement : digitReplacements) {
			int familyCount = 0;
			long minFromFamily = 0;
			for (int i = 0; i < 10; i++) {
				long alteredNumber = replaceDigits(number, i, digitReplacement);
				if (String.valueOf(alteredNumber).length() == number.length() && isPrime(alteredNumber)) {
					familyCount++;
					if (minFromFamily == 0) {
						minFromFamily = alteredNumber;
					}
				}
			}
			if (familyCount >= PRIME_FAMILY) {
				return minFromFamily;
			}
		}
		return -1;
	}

	private static void updateReplacementsIfNeeded(String number) {
		if (digitReplacements.isEmpty()) {
			digitReplacements = StringUtil.permutations(digitReplacementChars, 1);
			removeNonReplacement(1);
		} else {
			Iterator<String> iterator = digitReplacements.iterator();
			if (number.length() > iterator.next().length()) {
				digitReplacements = StringUtil.permutations(digitReplacementChars, number.length());
				removeNonReplacement(number.length());
			}
		}
		
	}

	private static void removeNonReplacement(int length) {
		char[] nonReplacementChars = new char[length];
		Arrays.fill(nonReplacementChars, KEEP_DIGIT_CODE);
		digitReplacements.remove(new String(nonReplacementChars));
	}

	private static boolean isPrime(long n) {
		if (knownPrimesSet.contains(n)) {
			return true;
		}
		if (n < knownPrimes.get(knownPrimes.size() - 1)) {
			return false;
		}
		return PrimeUtil.isPrime(n);
	}

	private static long replaceDigits(String number, int digit, String digitReplacement) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < number.length(); i++) {
			if (digitReplacement.charAt(i) == REPLACE_DIGIT_CODE) {
				stringBuilder.append(digit);
			} else {
				stringBuilder.append(number.charAt(i));
			}
		}
		return Long.parseLong(stringBuilder.toString());
	}


}
