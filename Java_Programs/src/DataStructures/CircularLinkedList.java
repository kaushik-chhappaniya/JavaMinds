package DataStructures;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class CircularLinkedList {
	
	public Node<Integer> createLinkedlist(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		Node<Integer> n4 = new Node<Integer>(40);
		Node<Integer> n5 = new Node<Integer>(50);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n1;
		return n1;	
	}
	
	public void print(Node<Integer> head) {
		Node<Integer> temp = head;
		do {			
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		} while (temp.next != head);
		
			
		
	}
}
