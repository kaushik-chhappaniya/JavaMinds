package basicJava;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

public class Sequence {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number to check sequence:");
	int n = s.nextInt();
	System.out.println("Enter next sequence number");
	int prev = s.nextInt();
	for(int i=1;i<n;i++) {
		int current = s.nextInt();
		if(current==prev) {
			System.out.println("false");
			return;
		}
		boolean decreasing = false, increasing = false;
		if(current<prev) {
			decreasing = true;
			if(increasing) {
				System.out.print("false");
				return;
			}
		}
		else if(current>prev) {
			increasing = true;
			if(decreasing) {
				System.out.print("false");
				return;	
			}
		}
		prev = current;
		
	}
	System.out.println("true");
}
}
