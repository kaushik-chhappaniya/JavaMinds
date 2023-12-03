package PatternProblems;

import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

/*
 N = 4
 Output:
 A
 BC
 CDE
 DEFG
 */
public class CharacterPattern {
    	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i=0;i<num;i++){
		int c='A';
	    c=c+i;
	   // System.out.print("---"+c);
	    for(int j=0;j<=i;j++){
			System.out.print((char)(c+j));
	    	}	
	    System.out.println();
        }
	}
   
}
