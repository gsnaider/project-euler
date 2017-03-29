package problems.impl.problem27;

import common.util.PrimeUtil;

final class Problem27 {

	
//	private static final int MAX_A = 0;
//	private static final int MIN_A = -79;
//	private static final int MAX_B = 1601;
//	private static final int MIN_B = 1000;
	
	private static final int MAX_A = 999;
	private static final int MIN_A = -999;
	private static final int MAX_B = 1000;
	private static final int MIN_B = -1000;
	
	public static void main(String[] args) {

		long maxPrimes = 0;
		long product = 0;
		int bestA = 0;
		int bestB = 0;
		
		
		for (int a = MIN_A; a <= MAX_A; a++) {
			for (int b = MIN_B; b <= MAX_B; b++) {
				long n = 0;
				long possiblePrime;
				do {
					possiblePrime = Math.abs((n + a)*n + b);
					n++;
				} while (PrimeUtil.isPrime(possiblePrime));
				long primes = n - 1;
				if (primes >= maxPrimes) {
					maxPrimes = primes;
					product = a*b;
					bestA = a;
					bestB = b;
				}
			}
		}
		
		System.out.println(product);

	}

}