package common.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimeUtil {

	/**
	 * Returns the {@code n}th prime number. The number 2 is considered to be
	 * the 1st prime number.
	 * 
	 * @param n
	 *            The index of the prime number to look for. Must be equal or
	 *            greater than 1.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code n} is less than 1.
	 */
	public static long findPrime(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		if (n == 1) {
			return 2;
		}

		int count = 1;
		long i = 3;
		while (count < n) {
			if (isPrime(i)) {
				count++;
			}
			i += 2;
		}
		return i - 2;
	}

	/**
	 * Returns true if {@code n} is a prime number. A prime number is a natural
	 * number greater than 1 that has no positive divisors other than 1 and
	 * itself.
	 * 
	 * @param n
	 *            The number to be checked if it's prime. Must be equal or
	 *            greater than 0.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code n} is less than 0.
	 */
	public static boolean isPrime(long n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n < 2) {
			return false;
		}
		
		// Special case for 2 and even numbers.
		if (n == 2) {
			return true;
		} else if (n % 2 == 0) {
			return false;
		}

		final long sqrt = Math.round(Math.sqrt(n));
		
		// Only check odd numbers up until square root.
		for (int i = 3; i <= sqrt; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the prime factors corresponding to {@code n} as a Map where each
	 * key corresponds to a prime factor, and the value corresponds to the
	 * exponent of that factor.
	 *
	 * @param n
	 *            The number for which to find its prime factors. Must be
	 *            greater than 1.
	 * @param primes
	 *            The list of primes to use for finding factors.
	 * @throws IllegalArgumentException
	 *             if {@code n} is less or equal than 1.
	 */
	public static Map<Long, Integer> primeFactors(long n, List<Long> primes) {
		Map<Long, Integer> factors = new HashMap<>();
		while (n > 1) {
			for (long prime : primes) {
				if (n % prime == 0) {
					if (factors.containsKey(prime)) {
						factors.put(prime, factors.get(prime) + 1);
					} else {
						factors.put(prime, 1);
					}
					n = n / prime;
					break;
				}
			}
		}
		return factors;
	}

}
