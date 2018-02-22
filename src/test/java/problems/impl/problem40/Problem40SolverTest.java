package problems.impl.problem40;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem40SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "210";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem40Solver();
	}
}
