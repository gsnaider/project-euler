package common.collect;

public final class BinaryTreeNode<T> {

	private  final T value;
	private final BinaryTreeNode<T> left;
	private final BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T value) {
		this(value, null, null);
	}
	
	public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public boolean hasChildren() {
		return (left != null || right != null);
	}

	public T getValue() {
		return value;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

}
