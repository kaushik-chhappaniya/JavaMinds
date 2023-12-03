package DataStructures.LinkedList;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Prints the nodes in the linked list recursively
 */
public class PrintRecursively {
    /**
     * 
     * @param head
     */
    public static void printR(Node<Integer> head) {
		if(head == null)
			return;
		System.out.print(head.data +" ");
		printR(head.next);
	}
}
