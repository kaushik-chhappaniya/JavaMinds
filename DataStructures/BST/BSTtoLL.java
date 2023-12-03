package DataStructures.BST;
import java.util.LinkedList;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

// Class to create linked list from a BST
public class BSTtoLL {

    /**
     * 
     * @param root
     * @return the root node of the tree in inorder
     */
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        return constructLinkedListHelper(root).head;
    }
    /**
     * @logic get left and right subtrees using base case - if null create a new pair node and return it.
     * if left-tail != null attach root.data to left.next
     * if left-head != null attach attach left-head to pair-head | else attach new node to pair-head
     * if right-tail != null attach right-tail to pair-tail | else attach new node to pair-tail
     * return pair
     * @param root
     * @return PairNode with tail and head node
     */
    private static PairNode constructLinkedListHelper(BinaryTreeNode<Integer> root) {
        if(root == null) {
            PairNode pair = new PairNode();
            return pair;
        }
        LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);
        PairNode leftList = constructLinkedListHelper(root.left);
        PairNode rightList = constructLinkedListHelper(root.right);
        PairNode pair = new PairNode();
        if(leftList.tail != null) 
            leftList.tail.next = newNode;
        newNode.next = rightList.head;
        if(leftList.head != null)
            pair.head = leftList.head;
        else
            pair.head = newNode;

        if(rightList.tail != null)
            pair.tail = rightList.tail;
        else
            pair.tail = newNode;
        return pair;
    }
}

// Class to return the head and tail of the linked list
class PairNode{
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;    
}

// Class for Linked List node
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    public LinkedListNode(T data) {
        this.data = data;
    }
}
