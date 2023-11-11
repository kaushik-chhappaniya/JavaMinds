package Recursion;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
	if(s.length() <= 1)
		return s;
	String str = removeConsecutiveDuplicates(s.substring(1));
	if(str.charAt(0) == s.charAt(0))
		return str;
	else
		return s.charAt(0) + str;
	}

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(removeConsecutiveDuplicates(input));

    }
}
