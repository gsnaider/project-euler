package problems.impl.problem7;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem7SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "104743";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem7Solver();
	}

}
