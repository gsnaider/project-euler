package problems.impl.problem27;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem27SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "-59231";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem27Solver();
	}

}
