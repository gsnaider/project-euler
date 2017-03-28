package problems.impl.problem25;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

final class Problem25 {
	
//	private static final int MAX = 3;
	private static final int MAX = 1000;

	private static final Map<Long, BigInteger> fibonacci = new HashMap<>();

	public static void main(String[] args) {
		
		fibonacci.put(1L, BigInteger.ONE);
		fibonacci.put(2L, BigInteger.ONE);
		
		long i = 3;
		while (fibonacci(i).toString().length() < MAX) {
			i++;
		}
		System.out.println(i);
		
	}

	private static BigInteger fibonacci(long n) {
		Long key = Long.valueOf(n);
		if (!fibonacci.containsKey(key)) {
			fibonacci.put(key, fibonacci(n - 1).add(fibonacci(n - 2)));
		}
		return fibonacci.get(key);
	}

}
