package problems.impl.problem59;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem59SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "107359";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem59Solver();
	}
}
