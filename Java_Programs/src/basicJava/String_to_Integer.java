package basicJava;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * Nov 6, 2023
 */

 /**
  * @return the integer representation of a string
  */
public class String_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('7'-'1');
		int num = convertString("12345");
		System.out.println("ans - "+num);
	}
	
	public static int convertString(String str) {
		if(str.length() == 1)
			return str.charAt(0)-'0';
		int smallAns = convertString(str.substring(0,str.length()-1));
		System.out.println("smallAns -- "+smallAns);
		int lastDigit = str.charAt(str.length()-1)-'0';
		return smallAns*10 + lastDigit;
	}

}
