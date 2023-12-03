package DataStructures.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class TakeInputLevelWise {
	/**
	 * Takes input from the user and created the binary tree
	 * @return root node of the tree
	 */
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data: ");
		int rootData = s.nextInt();
		if(rootData == -1) return null;   // user doesnt want to add anything
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>(); //we can't use integer queue as we need to attach the children to the root
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			// take input for left right children
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.println("Enter left child of " + front.data);
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				pendingChildren.add(leftChild);
			}
			System.out.println("Enter Right child of " + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;
	}
}
