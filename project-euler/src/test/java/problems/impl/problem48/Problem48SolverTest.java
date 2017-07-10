package problems.impl.problem48;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem48SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "9110846700";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem48Solver();
	}
}
