package PatternProblems;
import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

/*
 * N = 3
 Output:
 *
 *1*
 *121*
 *12321*
 *121*
 *1*
 *
 
 */
public class HalfDiamond {
    public static void main(String[] args) {
        // Write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=1;
    System.out.println("*");
    for(;i<=n;i++){
            System.out.print("*");
        for(int j=1;j<=i;j++){
            System.out.print(j);}
            for(int j=i-1;j>0;j--){
                System.out.print(j);
            }

                System.out.print("*");
        System.out.println();
        }
    for(int j=i-2;j>=1;j--){
        System.out.print("*");
        for(int k=1;k<=j;k++){
            System.out.print(k);}
            for(int k=j-1;k>0;k--){
                System.out.print(k);
            }
                System.out.print("*");
        System.out.println();
    }
    System.out.println("*");
    }
}
