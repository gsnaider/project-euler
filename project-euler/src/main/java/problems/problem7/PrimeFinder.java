package problems.problem7;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

	private static final List<Long> primes = new ArrayList<>();

	/**
	 * Returns the {@code n}th prime number. The number 2 is considered to be
	 * the 1st prime number.
	 * 
	 * @param n
	 *            The index of the prime number to look for. Must be equal or
	 *            greater than 1.
	 */
	public static long findPrime(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}

		// TODO: Find a way to cache the primes instead of deleting them every
		// time. Maybe checking primeCount.
		primes.clear();
		
		primes.add(2L);
		int primeCount = 1;
		
		long i = 3;
		while (primeCount < n) {
			if (isPrime(i)) {
				primes.add(i);
				primeCount++;
			}
			i += 2;
		}
		return primes.get(primeCount - 1);
	}

	private static boolean isPrime(long n) {
		for (long prime : primes) {
			if (n % prime == 0) {
				return false;
			}
		}
		return true;
	}

}
