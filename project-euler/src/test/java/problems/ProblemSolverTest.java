package problems;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public abstract class ProblemSolverTest {

	protected abstract String expectedAnswer();
	protected abstract ProblemSolver solver();
	
	@Test
	public void solveTest() {
		assertEquals(expectedAnswer(), solver().solve());
	}
	
	
}
