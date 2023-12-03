package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class MirrorBinaryTree {
	/**
	 * 
	 * @param root
	 * Mirrors the given binary tree
	 */
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null)
			return;
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	}
}
