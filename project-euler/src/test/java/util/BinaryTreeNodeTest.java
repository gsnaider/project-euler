package util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryTreeNodeTest {
	
	@Test
	public void testHasChildren_noChildrenReturnsFalse() {
		BinaryTreeNode<Integer> node = new BinaryTreeNode<>(Integer.valueOf(1));
		assertFalse(node.hasChildren());
	}
	
	@Test
	public void testHasChildren_nodeWithChildrenReturnsTrue() {
		BinaryTreeNode<Integer> childLeft = new BinaryTreeNode<Integer>(Integer.valueOf(1));
		BinaryTreeNode<Integer> childRight = new BinaryTreeNode<Integer>(Integer.valueOf(2));
		BinaryTreeNode<Integer> node = new BinaryTreeNode<>(Integer.valueOf(3), childLeft, childRight);
		assertTrue(node.hasChildren());
	}
	
	
}
