package DataStructures.LinkedList;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Reverses the linked list recursively
 */
public class ReversedLinkedListRecursively {
    /**
     * 
     * @param head
     * @return
     */
    public static Node<Integer> reverseLinkedList(Node<Integer> head){    //Complexity - BIGO(N^2)
		if(head == null || head.next == null) 
			return head;
		Node<Integer> reverseHead = reverseLinkedList(head.next);
		Node<Integer> tail = reverseHead;
		while(tail.next != null)
			tail = tail.next;
		tail.next = head;
		head.next = null;
		return reverseHead;
    }

    /**
     * A better implementation of reversedLinkedList
     * @param head
     * @return
     */
    public static DoubleNode reverseBetter(Node<Integer> head) {
		DoubleNode ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode(head,head);
			return ans;
		}
		DoubleNode smallAns = reverseBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode(smallAns.head, head);
		return ans;
	}
	
	public static Node<Integer> reverseBetterCall(Node<Integer> head) {
		DoubleNode ans = reverseBetter(head);
		return ans.head;
	}
	
    /**
     * A better implementation of the above method 
     * @param head
     * @return
     */
   public static Node<Integer> reverseBest(Node<Integer> head)  {
	   if(head == null || head.next == null) {
		   return head;
	   }
	   Node<Integer> smallHead = reverseBest(head.next);
	   Node<Integer> reverseTail = head.next;
	   reverseTail.next = head;
	   head.next = null;
	  return smallHead;
    } 
}
