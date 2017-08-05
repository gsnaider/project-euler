package problems.impl.problem54;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem54SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "376";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem54Solver();
	}
}
