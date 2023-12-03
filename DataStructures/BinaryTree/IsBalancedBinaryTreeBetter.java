package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class IsBalancedBinaryTreeBetter {
	/**
	 * This method implements the code to check whether the binary tree is Balanced or not.
	 * Using another class for returning 2 values as boolean and height to reduce the time
	 * complexity. And this method uses O(N) time complexity
	 * @param root 
	 * @return class containing int height and boolean is balanced or not
	 */
	public static BinaryTreeReturn2Values isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			BinaryTreeReturn2Values result = new BinaryTreeReturn2Values();
			result.height = height;
			result.isBalanced = isBal;
			return result;
		}
		BinaryTreeReturn2Values leftOutput = isBalancedBetter(root.left);
		BinaryTreeReturn2Values rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		if(Math.abs(leftOutput.height- rightOutput.height) > 1) {
			isBal = false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BinaryTreeReturn2Values ans = new BinaryTreeReturn2Values();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}
}

 class BinaryTreeReturn2Values {

	int height;
	boolean isBalanced;
}
