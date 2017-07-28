package problems.impl.problem52;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem52SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "142857";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem52Solver();
	}
}
