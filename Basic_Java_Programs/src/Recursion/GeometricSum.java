package Recursion;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class GeometricSum {
    public static double findGeometricSum(int k){
		// Write your code here
		if(k == 0)
		{return 1;}
		double sum;
		sum = 1/Math.pow(2, k);
		return sum + findGeometricSum(k-1) ;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	
    }
}
