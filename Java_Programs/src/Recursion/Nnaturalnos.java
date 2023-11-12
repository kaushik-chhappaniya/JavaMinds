package Recursion;

import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class Nnaturalnos {
    public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
        System.out.println("Enter a number and power:");
        int num = s.nextInt();
        print(num);
    }

    public static void print(int n){
		//Write your code here
	if(n == 0)
		return;
	print(n-1);
	System.out.print(n + " ");
}    
}
