package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class GetSumOfAllNodes {
	
	/**
	 * This method implements the code to calculate the sum of all nodes in the tree
	 * @param root
	 * @return sum of all nodes in the tree
	 */
	public static int getSum(BinaryTreeNode<Integer> root) {
		int ans = 0;
		if(root == null)
			return 0;
		ans += root.data ;
		ans += getSum(root.left) + getSum(root.right);
		return ans;
	}

}
