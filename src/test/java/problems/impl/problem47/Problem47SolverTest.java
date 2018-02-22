package problems.impl.problem47;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem47SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "134043";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem47Solver();
	}
}
