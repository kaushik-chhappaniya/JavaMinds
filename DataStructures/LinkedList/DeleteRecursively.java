package DataStructures.LinkedList;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Deletes the linked list node recursively
 */
public class DeleteRecursively {
    /**
     * 
     * @param head
     * @param position
     * @return linked list after the deleted node
     */	
	public static Node<Integer> deleteNodeRecursively(Node<Integer> head, int position){
		if(head == null)
			return head;
		if(position == 0)
			return head.next;
		else {
			head.next = deleteNodeRecursively(head.next, position-1);
			return head;
		}	
	}
}
