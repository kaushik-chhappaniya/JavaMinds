package basicJava;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

/**
 * @return returns the integral square root of the given number
 */
public class SqrtIntegral {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find out integral square root:");
		int n = s.nextInt();
		for(int i=0;i<=n;i++) {
			if(n==0) {
				System.out.println(0);
				return;
			}
			if(i*i>n) {
				System.out.println(i-1);
				return;
				}
			}
				
			
		}
	}

