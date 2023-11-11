package PatternProblems;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
/*
 N = 5
 Output:
 E
 DE
 CDE
 BCDE
 ABCDE

 */
public class ReverseCharacters {
    	public static void main(String[] args) {
		//Your code goes here
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=0;i<num;i++){
			int c='A'+num-1;
			c=c-i;
			for(int j=0;j<=i;j++){
System.out.print((char)(c+j));
			}
			System.out.println();
		}
	}
}
