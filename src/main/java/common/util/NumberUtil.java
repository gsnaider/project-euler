package common.util;

public final class NumberUtil {

	private NumberUtil() {
	}

	/**
	 * Returns the greatest common divisor (gcd) between {@code a} and
	 * {@code b}.
	 * 
	 * @param a
	 *            A positive integer.
	 * @param b
	 *            A positive integer.
	 * @throws IllegalArgumentException
	 *             if either {@code a} or {@code b} are not positive.
	 */
	public static int gcd(int a, int b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException();
		}

		int gcd = 1;
		int min = Math.min(a, b);
		for (int divisor = 2; divisor <= min; divisor++) {
			if (a % divisor == 0 && b % divisor == 0) {
				gcd = divisor;
			}
		}
		return gcd;
	}

	public static long factorial(long n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n < 2) {
			return 1;
		}
		long factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	/**
	 * Returns true if {@code num} is a pandigital number. A pandigital number
	 * is a 9-digit number that uses all of the digits 1 to 9 exactly once.
	 * 
	 * @param num
	 *            A non-negative number to be checked if it's pandigital.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code num} is less than 0.
	 */
	public static boolean isPandigital(long num) {
		return isNPandigital(num, 9);
	}

	/**
	 * Returns true if {@code num} is a zero-pandigital number. A
	 * zero-pandigital number is a 10-digit number that uses all of the digits 0
	 * to 9 exactly once. Note that this will also return true if
	 * {@link NumberUtil#isPandigital(num)} is true, since a pandigital number
	 * can have a 0 as the left-most digit and also be zero-pandigital.
	 * 
	 * 
	 * @param num
	 *            A non-negative number to be checked if it's zero-pandigital.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code num} is less than 0.
	 */
	public static boolean isZeroPandigital(long num) {
		return isPandigital(num) || isNZeroPandigital(num, 9);
	}

	/**
	 * Returns true if {@code num} is an {@code n}-pandigital number. An
	 * n-pandigital number is an n-digit number that uses all of the digits 1 to
	 * n exactly once.
	 * 
	 * @param num
	 *            A non-negative number to be checked if it's n-pandigital.
	 * @param n
	 *            A number between 1 and 9 which specifies the digits to use for
	 *            checking the pandigital condition.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code num} is less than 0 or if {@code n} is not between
	 *             1 and 9.
	 */
	public static boolean isNPandigital(long num, int n) {
		if (num < 0 || n < 1 || n > 9) {
			throw new IllegalArgumentException();
		}
		String s = String.valueOf(num);
		if (s.length() != n) {
			return false;
		}
		for (char digit = '1'; digit <= Character.forDigit(n, 10); digit++) {
			if (s.indexOf(digit) < 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns true if {@code num} is an {@code n}-zero-pandigital number. An
	 * n-zero-pandigital number is an (n+1)-digit number that uses all of the
	 * digits 0 to n exactly once.
	 * 
	 * @param num
	 *            A non-negative number to be checked if it's n-pandigital.
	 * @param n
	 *            A number between 0 and 9 which specifies the digits to use for
	 *            checking the pandigital condition.
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code num} is less than 0 or if {@code n} is not between
	 *             0 and 9.
	 */
	private static boolean isNZeroPandigital(long num, int n) {
		if (num < 0 || n < 0 || n > 9) {
			throw new IllegalArgumentException();
		}
		String s = String.valueOf(num);
		if (s.length() != (n + 1)) {
			return false;
		}
		for (char digit = '0'; digit <= Character.forDigit(n, 10); digit++) {
			if (s.indexOf(digit) < 0) {
				return false;
			}
		}
		return true;
	}
}
