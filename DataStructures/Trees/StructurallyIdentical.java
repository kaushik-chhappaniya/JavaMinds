package DataStructures.Trees;

public class StructurallyIdentical {
    
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
			return countLeaf(root1) == countLeaf(root2);
		
	}
		public static int countLeaf(TreeNode<Integer> root){
		int leaf = 0;
		if(root == null) return 0;
		if(root.children.size() == 0)	return 1;
		for(TreeNode<Integer> node : root.children)
			leaf += countLeaf(node);
		return leaf;
	}
	
}
