package DataStructures.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BSTLevelWiseLinkedList {
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
		ArrayList<LinkedListNode<Integer>> output = new ArrayList<>();
		if(root == null){ return null;}
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		pendingChildren.add(null);
		LinkedListNode<Integer> head = null,tail=null;
		while(!pendingChildren.isEmpty()){
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			if(front == null){
				if(pendingChildren.isEmpty()){
					break;
				}else{
					pendingChildren.add(null);
					tail.next=null;
                    tail=tail.next;
                    head=null;
				}
			}else{  
				if (head==null)
                {
                    head = new LinkedListNode<Integer>(front.data);
                    tail=head;
                    output.add(head);
                }
                else
                {
                    tail.next=new LinkedListNode<Integer>(front.data);
                    tail=tail.next;
                }
				if(front.left != null)
					pendingChildren.add(front.left);
				if(front.right != null)
					pendingChildren.add(front.right);
				
			}
		}
		return output;
	}
}
