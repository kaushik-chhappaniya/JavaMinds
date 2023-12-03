package DataStructures.HashMaps;

import java.util.HashMap;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class ExtractUniques {
	/**
	 * 
	 * @param str
	 * @return String with unique characters extracted from the string
	 */
    public static String uniqueChar(String str){
		HashMap<Character, Integer> hm = new HashMap<>();
		String s ="";
		for(int i  = 0; i < str.length();i++){
			if(hm.containsKey(str.charAt(i))){
				continue;
			}else{
				s += str.charAt(i);
				hm.put(str.charAt(i), 1);
			}
		}
		return s;
	}
}
