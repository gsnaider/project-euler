package problems.impl.problem28;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem28SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "669171001";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem28Solver();
	}

}
