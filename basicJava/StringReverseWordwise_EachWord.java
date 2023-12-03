package basicJava;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

 /**
  * @return the reverse of the sentence wordwise
  */
public class StringReverseWordwise_EachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String str1 = s.nextLine();		

		System.out.println( " \n Reverse Only words - "+ StringReverseWordwise(str1) +" \n Reverse Each word - " + reverseEachWord(str1) );
	}
	
	public static String StringReverseWordwise(String input) {
		String ans = "";
		int currentWordStart = 0, i;
		for(i = 0; i<input.length()-1;i++){
			if(input.charAt(i) ==' '){
				ans = input.substring(currentWordStart, i) + " " + ans;
				currentWordStart = i+1 ;
			}
		}
		ans = input.substring(currentWordStart , i+1) + " " + ans;
		return ans;
	}
	
	
	public static String reverseEachWord(String str) {
		//Your code goes here
		String ans = "";
		int currentWordStart = 0, i;
		for(i = 0; i<str.length()-1;i++){
			if(str.charAt(i) ==' '){
				int currentWordEnd = i-1;
				String reverseWord = "";
				for(int j = currentWordStart ; j <= currentWordEnd ;j++){
					reverseWord = str.charAt(j) + reverseWord;
					}
				currentWordStart = i+1 ;
				ans += reverseWord + " ";
			}
		}
		int currentWordEnd = i;
		String reverseWord = "";
		for(int j = currentWordStart; j <= currentWordEnd; j++ )
			reverseWord = str.charAt(j) + reverseWord;
		ans += reverseWord + " ";
		return ans;
		
	}

}
