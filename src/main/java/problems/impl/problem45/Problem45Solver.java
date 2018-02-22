package problems.impl.problem45;

import java.util.HashSet;
import java.util.Set;

import problems.ProblemSolver;

public class Problem45Solver implements ProblemSolver {

	private static final long MIN = 285;

	@Override
	public String solve() {

		Set<Long> triangles = new HashSet<>();
		Set<Long> pentagonals = new HashSet<>();
		Set<Long> hexagonals = new HashSet<>();

		long n = 1;
		Long solution = null;
		while (solution == null) {

			long t = n * (n + 1) / 2;
			long p = n * (3 * n - 1) / 2;
			long h = n * (2 * n - 1);
			
			if (n > MIN) {
				if (pentagonals.contains(t) && hexagonals.contains(t)) {
					solution = t;
				}
			}
			
			
			triangles.add(t);
			pentagonals.add(p);
			hexagonals.add(h);
			n++;
		}

		return String.valueOf(solution);
	}

}
