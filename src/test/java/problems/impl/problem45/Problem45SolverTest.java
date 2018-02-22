package problems.impl.problem45;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem45SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "1533776805";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem45Solver();
	}
}
