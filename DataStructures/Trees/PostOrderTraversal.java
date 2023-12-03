package DataStructures.Trees;

import java.util.ArrayList;

public class PostOrderTraversal {
	public static void printPostOrder(TreeNode<Integer> root){
		 if(root == null) return;
		ArrayList<TreeNode<Integer>> rootChildren = root.children;
		for(int i = 0; i < rootChildren.size(); i++)
			printPostOrder(rootChildren.get(i));
		System.out.print(root.data + " ");
	}
}
