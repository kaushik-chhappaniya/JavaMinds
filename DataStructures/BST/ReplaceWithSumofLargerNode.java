package DataStructures.BST;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * This class implements the method to replace the node with teh sum of largest node
 */
public class ReplaceWithSumofLargerNode {

    /**
     * Function to replace the node with a larger nodes sum
     * Input: 11 -1 12 -1 13 -1 14 -1 15 -1 -1
     * Output: 65 54 42 29 15
     * @param root
     */
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
	replaceWithLargerNodesSumHelper(root, 0);
	}

	/**
	 * @logic sum += root.data and return sum, base case- if root null return sum else return function call
	 * @param root
	 * @param sum
	 * @return
	 */
	private static int replaceWithLargerNodesSumHelper(BinaryTreeNode<Integer> root, int sum)
	{
	 if(root == null)
			return sum;
		sum = replaceWithLargerNodesSumHelper(root.right,sum);
		sum += root.data;
		root.data = sum;
		return replaceWithLargerNodesSumHelper(root.left,sum);
	}
}
