package DataStructures.BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class PrintLevelWise {
	/**
	 * Prints the binary tree level wise
	 * @param root
	 */
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root.data == -1) return;   // user doesnt want to add anything
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			// take input for left right children
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.print(front.data + ":");
			if(front.left != null) {
				pendingChildren.add(front.left);
				System.out.print("L:"+front.left.data);
			}
			else {
				System.out.print("L:-1");
			}
			if(front.right != null) {
				pendingChildren.add(front.right);
				System.out.print(",R:"+front.right.data);				
			}
			else {
				System.out.print(",R:-1");
			}
			System.out.println();
		}
	}
}
