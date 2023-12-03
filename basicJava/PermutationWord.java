package basicJava;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

public class PermutationWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string to check for permutation: ");
		String str1 = s.nextLine();
		System.out.println("Enter second string to check for permutation: ");
		String str2 = s.nextLine();
		int freqArr[] = new int[256];
		for(int i = 0; i< str1.length(); i++){
			freqArr[str1.charAt(i)]++;
		}
		for(int j = 0;j < str2.length(); j++)
			freqArr[str2.charAt(j)]--;
		for(int i=0;i<256;i++) {	
		if(freqArr[i]!=0)
			System.out.println("False");
		}
	}

}
