package problems.impl.problem19;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem19SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "171";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem19Solver();
	}

}
