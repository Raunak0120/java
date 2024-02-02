package opearators_arithmetics;
import java.util.Scanner;

public class Conditional_statement {
	
	public static void main(String[] gin) {
		
		//Find the number is entered by user whether it is positive or negative =by if-else statement
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int x = sc.nextInt();
		if(x == 0) {
			System.out.println("Number is Positive");
		}
		else{
			System.out.println("Number is Negative");
		}*/
		
		// Find the grater variable entered by user using nested if
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. a: ");
		int a = sc.nextInt();
		System.out.println("Enter no. b: ");
		int b = sc.nextInt();
		System.out.println("Enter no. c: ");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.print("a is greater than b & c");
		}
		else {
			if(b>c) {
				System.out.println("b is greater than a & c");
			}
			
		else {
			System.out.println("c is greater than a & b");
		}
	  }*/
		
		//write the above program using else-if ladder
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		System.out.print("c = ");
		c = sc.nextInt();
		if (a == b && a == c) {
			System.out.println("a, b, c are same");
		}
		else if(a > b && a > c ) {
			System.out.println("a is greater than b & c");
		}
		else if (b>c) {
			System.out.println("b is greater than a & c");
		}
		else {
			System.out.println("c is greater than a & b");
		}
		 if (a==b && a>c) {
			 System.out.println("a & b are same and greater than c");
		 }
		 if(b==c && b > a) {
			 System.out.println("b & c are same and greater than a");
		 }
		 else if (a==c && a>b) {
			 System.out.println("a & c are same and greater than b");
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
