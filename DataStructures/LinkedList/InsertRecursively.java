package DataStructures.LinkedList;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Inserts into the linked list recursively
 */

public class InsertRecursively {
    /**
     * 
     * @param head
     * @param data
     * @param position
     * @return head node of the Linkedlist
     */
    public static Node<Integer> insertNodeRecursively(Node<Integer> head, int data, int position){
		if(head == null && position > 0)  // if position is greater than length of the linked list
			return head;
		if(position == 0) {
			Node<Integer> newNode = new Node<Integer>(data);
			newNode.next = head;
			return newNode;
		}
		else {
			head.next = insertNodeRecursively(head.next, data, position-1);
			return head;
		}		
	}
}
