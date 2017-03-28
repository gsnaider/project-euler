package problems.impl.problem27;

import util.PrimeUtil;

final class Problem27 {

	private static final int MAX_A = 999;
	private static final int MIN_A = -999;
	private static final int MAX_B = 1000;
	private static final int MIN_B = -1000;
	
	public static void main(String[] args) {

		long maxPrimes = 0;
		int product = 0;
		
		for (int a = MIN_A; a <= MAX_A; a++) {
			for (int b = MIN_B; b <= MAX_B; b++) {
				int n = 0;
				int possiblePrime = (n + a)*n + b;
				if (PrimeUtil.isPrime(possiblePrime)){
					
				}
				
			}
		}

	}

}
