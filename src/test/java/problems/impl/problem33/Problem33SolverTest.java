package problems.impl.problem33;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem33SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "100";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem33Solver();
	}
}
