package problems.impl.problem55;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem55SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "249";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem55Solver();
	}
}
