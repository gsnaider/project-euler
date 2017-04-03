package common.util;

public final class NumberUtil {

	private NumberUtil() {}

	/**
	 * Returns the greatest common divisor (gcd) between {@code a} and {@code b}.
	 * @param a A positive integer.
	 * @param b A positive integer.
	 * @throws IllegalArgumentException if either {@code a} or {@code b} are not positive.
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
	
}
