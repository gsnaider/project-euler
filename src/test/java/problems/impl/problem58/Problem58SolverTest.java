package problems.impl.problem58;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem58SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "26241";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem58Solver();
	}
}
