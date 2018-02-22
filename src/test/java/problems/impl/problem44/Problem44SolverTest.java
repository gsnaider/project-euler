package problems.impl.problem44;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem44SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "5482660";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem44Solver();
	}
}
