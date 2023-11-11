package PatternProblems;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

 /*
  *N = 3
  Output:
  ---
   ---
     ---
  */
public class ParallelogramPattern {
    public static void main(String[] args) {
		// Write your code here

	Scanner s =new Scanner(System.in);
	int n = s.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=1;j<i;j++){
			System.out.print(" ");
		}
		for(int j=n;j>=1;j--){
			System.out.print("*");
		}
	
System.out.println();
	}
}
}
