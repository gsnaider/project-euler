package problems.impl.problem39;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem39SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "840";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem39Solver();
	}
}
