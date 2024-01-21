package opearators_arithmetics;
import java.util.Scanner;
public class Area_and_Volume_of_cubiod_ {
	public static void main(String[] args) {
		float l,b,h;
		double a,v;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length, Breadth, Height");
		l = sc.nextFloat();
		b = sc.nextFloat();
		h = sc.nextFloat();
		a = 2*((l*b)+(b*h)+(l*h));
		v = l*b*h;
		System.out.println("Area is" +a+ " "+"Volume is" +v);
	}

}
