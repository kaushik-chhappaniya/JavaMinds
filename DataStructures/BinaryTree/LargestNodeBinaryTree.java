package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class LargestNodeBinaryTree {
	/**
	 * 
	 * @param root
	 * @return largest node of the binary tree
	 */
    public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null)
			return -1;
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		int ans = Math.max(largestLeft, largestRight);
		return ans;
	}
}
