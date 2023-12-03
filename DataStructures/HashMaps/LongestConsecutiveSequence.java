package DataStructures.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {
	/**
	 * 
	 * @param arr
	 * @return array containing the longest incresing consecutive sequence. 
	 */
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		HashMap<Integer, Boolean> hm = new HashMap<>();
		int ansStart = Integer.MIN_VALUE, ansEnd = Integer.MIN_VALUE, maxLen = 0;
		for(int i = 0;i < arr.length; i++){
			hm.put(arr[i], true);
		}
		for(int i = 0; i < arr.length;i++){
			if(hm.containsKey(arr[i]-1))
				hm.put(arr[i], false);
		}
		for(int i = 0; i < arr.length; i++){
			if(hm.get(arr[i])){ //if sequence
				int j = arr[i];
				int currStart = arr[i], currEnd = arr[i];
				while(hm.containsKey(j)){
					currEnd = j;
					j++;
				}
				int count = currEnd - currStart + 1;
				if(count > maxLen){
					ansStart = currStart;
					ansEnd = currEnd;
					maxLen = count;
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(ansStart);
		ans.add(ansEnd);
		return ans;
    }
}
