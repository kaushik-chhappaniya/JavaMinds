package PatternProblems;
import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

 /*
   N = 4
        1
       232
      34543
     4567654
  */
public class TriangleOfNumbers {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
				}
				int k=0;
			for(k=0;k<i;k++){
				System.out.print(i+k);
				}
			for( int j=k+i-1;j>i;j--)
				{
					System.out.print(j-1);
				}
			System.out.println();
		}
	}
}