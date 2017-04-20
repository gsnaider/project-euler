package problems.impl.problem41;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem41SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "7652413";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem41Solver();
	}
}
