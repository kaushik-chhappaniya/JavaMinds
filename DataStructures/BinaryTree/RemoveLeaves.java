package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class RemoveLeaves {
	/**
	 * 
	 * @param root
	 * @return root node of the modified tree
	 */
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if(root == null) return null;
		if(root.left == null && root.right == null) return null;
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
}
