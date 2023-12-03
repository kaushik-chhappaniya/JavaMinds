package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class PostOrderBinaryTree {
    /**
	 * Prints the post order of the binary tree
	 * @param root
	 */
	public static void postOrder(BinaryTreeNode<Integer> root) {
			if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

}
