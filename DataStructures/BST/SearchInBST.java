package DataStructures.BST;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * This is an implementation of the search is BST function
 * Given a binary search tree and a node to check whether it is present in the tree. 
 * Returns the boolean if the number found in the BST
 * Time complexity: O(height)
 */
public class SearchInBST {
    /**
     * @logic call until the root node is not null
     * @param root
     * @param k
     * @return
     */
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root == null) 
            return false;
        if(root.data == k) 
            return true;
        if(k < root.data)
            return searchInBST(root.left, k);
        else
            return searchInBST(root.right, k);
        }
}
