package problems.impl.problem11.util;

import static problems.impl.problem11.util.Constants.COLS;
import static problems.impl.problem11.util.Constants.PRODUCT_FACTORS;
import static problems.impl.problem11.util.Constants.ROWS;


public final class DirectionValidator {
	
	private DirectionValidator() {}
	
	public static boolean checkDown(int row, int col) {
		return (row <= ROWS - PRODUCT_FACTORS);
	}

	public static boolean checkUp(int row, int col) {
		return (row >= PRODUCT_FACTORS - 1);
	}
	
	public static boolean checkRight(int row, int col) {
		return (col <= COLS - PRODUCT_FACTORS);
	}
	
	public static boolean checkLeft(int row, int col) {
		return (col >= PRODUCT_FACTORS - 1);
	}

	public static boolean checkDownRight(int row, int col) {
		return (checkDown(row, col) && checkRight(row, col));
	}
	
	public static boolean checkDownLeft(int row, int col) {
		return (checkDown(row, col) && checkLeft(row, col));
	}

	public static boolean checkUpRight(int row, int col) {
		return (checkUp(row, col) && checkRight(row, col));
	}
	
	public static boolean checkUpLeft(int row, int col) {
		return (checkUp(row, col) && checkLeft(row, col));
	}
	
}
