package problems.impl.problem43;

import java.util.Set;

import com.google.common.collect.ImmutableList;

import common.util.StringUtil;
import problems.ProblemSolver;

public class Problem43Solver implements ProblemSolver {

	private static final ImmutableList<Integer> divisors = ImmutableList.of(2, 3, 5, 7, 11, 13, 17);

	@Override
	public String solve() {
		long sum = 0;
		Set<String> pandigitals = StringUtil.permutations("0123456789");
		for (String pandigital : pandigitals) {
			boolean property = true;
			for (int i = 1; i <= divisors.size(); i++) {
				String subNumber = pandigital.substring(i, i + 3);
				int num = Integer.parseInt(subNumber);
				if (num % divisors.get(i - 1) != 0) {
					property = false;
					break;
				}
			}
			if (property) {
				sum += Long.parseLong(pandigital);
			}
		}
		return String.valueOf(sum);
	}

}
