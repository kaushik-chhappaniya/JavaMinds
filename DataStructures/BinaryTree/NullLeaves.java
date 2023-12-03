package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class NullLeaves {
	/**
	 * 
	 * @param root
	 * @return number of null leaves
	 */
    public static int nullLeaves(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		return nullLeaves(root.left) + nullLeaves(root.right);
	}
}
