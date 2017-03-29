package problems.impl.problem25;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem25SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "4782";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem25Solver();
	}

}
