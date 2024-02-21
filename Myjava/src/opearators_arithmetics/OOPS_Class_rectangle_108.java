package opearators_arithmetics;

class Rectangle{
	public double length;
	public double breadth;
	
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	public boolean isSquare() {
		if(length == breadth)
			return true;
		else 
			return false;
	}
}


public class OOPS_Class_rectangle_108 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		r1.length  = 6;
		r1.breadth = 6;
		
		System.out.println("Area is:                "+r1.area());
		System.out.println("Perimeter is:           "+r1.perimeter());
		System.out.println("Whether it is a SQUARE: "+r1.isSquare());

	}

}
