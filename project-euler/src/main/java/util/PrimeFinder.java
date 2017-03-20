package util;

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
		// time. Maybe checking primes.size().
		primes.clear();

		primes.add(2L);

		long i = 3;
		while (primes.size() < n) {
			if (isPrime(i)) {
				primes.add(i);
			}
			i += 2;
		}
		return primes.get(primes.size() - 1);
	}

	/**
	 * Returns the list of primes that are strictly less than {@code n}.
	 */
	public static List<Long> getPrimesBelow(int n) {

		if (n <= 2) {
			return new ArrayList<>();
		}
		
		// TODO: Find a way to cache the primes instead of deleting them every
		// time. Maybe checking primeCount.
		primes.clear();
		
		primes.add(2L);
		
		long i = 3;
		while (i < n) {
			if (isPrime(i)) {
				primes.add(i);
			}
			i += 2;
		}
		
		return new ArrayList<>(primes);
		
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
