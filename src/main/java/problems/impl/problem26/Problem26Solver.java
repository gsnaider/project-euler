package problems.impl.problem26;

import java.util.HashMap;
import java.util.Map;

import problems.ProblemSolver;

public final class Problem26Solver implements ProblemSolver {

	// private static final int MAX = 11;
	private static final int MAX = 1000;

	@Override
	public String solve() {

		int maxCycle = 0;
		int maxCycleNum = 0;
		for (int d = 2; d < MAX; d++) {
			int cycleLength = calculateCycleLength(d);
			if (cycleLength > maxCycle) {
				maxCycle = cycleLength;
				maxCycleNum = d;
			}
		}
		return String.valueOf(maxCycleNum);
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
