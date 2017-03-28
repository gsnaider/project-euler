package problems.problem23;

final class Problem23 {

	private static final int MAX = 28123;
	private static final int[] abundantNumbers = new int[MAX];
	
	public static void main(String[] args) {
		long abundantSum = 0;
		int idx = 0;
		for (int i = 1; i <= MAX; i++) {
			if (isAbundant(i)) {
				abundantNumbers[idx++] = i;
			}
			if (!isSumOfAbundant(i)) {
				abundantSum += i;
			}
		}
		System.out.println(abundantSum);
	}

	private static boolean isSumOfAbundant(int n) {
		for (int a : abundantNumbers) {
			if (a >= n) {
				break;
			}
			for (int b : abundantNumbers) {
				if (b > a) {
					break;
				}
				if (a + b == n) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isAbundant(int n) {
		// 1 is always a proper divisor.
		int divisorsSum = 1;
		
		long sqrt = Math.round(Math.sqrt(n));
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0) {
				divisorsSum += i;
				divisorsSum += n / i;
			}
		}

		// Correction for perfect square.
		if (n == sqrt*sqrt) {
			divisorsSum -= sqrt;
		}
		
		return divisorsSum > n;
	}

}
