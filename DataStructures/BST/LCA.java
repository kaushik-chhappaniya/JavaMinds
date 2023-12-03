package DataStructures.BST;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class LCA {
    
    /**
     * Input: 11 -1 12 -1 13 -1 14 -1 15 -1 -1
     *        14 15
     * Output: 14
     * @logic base case- if null return -1, if root.data >a & >b call on left if <a & < b call on right else return root.data
     * @param root
     * @param a
     * @param b
     * @return lowest common ancestor (LCA)
     */
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if (root == null) 
            return -1; 
	    if (root.data > a && root.data > b) 
            return getLCA(root.left, a, b); 
        if (root.data < a && root.data < b)  
            return getLCA(root.right, a, b); 
        return root.data;
	}
}
