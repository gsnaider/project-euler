package common.util;

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
		final long sqrt = Math.round(Math.sqrt(n));
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
