package DataStructures.BST;


/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * 
 * Helper class for CheckBSTOptimised function.
 */
public class isBSTReturn {
    
    int max; 
    int min;
    boolean isBST;

    public isBSTReturn(int max, int min, boolean isBST) {
        this.max = max;
        this.min = min;
        this.isBST = isBST;
    }
}
