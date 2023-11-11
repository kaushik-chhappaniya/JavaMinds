package basicJava;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */


public class BinaryToDecimal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a binary number: ");
		Scanner s = new Scanner(System.in);
		int bin = s.nextInt(), rem=0, decimal=0, i=0;
		while(bin!=0) {
			rem = bin%10;
			decimal = decimal + rem*(1<<i);
			bin/=10;
			i+=1;
		}
		System.out.println(decimal);
	}
}
