package problems.impl.problem47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import common.util.PrimeUtil;
import problems.ProblemSolver;

public class Problem47Solver implements ProblemSolver {

	private static final int CONSECUTIVE_NUMBERS = 4;
	
	private List<Map<Long, Integer>> previousFactors = new LinkedList<>();
	
	private List<Long> primes = new ArrayList<>();
	
	@Override
	public String solve() {

		long n = 2;
		while (previousFactors.size() < CONSECUTIVE_NUMBERS) {
			if (PrimeUtil.isPrime(n)) {
				primes.add(n);
			}
			previousFactors.add(PrimeUtil.primeFactors(n, primes));
			n++;
		}
		
		while (!distinctConsecutiveFactors()) {
			if (PrimeUtil.isPrime(n)) {
				primes.add(n);
			}
			previousFactors.remove(0);
			previousFactors.add(PrimeUtil.primeFactors(n, primes));
			n++;
		}

		return String.valueOf(n - CONSECUTIVE_NUMBERS);
	}
	
	private boolean distinctConsecutiveFactors() {
		Set<Entry<Long, Integer>> consecutiveFactors = new HashSet<>();
		for (Map<Long, Integer> factors : previousFactors) {
			if (factors.size() != CONSECUTIVE_NUMBERS) {
				return false;
			}
			for (Entry<Long, Integer> factor : factors.entrySet()) {
				if (!consecutiveFactors.add(factor)) {
					return false;
				}
			}
		}
		return true;
	}

}
