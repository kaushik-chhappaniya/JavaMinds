package DataStructures;
import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class LinkedListUse {
	
	public static int returnLength(Node<Integer> head) {
		if(head == null) return 0;
		int count = 0;
		while(head != null) {
			count++;
		}
		return count;
	}
	
	public void print(Node<Integer> head) {
//		while(head != null) {
//			System.out.print(head.data + " -> ");
//			head = head.next;
//		}
		while(head.next != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.print(head.data);
		System.out.println();
	}
	
	public static void printRecursively(Node<Integer> head) {
		if(head == null) {
			System.out.println();
			return;
			}
		System.out.print(head.data + " ");
		printRecursively(head.next);
	}
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next  = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
		
	}
	
	public Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
//		Node<Integer> head = null;
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode  = new Node<>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}
			else {
				tail.next = currentNode;
				tail = currentNode;
			}
			
//			if(head == null) {
//				head = currentNode;
//			}
//			else {
//				Node<Integer> tail = head;
//				while(tail.next != null) {
//					tail = tail.next;
//				}
//				tail.next = currentNode;
//			}
			data = s.nextInt();
					
		}
		return head;
	}	
	
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos ){
		
		if(head == null)
			return head;
		
		if(pos == 0){
			head = head.next;
			return head;
		}
		Node<Integer> prev = head;
		for(int i = 0; i < pos-1; i++) {
			if(prev != null)
				prev = prev.next; 
			else
				return head;
		}
		if(prev.next == null)
			return head;
		
		Node<Integer> nextNode = prev.next.next;
		prev.next = nextNode;
		return head;
	}
	
	
	
	
	
	
	public static Node<Integer> insertNode(Node<Integer> head, int position, int data){
		Node<Integer> currentNode = new Node<>(data);
		if(position == 0) {
			currentNode.next = head;
			head = currentNode;
			return head;
		}
		Node<Integer> previousNode = head;
		for(int i = 0; i < position-1; i++) {
			if(previousNode == null)
				return head;
			previousNode = previousNode.next;
		}
		
		Node<Integer> nextNode = previousNode.next;
		currentNode.next = nextNode;
		previousNode.next = currentNode;		
		return head;
	}
	
	
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		Node<Integer> headNode = head, nextNode, newHead;
		 if (n==0)
	        {
	            return head;
	        }
	     int count=0;
	     while(headNode != null)
	        {
	            headNode = headNode.next;
	            count++;
	        }
        if (count<n)
            return head;
        n = count-n;
        headNode = head;
        for (int i = 0; i < n-1; i++)
            headNode = headNode.next;
        
        nextNode = headNode.next;
        headNode.next = null;
        newHead = nextNode;
        while(nextNode.next != null)
        	nextNode = nextNode.next;
        nextNode.next = head;
        head = newHead;
        return head;
//        		
//		int count = 0;
//		Node<Integer> tail = head;			
//		while(count <= n) {
//			while(head.next.next != null)
//				head = head.next;
//			tail = head;
//			
//			Node<Integer> currentNode = new Node<>(tail.next.data);
//			currentNode.next = head;
//			head = currentNode;
//			
//			tail.next = null;
//			count++;
//		}
//		return head;
	}


	//*_*_*_**_*_*
	public static void printReverseNode(Node<Integer> head){
		Node<Integer> smallOutputNode = printReverseRecursion(head);
	}
	
	private static Node<Integer> printReverseRecursion(Node<Integer> head) {
		// TODO Auto-generated method stub
		if(head == null)
			return head;
		Node<Integer> smallOutput = printReverseRecursion(head.next);
		System.out.print(head.data + " ");
		return smallOutput;
	}
	
	public static Node<Integer> findMidNode(Node<Integer> head) {
		if(head == null) return head;
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2) {
		if(head1 == null) 
			return head2;
		if(head2 == null)
			return head1;
		Node<Integer> t1  = head1, t2 = head2;
		Node<Integer> head = null, tail = null;
		if(t1.data <= t2.data) {
			head = t1;
			tail = t1;
			t1 = t1.next;
		}
		else {
			head = t2;
			tail = t2;
			t2 = t2.next;
		}
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {  //if t1 is small so head is not moving and only tail is moving as the tail
				tail.next = t1;
				tail = t1;
				t1 = t1.next;				
			}else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;				
			}			
		}
		if(t1 != null) {
			tail.next = t1;			
		}else {
			tail.next = t2;
		}
		return head;
	}
	
	
	public Node<Integer> mergeSort(Node<Integer> head){
		if (head == null || head.next == null) {
			return head;
			}
		Node<Integer> mid = findMidNode(head);
		Node<Integer> headPart1 = head;
		Node<Integer> headPart2 = mid.next;
		mid.next = null;
		headPart1 = mergeSort(headPart1);
		headPart2 = mergeSort(headPart2);
		Node<Integer> finalHead = mergeTwoSortedLL(headPart1, headPart2);
		return finalHead;
		}
	
	
	
	public void main(String[] args) {
//	 	Node<Integer> head = createLinkedList();
		Node<Integer> head = takeInput();
//		Node<Integer> head = takeInputRecursively();
		
//	 	System.out.println(head.data);
//	 	print(head);
//	 	Node<Integer> head1 = insertNode(head, 33, 34);
//	 	print(head1);
//	 	Node<Integer> delete_Node = deleteNode(head, 2);
//	 	print(delete_Node);
//	 	System.out.println("Printing append-");
//	 	Node<Integer> append = appendLastNToFirst(head, 3);
//	 	print(append);
//	 	printReverseNode(head);
	 	printRecursively(head);
//		head = insertNodeRecursively(head, 2, 100);
//		printRecursively(head);
//		Node<Integer> reverseHead = reverseLinkedList(head);
//		print(reverseHead);
	 	Node<Integer> mid =  findMidNode(head);
	 	System.out.println(mid.data);
		
	 	
	}
}
