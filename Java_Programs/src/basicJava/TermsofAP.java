package basicJava;
import java.util.Scanner;
public class TermsofAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 1, i;
		for(i=1;;i++){
			if(count==n+1) 
				break;
			else {
				int sum = 3*i+2;
				if(sum % 4 == 0)
					continue;
				else {
					System.out.println(sum);
					count+=1; }
				}
			}
		}
}
