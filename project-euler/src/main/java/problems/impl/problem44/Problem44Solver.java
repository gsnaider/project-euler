package problems.impl.problem44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import problems.ProblemSolver;

public class Problem44Solver implements ProblemSolver {

	private List<Integer> pentagonalsList;
	private Set<Integer> pentagonals;
	private Map<Integer, Integer> pentagonalSums;

	@Override
	public String solve() {

		pentagonalsList = new ArrayList<>();
		pentagonals = new HashSet<>();
		pentagonalSums = new HashMap<>();

		boolean found = false;
		int n = 1;
		int d = 0;
		while (!found) {

			int pentagonal = n * (3 * n - 1) / 2;

			checkPentagonalDifference(pentagonal);
			int pj = checkPentagonalSum(pentagonal);
			found = pj > 0;
			if (found) {
				int pk = pentagonal - pj;
				d = Math.abs(pk - pj);
			}

			pentagonals.add(pentagonal);
			pentagonalsList.add(pentagonal);
			
			n++;
		}

		return String.valueOf(d);
	}

	/**
	 * Checks if {@code sum} corresponds to the sum of two lower pentagonal
	 * numbers. If that's the case, it will return one of the sum terms.
	 * Otherwise, returns {@code -1}.
	 * 
	 * @param sum
	 * @return
	 */
	private int checkPentagonalSum(int sum) {
		if (pentagonalSums.containsKey(sum)) {
			int pentagonal = pentagonalSums.get(sum);
			return pentagonal;
		}
		return -1;
	}

	/**
	 * Checks if {@code pentagonal} has a {@code pentagonalPair} such that
	 * {@code pentagonal - pentagonalPair} is pentagonal. If that's the case, it
	 * will store {@code pentagonal + pentagonalPair} as a key in
	 * {@code pentagonalSums}, with {@code pentagonal} as value, in order to
	 * later check if {@code pentagonal + pentagonalPair} is pentagonal as well.
	 * 
	 * @param pentagonal
	 */
	private void checkPentagonalDifference(int pentagonal) {
		for (int i = pentagonalsList.size() - 1; i >= 0; i--) {
			int otherPentagonal = pentagonalsList.get(i);
			if (pentagonals.contains(pentagonal - otherPentagonal)) {
				pentagonalSums.put(pentagonal + otherPentagonal, pentagonal);
			}
		}
	}

}
