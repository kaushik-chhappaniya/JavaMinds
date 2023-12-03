package DataStructures.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class PrintLevelWiseWithLevels {
		/**
		 * Prints the nodes of the binary tree with the given level notation
		 * @param root
		 */
    	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		pendingChildren.add(null);
		System.out.println(root.data + " ");
		while(!pendingChildren.isEmpty()){
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			if(front == null){
				if(pendingChildren.isEmpty()) break;
				else{
					System.out.println();
					pendingChildren.add(null);
				}
			}
			else{
			if(front.left != null) {
				pendingChildren.add(front.left);
				System.out.print(front.left.data + " ");
			}
			if(front.right != null) {
				pendingChildren.add(front.right);
				System.out.print(front.right.data + " ");
			}
		}
	}
	}
}
