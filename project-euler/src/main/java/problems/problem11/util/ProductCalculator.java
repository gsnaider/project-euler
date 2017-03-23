package problems.problem11.util;

public final class ProductCalculator {

	private ProductCalculator() {}
	
	public static long productDown(int row, int col, int[][] matrix) {
		return (matrix[row][col] * matrix[row + 1][col] * matrix[row + 2][col] * matrix[row + 3][col]);
	}
	
	public static long productUp(int row, int col, int[][] matrix) {
		return (matrix[row][col] * matrix[row - 1][col] * matrix[row - 2][col] * matrix[row - 3][col]);
	}
	
	public static long productRight(int row, int col, int[][] matrix) {
		return (matrix[row][col] * matrix[row][col + 1] * matrix[row][col + 2] * matrix[row][col + 3]);
	}
	
	public static long productLeft(int row, int col, int[][] matrix) {
		return (matrix[row][col] * matrix[row][col - 1] * matrix[row][col - 2] * matrix[row][col - 3]);
	}
	
	public static long productDownRight(int row, int col, int[][] matrix) {
		return (matrix[row][col] * matrix[row + 1][col + 1] * matrix[row + 2][col + 2] * matrix[row + 3][col + 3]);
	}
	
	public static long productDownLeft(int row, int col, int[][] matrix) {
		return (matrix[row][col] * matrix[row + 1][col - 1] * matrix[row + 2][col - 2] * matrix[row + 3][col - 3]);
	}
	
	public static long productUpRight(int row, int col, int[][] matrix) {
		return (matrix[row][col] * matrix[row - 1][col + 1] * matrix[row - 2][col + 2] * matrix[row - 3][col + 3]);
	}
	
	public static long productUpLeft(int row, int col, int[][] matrix) {
		return (matrix[row][col] * matrix[row - 1][col - 1] * matrix[row - 2][col - 2] * matrix[row - 3][col - 3]);
	}
	
}
