package DataStructures.HashMaps;

import java.util.HashMap;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class PairSum {
	/**
	 * 
	 * @param input
	 * @param size
	 * @return the count of the elements summing together to zero.
	 */
    	public static int PairSum(int[] input, int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int pairCount = 0;
		for(int i = 0; i < input.length; i++){
			if(map.containsKey(input[i])){
				int value = map.get(input[i]);
				map.put(input[i], value+1);
			}else{
				map.put(input[i], 1);
			}
			}
		for(int i = 0; i< input.length; i++){
			if(input[i] == 0){
				int freqZero = map.get(0);
				pairCount += freqZero * (freqZero - 1)/2;
				map.put(input[i], 0);
				continue;
			}
			if(map.containsKey(-input[i])){
				int originalFreq = map.get(input[i]);
				int negativeEleFreq = map.get(-input[i]);
				pairCount += originalFreq * negativeEleFreq;
			}
			map.put(input[i], 0);
		}
		return pairCount;
		}
}
