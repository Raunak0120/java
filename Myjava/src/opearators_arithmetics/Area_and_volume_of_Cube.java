package opearators_arithmetics;
import java.util.Scanner;

public class Area_and_volume_of_Cube {

	public static void main(String[] args) {
		float a;
		double area, volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side Of a cube ");
		a = sc.nextFloat();
		area = 6*(a*a);
		volume = a*a*a;
		System.out.println("Area is " +area+ " & "+"Volume is "+volume);
		

	}

}
