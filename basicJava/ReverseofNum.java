package basicJava;
import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

public class ReverseofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to reverse:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rem = 0,sum=0;
		while(n!=0) {
			rem  = n%10;
			n = n/10;
			sum =sum*10+rem;
		}
		System.out.println(sum);
	}

}
