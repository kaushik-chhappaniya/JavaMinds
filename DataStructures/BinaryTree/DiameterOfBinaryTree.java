package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * 
 */
public class DiameterOfBinaryTree {
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null)
		return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	/**
	 * This method implements the code to find the diameter of a binary tree
	 * @param root
	 * @return diameter of the tree
	 */
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
			if(root == null) return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int diameterRoot = leftHeight + rightHeight + 1;
		int diameterLeft = diameterOfBinaryTree(root.left);
		int diameterRight = diameterOfBinaryTree(root.right);
		return Math.max(diameterLeft,Math.max(diameterRight, diameterRoot));
	}
		
}
