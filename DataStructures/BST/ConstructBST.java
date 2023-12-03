package DataStructures.BST;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class ConstructBST {
    
    /**
     * Function to construct the Binary Tree
     * @param arr Given array of elements
     * @param n size of the array
     * @return Root node of the constructed BinaryTree and prints the data in preorder
     */
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        int start=0;
        int end = arr.length -1;
        return SortedArrayToBST(arr, n, start, end);
        }

    /**
     * Helper function
     * @logic base case - if start> end return null
     * calculate mid and pass mid+1 to root.right and mid-1 to root.left and then just return root
     * @param arr
     * @param n
     * @param start
     * @param end
     * @return
     */
    private static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n, int start, int end){
        if(start > end){return null;}
        int mid = (start+end)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
        root.left = SortedArrayToBST(arr, n, start, mid-1);
        root.right = SortedArrayToBST(arr,n, mid+1, end);
        return root;
    }   
}
