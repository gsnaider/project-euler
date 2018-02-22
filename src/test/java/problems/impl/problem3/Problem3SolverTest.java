package problems.impl.problem3;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem3SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "6857";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem3Solver();
	}

}
