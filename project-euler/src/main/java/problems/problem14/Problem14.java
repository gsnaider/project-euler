package problems.problem14;

final class Problem14 {

	private static final int MAX = 1000000;
	private static final long[] chains = new long[MAX];
	
	public static void main(String[] args) {

		long maxChain = 0;
		int maxCollatzNum = 0;
		
		for (int i = 1; i < MAX; i++) {
			chains[i] = collatz(i);
			if (chains[i] > maxChain) {
				maxChain = chains[i];
				maxCollatzNum = i;
			}
		}

		System.out.println(maxCollatzNum);
		System.out.println(maxChain);
		
	}

	private static long collatz(long n) {
		long chain = 1;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			if (n < MAX && chains[(int) n] != 0) {
				// Dynamic Programming FTW!
				return chains[(int) n] + chain;
			}
			chain++;
		}
		return chain;
	}

}
