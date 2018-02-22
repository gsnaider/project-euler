package problems.impl.problem42;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem42SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "162";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem42Solver();
	}
}
