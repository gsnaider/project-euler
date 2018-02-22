package problems.impl.problem37;

import problems.ProblemSolver;
import problems.ProblemSolverTest;

public class Problem37SolverTest extends ProblemSolverTest {

	private static final String ANSWER = "748317";
	
	@Override
	protected String expectedAnswer() {
		return ANSWER;
	}

	@Override
	protected ProblemSolver solver() {
		return new Problem37Solver();
	}
}
