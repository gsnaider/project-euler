package problems.impl.problem2;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem2SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "4613732";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem2Solver();
	}

}
