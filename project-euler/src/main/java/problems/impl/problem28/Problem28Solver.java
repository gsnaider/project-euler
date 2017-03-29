package problems.impl.problem28;

import problems.ProblemSolver;

public final class Problem28Solver implements ProblemSolver {

	private static final int SIZE = 5;
//	private static final int SIZE = 1001;
	
	private static final int[][] mat = new int[SIZE][SIZE];

	@Override
	public String solve() {
		
		int row = SIZE / 2;
		int col = SIZE / 2;
		int i = 1;
		mat[row][col] = i;
		while (!(row == 0 && col == SIZE - 1)) {
			i++;
			row = nextRow();
			col = nextCol();
			mat[row][col] = i;
			
		}
		return null;
		
	}

	private static int nextCol() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int nextRow() {
		// TODO Auto-generated method stub
		return 0;
	}
}
