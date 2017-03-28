package problems.impl.problem10;

import util.PrimeUtil;

final class Problem10 {

//	private static final int MAX = 10;
	private static final int MAX = 2000000;
	
	public static void main(String[] args) {
		
		long sum = 2;
		
		long i = 3;
		while (i < MAX) {
			if (PrimeUtil.isPrime(i)) {
				sum += i;
			}
			i += 2;
		}
		System.out.println(sum);
	}
}
