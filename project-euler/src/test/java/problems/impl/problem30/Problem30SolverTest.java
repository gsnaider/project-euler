package problems.impl.problem30;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem30SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "443839";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem30Solver();
	}
}
