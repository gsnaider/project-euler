package problems.impl.problem50;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem50SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "997651";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem50Solver();
	}
}
