package problems.problem10;

public class Problem10 {

//	private static final int MAX = 10;
	private static final int MAX = 2000000;
	
	private static final long[] primes = new long[MAX];

	
	public static void main(String[] args) {
		
		primes[0] = 2;
		int primeCount = 1;
		long sum = 2;
		
		long i = 3;
		while (i < MAX) {
			if (isPrime(i, primeCount)) {
				primes[primeCount] = i;
				primeCount++;
				sum += i;
			}
			i += 2;
		}
		
		System.out.println(sum);
		
	}


	private static boolean isPrime(long num, int primeCount) {
		for (int i = 0; i < primeCount; i++) {
			if (num % primes[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
