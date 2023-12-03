package DataStructures.Trees;

import java.util.ArrayList;

public class NodesGreaterthanX {
    
	public static int numNodeGreater(TreeNode<Integer> root,int x){
		ArrayList<TreeNode<Integer>> rootChildren = root.children;
		int count = 0;
		for(int i =0; i< rootChildren.size(); i++){
			count += numNodeGreater(rootChildren.get(i), x);
		}
		if(root.data > x){
			return count+1;
		}
		else return count;


		// Write your code here		


	}
}
