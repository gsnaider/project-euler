package problems.impl.problem10;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem10SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "142913828922";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem10Solver();
	}

}
