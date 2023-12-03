package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * 
 */
public class InsertDuplicateNode {
	
	/**
	 * This method implements the code to insert duplicates into the binary tree
	 * @param root
	 */
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {		
		if(root == null) return;
		BinaryTreeNode<Integer> duplicateRoot = new BinaryTreeNode<>(root.data);
		BinaryTreeNode<Integer> temp = root.left;
		root.left = duplicateRoot;
		duplicateRoot.left = temp;
		insertDuplicateNode(root.left.left);
		insertDuplicateNode(root.right);
	}
	
}
