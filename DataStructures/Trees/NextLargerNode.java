package DataStructures.Trees;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class NextLargerNode {
   public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
    TreeNode<Integer> result = new TreeNode<Integer>(null);
    return findNextLargerNodeHelper(root, n, result);
} 
    private static TreeNode<Integer> findNextLargerNodeHelper(TreeNode<Integer> root, int n, TreeNode<Integer> result) {
        if(root == null) return 0;
        if(root.data > n)
            if(root == null || root.data < result.data) 
                result = root;
        for(TreeNode<Integer> node : root.children) {
        findNextLargerNodeHelper(root, n, result);
    }
}

static TreeNode<Integer> result = null; 	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
	//    TreeNode<Integer> result = new TreeNode<>();
    	findNextLargerNodeHelper(root, n);
		return result;
		}
    private static void findNextLargerNodeHelper(TreeNode<Integer> root, int n) {
        if(root == null) return;
		if(root.data > n)
		if(result == null || result.data > root.data)
                result = root;
		for(TreeNode<Integer> node: root.children)
        		findNextLargerNodeHelper(node, n);	
		}
    
    }