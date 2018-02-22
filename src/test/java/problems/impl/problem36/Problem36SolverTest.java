package problems.impl.problem36;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem36SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "872187";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem36Solver();
	}
}
