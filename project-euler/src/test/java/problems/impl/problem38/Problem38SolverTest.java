package problems.impl.problem38;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem38SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "932718654";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem38Solver();
	}
}
