package problems.problem67;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import util.BinaryTreeNode;

public class Problem67 {

	// private static final int[][] nums =
	// {{3},
	// {7, 4},
	// {2, 4, 6},
	// {8, 5, 9, 3}};

	// private static final int[][] nums =
	// {{75},
	// {95, 64},
	// {17, 47, 82},
	// {18, 35, 87, 10},
	// {20, 4, 82, 47, 65},
	// {19, 1, 23, 75, 3, 34},
	// {88, 2, 77, 73, 7, 63, 67},
	// {99, 65, 4, 28, 6, 16, 70, 92},
	// {41, 41, 26, 56, 83, 40, 80, 70, 33},
	// {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
	// {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
	// {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
	// {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
	// {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
	// {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}};

	private static final Map<BinaryTreeNode<Integer>, Long> maxPaths = new HashMap<>();

	public static void main(String[] args) {

		List<List<Integer>> numbers = new ArrayList<>();
		loadData(numbers);

		List<BinaryTreeNode<Integer>> previousRow = null;
		for (int row = numbers.size() - 1; row >= 0; row--) {
			List<BinaryTreeNode<Integer>> nodeRow = new ArrayList<>(numbers.get(row).size());
			for (int col = 0; col < numbers.get(row).size(); col++) {
				if (previousRow == null) {
					nodeRow.add(new BinaryTreeNode<Integer>(numbers.get(row).get(col)));
				} else {
					BinaryTreeNode<Integer> leftChild = previousRow.get(col);
					BinaryTreeNode<Integer> rightChild = previousRow.get(col + 1);
					nodeRow.add(new BinaryTreeNode<Integer>(numbers.get(row).get(col), leftChild, rightChild));
				}
			}
			previousRow = nodeRow;
		}

		BinaryTreeNode<Integer> root = previousRow.get(0);

		System.out.println(maxPath(root));

	}

	private static void loadData(List<List<Integer>> numbers) {
		File file = new File(
				Problem67
				.class
				.getClassLoader()
				.getResource("problems/problem67/p067_triangle.txt")
				.getFile());

		try (Scanner scanner = new Scanner(file)) {
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				List<Integer> row = new ArrayList<>();
				numbers.add(row);
				String[] numsInRow = line.split(" ");
				for (String number : numsInRow) {
					row.add(Integer.valueOf(number));
				}
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static long maxPath(BinaryTreeNode<Integer> node) {
		if (maxPaths.containsKey(node)) {
			return maxPaths.get(node);
		}
		long maxPath;
		if (node.hasChildren()) {
			maxPath = node.getValue() + Math.max(maxPath(node.getLeft()), maxPath(node.getRight()));
		} else {
			maxPath = node.getValue();
		}
		maxPaths.put(node, maxPath);
		return maxPath;
	}
}
