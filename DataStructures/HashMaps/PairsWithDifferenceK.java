package DataStructures.HashMaps;

import java.util.HashMap;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class PairsWithDifferenceK {
    public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
		HashMap<Integer, Integer> hm = new HashMap<>();
		int count = 0;
		for(int n:arr){
			if(hm.containsKey(n + k)){
				count += hm.get(n+k);
			}
			if(hm.containsKey(n-k) && k != 0){
				count += hm.get(n-k);
			}
			if(hm.containsKey(n)){
				hm.put(n, hm.get(n)+1);
			}else{
				hm.put(n, 1);
			}
		}
			return count;
	}
}
