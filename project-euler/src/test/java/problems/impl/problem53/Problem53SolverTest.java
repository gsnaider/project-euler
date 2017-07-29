package problems.impl.problem53;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem53SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "4075";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem53Solver();
	}
}
