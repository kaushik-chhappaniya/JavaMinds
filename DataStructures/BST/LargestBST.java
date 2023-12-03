package DataStructures.BST;
import java.util.ArrayList;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

// This class implements the method to get the height of the largest BST in the given tree.
public class LargestBST {
    
    /* Logic - 1. check if the tree is BST or not - if not return 0
    * 2. If BST then return the max of left subtree height and right subtree height
    * 3. To get the height - use method findHeight
    * 4. To chech is bst use method isBST. 
    */
    public static int largestBST(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        if(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            return findHeight(root);
        else
            return Math.max(largestBST(root.left), largestBST(root.right));
    }

    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max){
        if(root == null) return true;
        if(root.data < min || root.data > max) return false;
        return isBST(root.left, min, root.data - 1) && isBST(root.right, root.data + 1, max);
    }
    private static int findHeight(BinaryTreeNode<Integer> root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        return Math.max(findHeight(root.left), findHeight(root.right))+1;
    }
}