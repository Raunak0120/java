package opearators_arithmetics;

class Circle{
	public double radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	public double circumference() {
		return perimeter();
	}
}
public class OOPS_Class_circle_107 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.radius = 5;
		c2.radius = 10;
		
		System.out.print("Area is:          "+c1.area()+"\n");
		System.out.print("Perimeter is:     "+c1.perimeter()+"\n");
		System.out.print("Circumference is: "+c1.circumference()+"\n");
		
		System.out.println();
		
		
		System.out.print("Area2 is:          "+c2.area()+"\n");
		System.out.print("Perimeter2 is:     "+c2.perimeter()+"\n");
		System.out.print("Circumference2 is: "+c2.circumference()+"\n");

	}

}
