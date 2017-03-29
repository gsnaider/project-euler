package problems.impl.problem15;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem15SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "233168";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem15Solver();
	}

}
