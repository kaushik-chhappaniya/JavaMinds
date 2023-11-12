package DataStructures;
import java.util.LinkedList;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class CollectionsLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.get(1);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
	}

}
