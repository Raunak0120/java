package opearators_arithmetics;
import java.util.*;

public class switch_case_calculator {

	public static void main(String[] gin) {
	// Calculator using switch case.
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Calculator");
		System.out.println("__________");
		System.out.println("Chhose option");
		System.out.println("_____________");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		System.out.println("%");
		
		System.out.println("Enter 2 Number");
		int x = sc.nextInt();
		float y = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter option. As shown above");
		String opt = sc.nextLine();
		
		
		switch(opt) {
		case "+": System.out.println("Sum is: "+(x + y));
					break;
		case "-":	System.out.println("Difference is: "+(x - y));	
					break;
		case "*": System.out.println("Product is: "+(x * y));	
					break;
		case "/": System.out.println("Ratio is: "+(x / y));
					break;
		case "%": System.out.println("Percentage is "+(x*(y/100))); 			
					break;
		default: System.out.println("Invalid Option! Please Choose from above");	
					break;
		}
		

	}

}
