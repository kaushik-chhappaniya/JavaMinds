package DataStructures.BST;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
/*
 * Class implementation for the tree node.
 * Tree nodes are left and right and contains data of <T>.
 */
public class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

