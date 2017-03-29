package problems.impl.problem18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.collect.BinaryTreeNode;

final class Problem18 {
	
//	private static final int[][] nums =
//		  {{3},
//		  {7, 4},
//		 {2, 4, 6},
//		{8, 5, 9, 3}};
	
	private static final int[][] nums =
		{{75},
		{95, 64},
		{17, 47, 82},
		{18, 35, 87, 10},
		{20,  4, 82, 47, 65},
		{19,  1, 23, 75,  3, 34},
		{88,  2, 77, 73,  7, 63, 67},
		{99, 65,  4, 28,  6, 16, 70, 92},
		{41, 41, 26, 56, 83, 40, 80, 70, 33},
		{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
		{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
		{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
		{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
		{63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
		{04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60,  4, 23}};
	
	private static final Map<BinaryTreeNode<Integer>, Long> maxPaths = new HashMap<>();
	
	public static void main(String[] args) {
	
		List<BinaryTreeNode<Integer>> previousRow = null;
		for (int row = nums.length - 1; row >= 0; row--) {
			List<BinaryTreeNode<Integer>> nodeRow = new ArrayList<>(nums[row].length);
			for (int col = 0; col < nums[row].length; col++) {
				if (previousRow == null) {
					nodeRow.add(new BinaryTreeNode<Integer>(nums[row][col]));
				} else {
					BinaryTreeNode<Integer> leftChild = previousRow.get(col);
					BinaryTreeNode<Integer> rightChild = previousRow.get(col + 1);
					nodeRow.add(new BinaryTreeNode<Integer>(nums[row][col], leftChild, rightChild));
				}
			}
			previousRow = nodeRow;
		}
		
		BinaryTreeNode<Integer> root = previousRow.get(0);
		
		System.out.println(maxPath(root));
		
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
