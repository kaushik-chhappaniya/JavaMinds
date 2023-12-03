package DataStructures.LinkedList;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class LinkedListMainClass {
	
	
	public static void runLinkedList() {		
		System.out.println("Without Recursion");
		LinkedListUse li = new LinkedListUse();
//		Node<Integer> head = createLinkedList();
		Node<Integer> head = li.takeInput();
		li.printRecursively(head);
		
//	 	System.out.println(head.data);
//	 	print(head);
//	 	Node<Integer> head1 = insertNode(head, 33, 34);
//	 	print(head1);
//	 	Node<Integer> delete_Node = deleteNode(head, 2);
//	 	print(delete_Node);
//	 	System.out.println("Printing append-");
//	 	Node<Integer> append = li.appendLastNToFirst(head, 3);
//	 	li.print(append);
//	 	printReverseNode(head);
		
//	 	Node<Integer> mid =  li.findMidNode(head);
//	 	System.out.println(mid.data);
		
//	 	Node<Integer> head1 = li.takeInput(), head2 = li.takeInput(), merge;
//	 	merge = li.mergeTwoSortedLL(head1, head2);
//	 	li.print(merge);
		
		Node<Integer> finalHead = li.mergeSort(head);
		li.print(finalHead);		
	}
	
	
	public static void runCircularLinkedList() {
		// TODO Auto-generated method stub
		CircularLinkedList li = new CircularLinkedList();
		Node<Integer> head = li.createLinkedlist();
		li.print(head);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		runLinkedList();
//		runLinkedListRecursive();
		runCircularLinkedList();
			
		}

	}
