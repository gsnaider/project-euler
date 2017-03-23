package problems.problem15;

public class Problem15 {

	private static final int ROWS = 20;
	private static final int COLS = 20;

	private static final long[][] routes = new long[ROWS + 1][COLS + 1];

	public static void main(String[] args) {
		System.out.println(routes(0, 0));
	}

	private static long routes(int i, int j) {
		if (routes[i][j] != 0) {
			return routes[i][j];
		}
		if (i == ROWS || j == COLS) {
			routes[i][j] = 1;
		} else {
			routes[i][j] = routes(i, j + 1) + routes(i + 1, j);
		}
		return routes[i][j];

	}
}
