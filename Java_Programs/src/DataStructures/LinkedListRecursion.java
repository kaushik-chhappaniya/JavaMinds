package DataStructures;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class LinkedListRecursion {
	public static void printR(Node<Integer> head) {
		if(head == null)
			return;
		System.out.print(head.data +" ");
		printR(head.next);
	}
	
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
	
	public static void main(String[] args) {
		LinkedListUse l = new LinkedListUse();
		Node<Integer> head = l.takeInput();
		System.out.println("\nOriginal LinkedList");
		printR(head);

		System.out.println("\n \n Insert Node");
		printR(insertNodeRecursively(head, 100, 2));
		
		System.out.println("\n \nDelete Node");
		printR(deleteNodeRecursively(head, 2));
		
		System.out.println("\nReverse Linked List");
		head = reverseLinkedList(head);
		printR(head);
		
		System.out.println("\n\nReverse Better Call ");
		head = reverseBetterCall(head);
		printR(head);
		
		System.out.println("\n\nReverse Best Call ");
		head = reverseBest(head);
		printR(head);
		
	}
	
}
