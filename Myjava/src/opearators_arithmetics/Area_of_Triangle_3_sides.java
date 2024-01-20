package opearators_arithmetics;
import java.util.Scanner;
public class Area_of_Triangle_3_sides {
	public static void main(String[] args)
	{
		float a,b,c,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides of triangle ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		s = (a+b+c)/2;
		double area;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
		
		
		
	}

}
