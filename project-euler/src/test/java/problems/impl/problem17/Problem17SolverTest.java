package problems.impl.problem17;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem17SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "21124";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem17Solver();
	}

}
