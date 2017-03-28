package util;

import java.util.ArrayList;
import java.util.List;

public class PrimeUtil {

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
	 * Returns the list of primes that are strictly less than {@code n}.
	 */
	public static List<Long> getPrimesBelow(int n) {
		List<Long> primes = new ArrayList<>();
		if (n <= 2) {
			return primes;
		}
		
		long i = 3;
		while (i < n) {
			if (isPrime(i)) {
				primes.add(i);
			}
			i += 2;
		}
		
		return primes;
		
	}

	public static boolean isPrime(long num) {
		final long sqrt = Math.round(Math.sqrt(num));
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
