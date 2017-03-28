package problems.impl.problem10;

final class Problem10 {

//	private static final int MAX = 10;
	private static final int MAX = 2000000;
	
	public static void main(String[] args) {
		
		long sum = 2;
		
		long i = 3;
		while (i < MAX) {
			if (isPrime(i)) {
				sum += i;
			}
			i += 2;
		}
		
		System.out.println(sum);
		
	}


	private static boolean isPrime(long num) {
		final long sqrt = Math.round(Math.sqrt(num));
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
