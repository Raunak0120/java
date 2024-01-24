package opearators_arithmetics;
import java.util.Scanner;

public class Bit_Masking_and_Merging {
	public static void main(String[] args) {
		//Swapping Two number Using XOR (^) Operator
		//--> a = 9  &  b = 12
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value of a = ");
		int a = sc.nextInt();
		System.out.print("Enter The value of b = ");
		int b = sc.nextInt();
		a = a ^ b;
		//System.out.println("The value of a is " +a);
		//System.out.println("Binary form of a is "+String.format("%S",Integer.toBinaryString(a)));
		
		b = a ^ b;
		//System.out.println("The value of b is "+b);
		//System.out.println("Binary form of b is "+String.format("%s",Integer.toBinaryString(b)));
		
		a = a ^ b;
		//System.out.println("The value of a is "+a);
		//System.out.println("Binary form of a is " +String.format("%s",Integer.toBinaryString(a)));
		
		System.out.println("a = " +a+ " " + "b = " +b);
	}

}
