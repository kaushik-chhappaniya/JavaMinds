package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class IsNodePresent {
	/**
	 * 
	 * @param root
	 * @param x
	 * @return boolean whether the node is present or not
	 */
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root == null)
			return false;
		if(root.data == x){
			return true;
		}
		boolean k = isNodePresent(root.left, x);
		boolean m = isNodePresent(root.right, x);
		return k || m;
	}
}
