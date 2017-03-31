package problems.impl.problem28;

import problems.ProblemSolver;

public final class Problem28Solver implements ProblemSolver {

	// private static final int SIZE = 5;
	private static final int SIZE = 1001;

	private static final int[][] mat = new int[SIZE][SIZE];

	@Override
	public String solve() {
		fillMatrix();
		long sum = sumDiaonals();
		return String.valueOf(sum);
	}

	private long sumDiaonals() {
		long sum = 0;
		for (int i = 0; i < SIZE; i++) {
			sum += mat[i][i];
			sum += mat[i][SIZE - i - 1];
		}
		// Middle element has been added twice.
		sum -= mat[SIZE / 2][SIZE / 2];
		return sum;
	}

	private void fillMatrix() {
		int row = SIZE / 2;
		int col = SIZE / 2;
		int num = 1;
		mat[row][col] = num;

		int verticalMoves = 1;
		int horizontalMoves = 1;
		Movement nextMovement = Movement.HORIZONTAL;

		do {
			if (nextMovement.equals(Movement.HORIZONTAL)) {
				if (horizontalMoves > 0) {
					for (int i = 0; i < horizontalMoves; i++) {
						num++;
						col++;
						if (col == SIZE) {
							// We have reached the end of the spiral.
							col--;
							break;
						}
						mat[row][col] = num;
					}
					horizontalMoves = -horizontalMoves - 1;
				} else {
					for (int i = 0; i > horizontalMoves; i--) {
						num++;
						col--;
						mat[row][col] = num;
					}
					horizontalMoves = -horizontalMoves + 1;
				}
				nextMovement = Movement.VERTICAL;
			} else {
				if (verticalMoves > 0) {
					for (int i = 0; i < verticalMoves; i++) {
						num++;
						row++;

						mat[row][col] = num;
					}
					verticalMoves = -verticalMoves - 1;
				} else {
					for (int i = 0; i > verticalMoves; i--) {
						num++;
						row--;
						mat[row][col] = num;
					}
					verticalMoves = -verticalMoves + 1;
				}
				nextMovement = Movement.HORIZONTAL;
			}
		} while (!(row == 0 && col == SIZE - 1));
	}
}
