package problems.impl.problem67;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import common.collect.BinaryTreeNode;

import problems.ProblemSolver;

public final class Problem67Solver implements ProblemSolver {

	private static final Map<BinaryTreeNode<Integer>, Long> maxPaths = new HashMap<>();

	@Override
	public String solve() {

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

		return String.valueOf(maxPath(root));

	}

	private static void loadData(List<List<Integer>> numbers) {
		File file = new File(
				Problem67Solver
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
