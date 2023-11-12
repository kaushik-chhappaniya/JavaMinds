package basicJava;
import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("Enter a decimal number: ");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt(), placeVal=1, bin=0 , rem;
			while(n!=0) {
				rem = n%2;
				bin = bin + placeVal*rem;
				placeVal *= 10;
				n=n/2;
			}
			System.out.println(bin);
	}

}