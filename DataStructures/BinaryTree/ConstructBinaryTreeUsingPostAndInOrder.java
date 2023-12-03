package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class ConstructBinaryTreeUsingPostAndInOrder {
	/**
	 * This method implements the code to construct a binary tree using post order and in order of the BinaryTree
	 * @param postOrder
	 * @param inOrder
	 * @return root node of the binary tree
	 */
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		BinaryTreeNode<Integer> root = buildTreefromPostInHelper(postOrder, inOrder , 0 , postOrder.length - 1, 0, inOrder.length - 1);
		return root;
	}

	public static BinaryTreeNode<Integer> buildTreefromPostInHelper(int[] post, int[] in, int siPost, int eiPost, int siIn, int eiIn) {
		if(siPost > eiPost) return null; //PreOrder is completed. start index and end index coming towards each other
		int rootData = post[eiPost]; //Pre order - root, left, right
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		int rootIndex = -1;
		for(int i = siIn; i <= eiIn ; i++) {
			if(in[i] == rootData) {
				rootIndex = i;
				break;
				}
			} 
		
			int siInLeft = siIn;
			int eiInLeft = rootIndex - 1;
			
			int siInRight = rootIndex + 1;
			int eiInRight = eiIn;

			int siPostLeft = siPost;
			int eiPostLeft = eiInLeft - siInLeft + siPostLeft;  
			
			int siPostRight = eiPostLeft + 1;
			int eiPostRight = eiPost - 1;
		
		BinaryTreeNode<Integer> left = buildTreefromPostInHelper(post, in, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
		BinaryTreeNode<Integer> right = buildTreefromPostInHelper(post, in, siPostRight, eiPostRight, siInRight, eiInRight);
		root.left = left;
		root.right = right;
		return root;
	}
	
}
