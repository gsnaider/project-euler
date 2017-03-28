package problems.impl.problem3;

import java.util.ArrayList;
import java.util.List;

import problems.ProblemSolver;

public final class Problem3Solver implements ProblemSolver {

//	private static final long NUM = 13195L;
	private static final long NUM = 600851475143L;
	private static final List<Long> primes = new ArrayList<>();
	private static final List<Long> factors = new ArrayList<>();

	@Override
	public String solve() {
		for (long i = 2L; i <= NUM; i++) {
			if (isPrime(i)) {
				primes.add(i);
				if (NUM % i == 0) {
					factors.add(i);
					if (factorsMultiplyToNum()){
						break;
					}
				}
			}
		}
		return String.valueOf(factors.get(factors.size() - 1));
	}
	
	private static boolean factorsMultiplyToNum() {
		long mult = 1;
		for (long factor : factors) {
			mult *= factor;
		}
		return (mult == NUM);
	}

	private static boolean isPrime(long n) {
		for (long prime : primes) {
			if (n % prime == 0) {
				return false;
			}
		}
		return true;
	}
}
