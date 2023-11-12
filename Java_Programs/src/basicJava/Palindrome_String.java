package basicJava;
import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string to check palindrome:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("got string");
		System.out.println(Palindrome(str));
		String str1="abc";
		String str2=str1+"";
		System.out.println("change"+str1==str2);
	}

	public static boolean Palindrome(String str) {
		boolean pal = false;
		int i = 0, len = str.length();
		while(i<=len-i-1) {
			if(str.charAt(i)==str.charAt(len-i-1)) {
				pal = true;
			}
			else
				return false;
		i++;
		}
		return pal;
	}
	

}
