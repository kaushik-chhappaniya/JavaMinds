package DataStructures.HashMaps;

import java.util.HashMap;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class LengthOfLongestSubsetWithZeroSum {
	/**
	 * 
	 * @param arr
	 * @return the length of the longest subset with sum as zero from the given array.
	 */
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int sum =0, maxLen = -1;
		for (int i=0;i<arr.length;i++)
        {
			sum += arr[i];
			if(sum == 0)
				maxLen = i+1;
			if(hm.containsKey(sum)){
				int prevIndex=hm.get(sum);
				int currLen=i-prevIndex;
				  if (currLen>maxLen)
                    maxLen=currLen;
			}
			else{
				hm.put(sum, i);
			}
		}
			return maxLen;
	}
}
