package problems.impl.problem18;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public final class Problem18SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "1074";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem18Solver();
	}

}
