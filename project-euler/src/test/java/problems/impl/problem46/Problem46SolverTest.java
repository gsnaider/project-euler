package problems.impl.problem46;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem46SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "5777";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem46Solver();
	}
}
