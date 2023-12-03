package DataStructures.HashMaps;

import java.util.Arrays;
import java.util.HashMap;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class Intersection {
		/**
		 * Prints the intersection of both the given arrays.
		 * @param arr1
		 * @param arr2
		 */
	public static void intersection(int[] arr1, int[] arr2) {
	 	HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr1.length; i++){
			if(map.containsKey(arr1[i])){
				int value = map.get(arr1[i]);
				map.put(arr1[i], value+1);
			}else{
			map.put(arr1[i], 1);
				}
			}
		Arrays.sort(arr2);	
		for(int j = 0;j < arr2.length; j++){
			if(map.containsKey(arr2[j]) && map.get(arr2[j])>0 ){
				System.out.print(arr2[j] + " ");
				map.put(arr2[j], map.get(arr2[j])-1);
			}
		}
	}
}
