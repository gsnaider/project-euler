package problems.impl.problem16;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem16SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "1366";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem16Solver();
	}

}
