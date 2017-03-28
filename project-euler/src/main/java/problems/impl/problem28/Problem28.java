package problems.impl.problem28;

final class Problem28 {

	private static final int SIZE = 5;
//	private static final int SIZE = 1001;
	
	private static final int[][] mat = new int[SIZE][SIZE];

	public static void main(String[] args) {
		
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
