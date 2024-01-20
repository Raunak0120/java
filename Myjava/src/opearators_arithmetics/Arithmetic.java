package opearators_arithmetics;
import java.util.Scanner;
public class Arithmetic {
		public static void main(String[] args)
		{
			float a,b,h;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Base and Hieght");
			b = s.nextFloat();
			h = s.nextFloat();
			a = (b*h)/2;
			System.out.println(a);
		}

}
