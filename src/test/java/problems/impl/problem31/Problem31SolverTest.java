package problems.impl.problem31;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem31SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "73682";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem31Solver();
	}
}
