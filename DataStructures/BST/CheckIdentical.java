package DataStructures.BST;

import DataStructures.Trees.TreeNode;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * This class implements the methods for checking if the 2 trees are equal or not.
 */
public class CheckIdentical {
    	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
			return countLeaf(root1) == countLeaf(root2);
        	}
        /**
         * Helper method to check if the 2 trees are equal. 
         * @logic iterate over the node called recursively and then add the number of leaf nodes
         */
		private static int countLeaf(TreeNode<Integer> root){
		int leaf = 0;
		if(root == null) return 0;
		if(root.children.size() == 0)	return 1;
		for(TreeNode<Integer> node : root.children)
			leaf += countLeaf(node);
		return leaf;
	}
	
}
