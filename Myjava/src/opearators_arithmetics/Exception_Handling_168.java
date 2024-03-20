package opearators_arithmetics;

import java.util.*;


public class Exception_Handling_168 {

	@SuppressWarnings("resource")// this for leaked resources errors
	public static void main(String[] args) {
	
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Number for Division ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try {
			c=a/b;
		System.out.println("Result of Division is: "+c);
		
		}
		catch(ArithmeticException e){
			System.out.println("Denomintor should not be 0, Try Again!!");
		}
		
		System.out.println("!!Bye!!");
	}
	

}
