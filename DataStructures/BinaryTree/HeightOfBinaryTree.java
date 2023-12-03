package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class HeightOfBinaryTree {
	
	/**
	 * This method implements the code to calculate the height of the binary tree
	 * @param root
	 * @return Height of the binary tree
	 */
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int leftHt = height(root.left);
		int rightHt = height(root.right);
		return 1+ Math.max(leftHt, rightHt);
	}

}
