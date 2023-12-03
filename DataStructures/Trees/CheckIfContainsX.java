package DataStructures.Trees;

import java.util.ArrayList;

public class CheckIfContainsX {
    	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
		if(root == null) return false;
		if(root.data == x) return true;
		ArrayList<TreeNode<Integer>> rootChildren = root.children;
		for(int i = 0; i < rootChildren.size(); i++){
			if(checkIfContainsX(rootChildren.get(i), x))
				return true;
			}
			return false;
	}
	   
}
