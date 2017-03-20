package problems.problem3;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {

	private static final long NUM = 600851475143L;
	private static final List<Long> primes = new ArrayList<>();
	private static final List<Long> factors = new ArrayList<>();

	public static void main(String[] args) {

		final long maxPosibleFactor = NUM / 2;
		primes.add(2L);
		
		for (long i = 3L; i <= maxPosibleFactor; i++) {

			if (isPrime(i)) {
				primes.add(i);
				if (NUM % i == 0) {
					factors.add(i);
				}
			}
		}

		System.out.println(factors.get(factors.size() - 1));

	}

	private static boolean isPrime(long i) {
		for (long prime : primes) {
			if (i % prime == 0) {
				return false;
			}
		}
		return true;
	}

}
