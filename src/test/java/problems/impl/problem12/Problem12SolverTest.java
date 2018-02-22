package problems.impl.problem12;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem12SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "76576500";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem12Solver();
	}

}
