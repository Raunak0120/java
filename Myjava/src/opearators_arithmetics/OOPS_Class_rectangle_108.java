package opearators_arithmetics;

import java.util.Scanner;

class Rectangle{
	public double length;
	public double breadth;
	
	public double perimeter(){
		return 2*(length + breadth);
	}
	
	public double area() {
		return length * breadth;
	}
	public boolean isSquare() {
		if (length == breadth)
				return true;
		else
			return false;
	}
	
}
public class OOPS_Class_rectangle_108{
	public static void main(String[] args) {
		
		Rectangle re = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length:  ");
		re.length=sc.nextDouble();
		System.out.print("Enter Breadth: ");
		re.breadth=sc.nextDouble();
		
		System.out.println("The perimeter is: "+re.perimeter());
		System.out.println("The area is:      "+re.area());
		System.out.println(re.isSquare());

	}

}
