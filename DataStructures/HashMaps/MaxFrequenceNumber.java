package DataStructures.HashMaps;
import java.util.HashMap;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class MaxFrequenceNumber {
    public static int maxFrequencyNumber(int[] arr){ 
		int ans = 0, op = 0,i;
		HashMap<Integer, Integer> map = new HashMap<>();
		for( i = 0; i < arr.length; i++){
			if(map.containsKey(arr[i])){
				int value = map.get(arr[i]);
				map.put(arr[i], value+1);
				// ans = Math.max((value+1), ans);
				// op = arr[i];
			}else{
			map.put(arr[i], 1);
			}
			}
		int maxFreq = 0;
		int key = 0;
		for(int j = 0;j < arr.length; j++){
			int freq = map.get(arr[j]);
			if(maxFreq < freq ){
				maxFreq = freq;
				key = arr[j];
			}
		}
		return key;		
    }
}
