package problems.impl.problem35;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem35SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "55";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem35Solver();
	}
}
