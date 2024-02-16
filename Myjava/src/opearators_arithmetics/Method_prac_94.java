package opearators_arithmetics;
import java.util.*;

public class Method_prac_94 {
	static boolean prime(int n) {
		for (int i=2;i<=(n/2);i++) {
			if (n%i == 0) 
				return false;
				}
		return true;
	}

	public static void main(String[] gin) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your no.: ");
		int m = sc.nextInt();
		if(prime(m)) {
			System.out.println(m+" is a prime number");	
		}
		else {
			System.out.println(m+" is not a prime nmber");
		}

	}

}
