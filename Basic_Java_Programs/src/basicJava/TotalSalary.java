package basicJava;
import java.util.Scanner;
public class TotalSalary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double da, hra, pf, totalSalary, allow, basicSalary;	
		System.out.println("Enter your grade from A or B or C:");
		String str = s.next();
		char grade = str.charAt(0);
		System.out.println("Enter your basic salary:");
		basicSalary = s.nextDouble();
		da = basicSalary*0.50;
		hra = basicSalary*0.20;
		pf = basicSalary*0.11; 
		totalSalary = Math.round(basicSalary+hra+da-pf);
		if (grade=='A') { allow = 1700;}
		else if(grade=='B') {allow = 1500;}
		else {	allow= 1300;	}
		System.out.println((int)(totalSalary+allow));
	}
}