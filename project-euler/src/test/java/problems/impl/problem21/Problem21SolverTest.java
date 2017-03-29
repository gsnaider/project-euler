package problems.impl.problem21;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem21SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "31626";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem21Solver();
	}

}
