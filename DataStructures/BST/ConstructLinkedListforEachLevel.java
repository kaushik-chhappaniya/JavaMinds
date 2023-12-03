package DataStructures.BST;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * This class implements the method to construct linked list for each level of the bst
 */
public class ConstructLinkedListforEachLevel {

    /**
     * @logic Use Queue for pending children and create linekd list of arraylist.
     * add null to pending children after every level, and also add head and tail to the arraylist
     * if front = null - 1. if pendingChildren empty break. 2. else add null to pending children and tail.next = null & tail = tail.next = null & head = nul
     * else - 1. if head = null tail = head = new linked list node 2. else tail = tail.next = new linked list node
     *        if front.left != null pending children add , if front.right != null add pending children
     * @param root
     * @return
     */
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
