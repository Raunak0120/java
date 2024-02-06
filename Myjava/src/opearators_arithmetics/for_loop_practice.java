package opearators_arithmetics;
import java.util.*;

public class for_loop_practice {

	public static void main(String[] args) {
		
		//multiplication table of n
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n =sc.nextInt();
		System.out.println("Multplication Table of "+n+" is:");
		System.out.println("________________________________");
		
		for(int i=1; i<=10 ;i++) {
			System.out.println(n+" X "+i+"\s=\s"+(n*i));		
		}*/
		
		//find sum of n numbers
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n =sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of "+n+" is "+sum);*/
		
		//find factorial of n
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int fac = 1;
		for (int i=1; i<=n; i++) {
			fac = fac * i;	
		}
		System.out.println(fac);
	}

}
