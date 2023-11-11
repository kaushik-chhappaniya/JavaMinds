package Recursion;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class ConvertStringtoInt {
    public static int convertStringToInt(String input){
		// Write your code here
	if(input.length() == 1)
			return input.charAt(0)-'0';
		int smallAns = convertStringToInt(input.substring(0,input.length()-1));
		int lastDigit = input.charAt(input.length()-1)-'0';
		return smallAns*10 + lastDigit;
	}
    	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.convertStringToInt(input));
	}
}
