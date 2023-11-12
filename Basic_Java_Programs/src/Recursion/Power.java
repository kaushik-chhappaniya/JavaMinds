package Recursion;

import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class Power {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number and power:");
        int num = s.nextInt(), power = s.nextInt();
        int ans = power(num, power);
        System.out.println(ans);
    }
    
    public static int power(int x, int n) {
			if(n == 0)
				return 1;
			int temp = power(x , n/2);
			temp *= temp;
			if(n%2 == 0)
				return temp;
			else
				return temp*x;
	}
}
