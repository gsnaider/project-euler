	package problems.impl.problem9;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem9SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "31875000";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem9Solver();
	}

}
