package opearators_arithmetics;
import java.util.*;

public class Fibonacci_series_loop_76_3 {

	public static void main(String[] args) {
		// Display Fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55....--> fib(n) = fib(n-2) +  fib(n-1) where n-1 and n-2 are places
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci Series");
		System.out.print("Enter length of Fibonacci series: ");
		
		int l =sc.nextInt();
		int a=0, b=1, c;
		
		System.out.print(a+", "+b+", ");
		
		for (int i=0; i<(l-2); i++) {
			c = a+b;
			System.out.print(c+", ");
			a=b;
			b=c;
		}

		
		
		
	}

}
