package problems.impl.problem51;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem51SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "121313";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem51Solver();
	}
}
