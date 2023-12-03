package DataStructures.BST;

public class PathSumRootToLeaf {
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, String ans, int k) {
 
		if (root == null)
			return;
 
		if (k == root.data) {
 
			if (root.left == null && root.right == null) {
 
				ans += root.data;
				System.out.println(ans);
			}
 
			return;
		}
 
		rootToLeafPathsSumToK(root.left, ans + root.data + " ", k-root.data);
 
		rootToLeafPathsSumToK(root.right, ans + root.data + " ", k-root.data);
	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
		rootToLeafPathsSumToK(root, "", k);
	}
}
