package basicJava;
import java.util.Scanner;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class PrintPrimeNumbers {
	/**
	 * Function Prints all prime numbers from 0 to the given number
	 * @param args
	 */
	public static void main(String[] args) {
			System.out.println("Enter a target number");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
            System.out.println("Printing prime numbers from 0 to the given number");
			int flag=0;
			for(int i=2;i<=n;i++) {
				flag = 1;
				for(int j = 2;j<=i/2;j++) {
					if(i%j==0) {
						flag = 0;
						break;
					}
				}
				if(flag==1) {
					System.out.println(i);
					}
			}
			s.close();
		}
	}
