package problems.impl.problem5;

final class Problem5 {

	// private static final int MAX = 10;
	private static final int MAX = 20;

	public static void main(String[] args) {

		int i = 2;
		while (!evenlyDivisible(i)) {
			i += 2;
		}
		System.out.println(i);

	}

	private static boolean evenlyDivisible(int num) {
		for (int i = 1; i <= MAX; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}

}
