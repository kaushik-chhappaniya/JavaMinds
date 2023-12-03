package DataStructures.BST;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
/**
 * This class implements the method to return all the elements in the given range in a binary search tree.
 */
public class SearchInRange {
    /**
     * @logic if <k1 call right, if >k2 call left, if >= k1 and <= k2 call function on left and print data and then call on right
     * @return the number of elements in the range
     * @param root Start node of the search tree
     * @param k1 Upper bound of the range
     * @param k2 Lower bound of the range
     */
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root == null) return;
        if(root.data < k1)
            elementsInRangeK1K2(root.right, k1, k2);
        if(root.data > k2)
            elementsInRangeK1K2(root.left, k1, k2);
        if(root.data >= k1 && root.data <= k2) {
            elementsInRangeK1K2(root.left, k1, k2);
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.right, k1, k2);
        }		
    }
}
