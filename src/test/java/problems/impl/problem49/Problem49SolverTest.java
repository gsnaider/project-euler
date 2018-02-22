package problems.impl.problem49;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem49SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "296962999629";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem49Solver();
	}
}
