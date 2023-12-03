package DataStructures.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintNodesLevelWise {
    
	public static void printLevelWise(TreeNode<Integer> root){
		 Queue<TreeNode<Integer>> q=new LinkedList<>();
		 q.add(root);
		 while(!q.isEmpty()){
			 int size = q.size();
			 for(int j = 0; j < size; j++){
			 TreeNode<Integer> element = q.remove();
			 System.out.print(element.data + " ");
			 ArrayList<TreeNode<Integer>> children = element.children;
			 for(int k = 0; k < children.size(); k++){
				 q.add(children.get(k));
			 	}
			 }
			 System.out.println();
		 }
	}
		
}
