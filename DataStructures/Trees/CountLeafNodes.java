package DataStructures.Trees;

import java.util.ArrayList;

public class CountLeafNodes {
    
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
	if(root == null) return 0;
	if(root.children.size()==0) return 1;
	int count = 0;
	ArrayList<TreeNode<Integer>> rootChildren = root.children;
	for(int i = 0; i< rootChildren.size(); i++)
			count += countLeafNodes(rootChildren.get(i));
	
	return count;
	}
	
}
