package problems.impl.problem32;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem32SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "45228";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem32Solver();
	}
}
