package DataStructures.LinkedList;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class LinkedListRecursion {
	
	public static void main(String[] args) {
		LinkedListUse l = new LinkedListUse();
		Node<Integer> head = l.takeInput();
		System.out.println("\nOriginal LinkedList");
		PrintRecursively obj = new PrintRecursively();
		obj.printR(head);

		System.out.println("\n \n Insert Node");
		obj.printR(InsertRecursively.insertNodeRecursively(head, 100, 2));
		
		System.out.println("\n \nDelete Node");
		obj.printR(DeleteRecursively.deleteNodeRecursively(head, 2));
		
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
