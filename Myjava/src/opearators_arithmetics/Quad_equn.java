package opearators_arithmetics;
import java.util.Scanner;

public class Quad_equn {
	public static void main(String[] args)
	{
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		double r1,r2;
		r1 = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
		r2 = ((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
		System.out.println(r1);
		System.out.println(r2);
	}

}
