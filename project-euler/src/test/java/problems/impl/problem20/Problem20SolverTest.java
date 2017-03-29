package problems.impl.problem20;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem20SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "648";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem20Solver();
	}

}
