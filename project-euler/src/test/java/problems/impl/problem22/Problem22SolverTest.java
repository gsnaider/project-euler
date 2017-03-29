package problems.impl.problem22;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem22SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "233168";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem22Solver();
	}

}
