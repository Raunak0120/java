package opearators_arithmetics;
import java.util.*;

public class GP_loop_76 {

	public static void main(String[] args) {
		// Display GP (Geometric Progression) Series eg. 2, 4, 8, 16, 32... and 3, 9, 27... --> GP = a + a*r + a*r^2 + a*r^3 + a*r^4....
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Geometric Progression");
		System.out.print("Enter first number of GP series ");
		int a = sc.nextInt();
		System.out.print("Enter ratio of GP ");
		int m = sc.nextInt();
		System.out.print("Enter length of GP series ");
		int l = sc.nextInt();
		
		
		for(int i=0;i<l;i++) {
			System.out.print(a+", ");
			a = a * m;
		}

	}

}
