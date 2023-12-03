package basicJava;
import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

public class RemoveConseqDupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String ans ="";
		int j=-1;
		for(int i = 0;i < s.length()-1; i++) {
			if(i==0) {
				ans += s.charAt(0);
				j++;
				}
			if(ans.charAt(j) != s.charAt(i)) {
				ans += s.charAt(i);
				j++;
				}
			}
		System.out.println(ans);
			}

}
