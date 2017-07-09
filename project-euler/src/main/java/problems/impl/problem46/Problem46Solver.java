package problems.impl.problem46;

import java.util.ArrayList;
import java.util.List;

import common.util.PrimeUtil;
import problems.ProblemSolver;

public class Problem46Solver implements ProblemSolver {

	private List<Long> primes = new ArrayList<>();
	
	@Override
	public String solve() {

		boolean found = false;
		
		long n = 1;
		while(!found) {
			n += 2;
			if (PrimeUtil.isPrime(n)) {
				primes.add(n);
			} else {
				found = !checkGoldbach(n);
			}
		}
		
		return String.valueOf(n);
	}

	private boolean checkGoldbach(long n) {
		for (long prime : primes) {
			long testNum = 0;
			long square = 1;
			while (testNum < n) {
				testNum = prime + 2* square*square;
				if (testNum == n) {
					return true;
				}
				square++;
			}
		}
		return false;
	}

}
