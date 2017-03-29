package problems.impl.problem6;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem6SolverTest extends ProblemSolverTest {
	
	private static final String ANSWER = "25164150";

	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem6Solver();
	}

}
