package problems.impl.problem56;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem56SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "972";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem56Solver();
	}
}
