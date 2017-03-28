package problems;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public abstract class ProblemSolverTest {

	protected abstract String expectedAnswer();
	protected abstract ProblemSolver solver();
	
	@Test
	public void testSolve() {
		assertThat(solver().solve()).isEqualTo(expectedAnswer());
	}
	
}
