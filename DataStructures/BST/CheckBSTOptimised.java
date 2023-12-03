package DataStructures.BST;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
// Optimised check BST implementation
public class CheckBSTOptimised {
    public static isBSTReturn checkBST(BinaryTreeNode<Integer> root){
        if(root == null) {
            isBSTReturn ans = new isBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            return ans;
        }
        isBSTReturn left = checkBST(root.left);
        isBSTReturn right = checkBST(root.right);
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));
        boolean isBST = true;
        if(left.max >= root.data)
            isBST = false;
        if(right.max < root.data)
            isBST = false;
        if(!left.isBST)
            isBST = false;
        if(!right.isBST)
            isBST = false;
        isBSTReturn ans = new isBSTReturn(min, max, isBST);
        return ans;
    }
  
    // Most optimized solution for BST class
    public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange){
        if (root == null) return true;
        if(root.data < minRange || root.data > maxRange) return false;
        return isBST3(root.left, minRange, root.data-1) && isBST3(root.right, root.data, maxRange);
        }
    }


