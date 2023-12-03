package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class ConstructBinaryTreeUsingPreAndInOrder {
	/** 
	 * This method implements code to contsrut the binary tree using Pre Order and In Order of the Binary Tree
	 * @param preOrder
	 * @param inOrder
	 * @return root node of the binary tree
	 */
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		BinaryTreeNode<Integer> root = buildTreefromPreInHelper(preOrder, inOrder , 0 , preOrder.length - 1, 0, inOrder.length - 1);
		return root;
	}   

	public static BinaryTreeNode<Integer> buildTreefromPreInHelper(int[] pre, int[] in, int siPre, int eiPre, int siIn, int eiIn) {
		if(siPre > eiPre) return null; //PreOrder is completed. start index and end index coming towards each other
		int rootData = pre[siPre]; //Pre order - root, left, right
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		int rootIndex = -1;
		for(int i = siIn; i <= eiIn; i++) {
			if(in[i] == rootData) {
				rootIndex = i;
				break;
				}
			} // Done to find the si, ei of pre and In
		// assuming the root actually is present in inorder	
		int siInLeft = siIn;
		int eiInLeft = rootIndex - 1;
		
		int siInRight = rootIndex + 1;
		int eiInRight = eiIn;
		
		int leftSubTreeLength = eiInLeft - siInLeft + 1;  

		int siPreLeft = siPre + 1;
		int eiPreLeft = siPreLeft + leftSubTreeLength - 1;

		int siPreRight = eiPreLeft + 1;
		int eiPreRight = eiPre;
		
		BinaryTreeNode<Integer> left = buildTreefromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		BinaryTreeNode<Integer> right = buildTreefromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);

		root.left = left;
		root.right = right;
		return root;
	}
	
}
