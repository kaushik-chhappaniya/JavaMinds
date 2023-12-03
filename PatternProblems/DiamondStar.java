package PatternProblems;
import java.util.Scanner;

/**
 * 
 * @param args
 */
/*
 * N = 5
  '  *  '
  ' *** '
  '*****'
  ' *** '
  '  *  '
 */
public class DiamondStar {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int d = (n/2)+1;
        for(int i=1;i<=d;i++){
			for(int j=d-i;j>=1;j-- ){
				 System.out.print(" ");
				  }
			for(int j=1;j<=2*i-1;j++){
                System.out.print("*");  
                }
                System.out.println();
        }

        //Second for loop
        for(int i=d-1;i>=1;i--){
            for(int j=0;j<d-i;j++){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
             
            System.out.println();
    }
}
}
