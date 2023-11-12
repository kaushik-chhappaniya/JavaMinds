package Recursion;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */


public class CountDigits {
    public static int countDigits(int n){
        // Write your code here.
        int count = 1;
        if(n <= 9)
        // if(n / 10 == 0)
            return 1;
        return count + countDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        int ans = countDigits(num);
        System.out.println(ans);
    }
}
