package DataStructures.Trees;

public class ReplaceWithDepth {
    public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		if(root == null) return;
		rootDepthHelper(root,0);
	}
	private static void rootDepthHelper(TreeNode<Integer> root, int depth){
		root.data = depth;
		for(TreeNode<Integer> child:root.children)
			rootDepthHelper(child, depth+1);
	}
}
