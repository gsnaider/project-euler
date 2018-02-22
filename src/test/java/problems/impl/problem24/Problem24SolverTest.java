package problems.impl.problem24;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem24SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "2783915460";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem24Solver();
	}

}
