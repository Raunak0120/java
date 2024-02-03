package opearators_arithmetics;
import java.util.*;

public class Conditional_statement_2 {

	public static void main(String[] args) {
		
		// find radix of a number(Binary-2, octal-8, decimal-10, Hexa-16)
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your number: ");
		String num = sc.nextLine();
		if (num.matches("[01]+")) {
			System.out.println("Number is Binary & Radix is 2");
		}
		else if (num.matches("[0-7]+")) {
			System.out.println("Number is Octal & Radix is 8");
		}
		else if (num.matches("[0-9]+")) {
			System.out.println("Number is Decimal & Radix is 10");
		}
		else if (num.matches("[0-9A-F]+")) {
			System.out.println("Number is Hexa & Radix is 16");
		}
		else {
			System.out.println("Invalid Entry");
		}*/
		
		//Find Leap year
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year+ " is Leap year.");
				}
				else {
					System.out.println(year+ " is not a Leap year.");
				}
			}
			else {
				System.out.println(year+ " is Leap year.");
			}
			
		}
		else {
			System.out.println(year+ " is not a Leap year.");
		}
	}

}
