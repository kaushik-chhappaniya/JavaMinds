package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * 
 */
public class IsBalancedBinaryTree {
    /**
     * This method implements the code to check whether the binary tree is Balanced or not.
     * @param root
     * @return boolean
     */
    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(rightHeight - leftHeight) > 1){
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);
        return isLeftBalanced && isRightBalanced;
    }

    /**
     * 
     * @param root
     * @return height of the BinaryTree
     */
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
