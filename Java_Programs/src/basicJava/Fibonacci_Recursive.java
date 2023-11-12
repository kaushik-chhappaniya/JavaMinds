package basicJava;
import java.util.Scanner;

 /**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

 
public class Fibonacci_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0, num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:"); 
		num = scanner.nextInt();
		ans = fibo(num);
		System.out.println(ans);
	}
	
	public static int fibo(int num) {
		if(num == 0)
			return 0;
		if(num == 1 || num == 2 )
			return 1; 
		return fibo(num-1) + fibo(num-2);
	}

}
