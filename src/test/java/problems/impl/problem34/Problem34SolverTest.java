package problems.impl.problem34;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem34SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "40730";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem34Solver();
	}
}
