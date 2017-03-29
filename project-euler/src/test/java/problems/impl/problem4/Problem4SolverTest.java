package problems.impl.problem4;

import problems.ProblemSolver;
import problems.ProblemSolverTest;



public final class Problem4SolverTest extends ProblemSolverTest {
	private static final String ANSWER = "906609";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem4Solver();
	}

}
