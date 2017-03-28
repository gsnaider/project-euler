package problems.impl.problem26;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

final class Problem26 {

//	private static final int MAX = 11;
	 private static final int MAX = 1000;
	

	public static void main(String[] args) {
		
		int maxCycle = 0;
		int maxCycleNum = 0;
//		MathContext mc = MathContext.DECIMAL128;
		for (int d = 2; d < MAX; d++) {
//			System.out.println(String.format("%d / %d = %s", 1, d, BigDecimal.ONE.divide(BigDecimal.valueOf(d), mc)));
			int cycleLength = calculateCycleLength(d);
//			System.out.println(String.format("Cycle length: %d", cycleLength));
			if (cycleLength > maxCycle) {
				maxCycle = cycleLength;
				maxCycleNum = d;
			}
		}
//		System.out.println(maxCycle);
		System.out.println(maxCycleNum);
		

	}

	private static int calculateCycleLength(int d) {
		int remainder = 1 % d;
		final Map<Integer, Integer> remaindersCount = new HashMap<>();
		int count = 0;
		while (remainder != 0 && !remaindersCount.containsKey(remainder)) {
			remaindersCount.put(remainder, count++);
			remainder = (remainder * 10) % d;
		}
		if (remainder == 0) {
			return 0;
		} else {
			return remaindersCount.size() - remaindersCount.get(remainder);
		}
		
	}
}
