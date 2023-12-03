package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class NodesGreaterThanX {
	/**
	 * 
	 * @param root
	 * @param x
	 * @return count of nodes greater than x
	 */
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root == null)
			return 0;
		int countLeft = countNodesGreaterThanX(root.left, x);
		int countRight = countNodesGreaterThanX(root.right, x);
		if(root.data > x)
			return 1 + countLeft + countRight ;
		else
			return  countLeft + countRight ;
	}
}
