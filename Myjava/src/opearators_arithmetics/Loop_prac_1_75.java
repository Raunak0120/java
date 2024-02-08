package opearators_arithmetics;
import java.util.*;

public class Loop_prac_1_75 {

	public static void main(String[] gin) {
		
		// Display a number in words even with tailing 0 eg. 1700
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no.: ");
		int n = sc.nextInt();
		int r = 0;
		String str = "";
		while(n>0) {
			r = n%10;
			n = n/10;
			str = str + r;// here we use string because if we give into integer than after that the tailing 0 should not be there as if n = 1700 than by start the 
			// loop we get 71 only but by using string we convert it into string and it concatnate the 0's 
		}
		//System.out.println(str);
		
		char c;
		for(int i = str.length()-1;i>=0;i--) { //by giving i expressions we can store it into c in reverse order  
			c = str.charAt(i);// by given i expressions 
			
			switch (c) {
				case '0': System.out.print("Zero ");
							break;
				case '1': System.out.print("One ");			
							break;
				case '2': System.out.print("Two ");			
							break;
				case '3': System.out.print("Three ");			
							break;
				case '4': System.out.print("Four ");			
							break;
				case '5': System.out.print("Five ");			
							break;
				case '6': System.out.print("Six ");			
							break;
				case '7': System.out.print("Seven ");			
							break;
				case '8': System.out.print("Eight ");			
							break;
				case '9': System.out.print("Nine ");			
							break;
				default : System.out.println("Invalid");
							break;
			}
		}

	}

}
