package PatternProblems;
import java.util.Scanner;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

/*
 N = 4
 Output:
 4444
 333
 22
 1
 */

public class InvertedNumber {
    public static void main(String[] args) {

	Scanner s= new Scanner(System.in);
	int num = s.nextInt();
	
	for(int i =0;i<=num;i++){
		for(int j=num;j>i;j--){
			System.out.print(num-i);
		}
			
		System.out.println();
	}
		
	}
    
}
