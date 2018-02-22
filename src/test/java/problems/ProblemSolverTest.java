package problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public abstract class ProblemSolverTest {

	protected abstract String expectedAnswer();
	protected abstract ProblemSolver solver();
	
	@Test
	public void testSolve() throws Exception {
		assertThat(solver().solve()).isEqualTo(expectedAnswer());
	}
	
}
