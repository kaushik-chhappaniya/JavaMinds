package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class ReplaceNodesWithDepth {
    
	/**
	 * Replaces the given tree with its depth childrens.
	 * @param root
	 */
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		changeToDepthTreeCall(root,0);
	}
	public static void changeToDepthTreeCall(BinaryTreeNode<Integer> root, int depth){
		if(root == null) return;
		root.data = depth;
		changeToDepthTreeCall(root.left, depth + 1);
		changeToDepthTreeCall(root.right, depth+1);
	}
}
