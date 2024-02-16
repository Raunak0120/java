package opearators_arithmetics;
import java.util.*;

public class GCD_method_prac_94_2 {
	static int gcd(int m, int n) {
		while (m!=n) {
			if (m>n) m = m-n;
			else n = n-m; 
		}
		return m; // her m and n are equal so we can write whether m and n
	}

	public static void main(String[] gin) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.1: ");
		int m = sc.nextInt();
		System.out.print("Enter no.2: ");
		int n = sc.nextInt();
		System.out.println("GCD is: "+gcd(m,n));

	}

}
