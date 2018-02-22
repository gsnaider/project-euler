package problems.impl.problem43;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem43SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "16695334890";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem43Solver();
	}
}
