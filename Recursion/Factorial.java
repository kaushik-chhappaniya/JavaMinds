package Recursion;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class Factorial {
        public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
    }
        return n * fact(n-1);
    }

    public static void main()
    {
        int num;
        Scanner	s =	new	Scanner(System.in);
        num	=	s.nextInt();
        System.out.println(fact(num));
        return ;
    }
}
