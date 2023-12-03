package Recursion;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
       return  pal(str, 0, str.length()-1);
    }

    public static boolean pal(String str, int start, int end){
        if(start >= end)
        return true;
        if(str.length() == 1)
        return true;
        if(str.charAt(start) != str.charAt(end))
        return false;
        
        return pal(str, start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("enter a string:");
        String a = s.next();
        boolean isPal = isPalindrome(a);
        System.out.println("String is:"+ isPal);
    }
}
