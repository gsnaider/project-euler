package problems.impl.problem13;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem13SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "5537376230";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem13Solver();
	}

}
