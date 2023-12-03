package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * This clas implements the BinaryTree class
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

public class Pair<T, U>{
	T minimum;
	U maximum;
	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}
}

