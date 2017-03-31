package problems.impl.problem29;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem29SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "9183";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem29Solver();
	}

}
