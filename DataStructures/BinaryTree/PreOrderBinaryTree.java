package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class PreOrderBinaryTree {
   /**
	* Prints the Pre Order of the Binary Tree
	* @param root
    */ 
	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
