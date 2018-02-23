package problems.impl.problem57;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem57SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "153";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem57Solver();
	}
}
