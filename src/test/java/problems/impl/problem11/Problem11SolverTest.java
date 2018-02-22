package problems.impl.problem11;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem11SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "70600674";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem11Solver();
	}

}
