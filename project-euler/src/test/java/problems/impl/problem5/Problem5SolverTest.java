package problems.impl.problem5;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem5SolverTest extends ProblemSolverTest {
	
	private static final String ANSWER = "232792560";

	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem5Solver();
	}

}
