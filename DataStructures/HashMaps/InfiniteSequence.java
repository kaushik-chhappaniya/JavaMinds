package DataStructures.HashMaps;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class InfiniteSequence {
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashMap<Integer,Integer> hm = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		for(int i = 0; i < n; i++){
			int dist = calculateDistance(arr.get(i), arr, i);
            arr.add(dist);
            if (hm.containsKey(dist)){
                hm.put(dist, hm.get(dist) + 1);    
            } else
            {
                hm.put(dist, 1);
            }    
        }
        System.out.println(hm.get(arr.get(n)));
		}
 	private static int calculateDistance(int x, ArrayList<Integer> arr, int num) {
        int count = 0;
        for (int j = num - 1; j > 0; j--) {
            count++;
            if (arr.get(j) == x) return count;
        }
        return 0;
    }
}
