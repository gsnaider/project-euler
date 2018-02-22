package problems.impl.problem50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import common.util.PrimeUtil;
import problems.ProblemSolver;

public class Problem50Solver implements ProblemSolver {

	private static final int MAX = 1000000;
	
	@Override
	public String solve() {
		
		List<Integer> primes = new ArrayList<>();
		Set<Integer> primeSet = new HashSet<>();
		
		for (int i = 2; i < MAX; i++) {
			if (PrimeUtil.isPrime(i)) {
				primes.add(i);
				primeSet.add(i);
			}
		}
		
		int maxConsecutivePrimes = 0;
		int maxConsecutivePrimeSum = 0;
		for (int i = 0; i < primes.size(); i++) {
			
			int consecutivePrimes = 2;
			int sum = primes.get(i);
			while (i + consecutivePrimes <= primes.size()) {
				sum += primes.get(i + consecutivePrimes - 1);
				if (sum > primes.get(primes.size() - 1)) {
					break;
				}
				if (primeSet.contains(sum)) {
					if (consecutivePrimes > maxConsecutivePrimes) {
						maxConsecutivePrimes = consecutivePrimes;
						maxConsecutivePrimeSum = sum;
					}
				}
				consecutivePrimes++;
			}
			
		}
		
		return String.valueOf(maxConsecutivePrimeSum);
	}


}
