package opearators_arithmetics;
//import java.util.Scanner;

public class Bit_Masking_and_Merging {
	public static void main(String[] args) {
		//Swapping Two number Using XOR (^) Operator
		//--> a = 9  &  b = 12
		
		/*Scanner sc = new Scanner(System.in);
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
		
		//--> I write down the steps if you want to check than delete // and you will see the results.
		
		System.out.println("a = " +a+ " " + "b = " +b);*/
		
		
		
		//--> Merging uses OR(|) and in these case also left shift(<<) operator & right shift (>>) operator
		
	/*	byte a = 9 , b = 12, c;
		System.out.println("Binary form of a is "+ String.format("%s",Integer.toBinaryString(a)));
		System.out.println("Binary form of b is "+ String.format("%s",Integer.toBinaryString(b)));
		c =(byte)a; 
		System.out.println("The value of c is "+ String.format("%s",Integer.toBinaryString(c)));
		c = (byte)(c << 4);
		c = (byte)(c|b);
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));*/
		
		// The above program can also be written as following
		// assuming we have to store 9 and 12 into x
		
		byte c;
		c = (byte)(9<<4);
		c = (byte)(c|12);
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));
	
	}

}
