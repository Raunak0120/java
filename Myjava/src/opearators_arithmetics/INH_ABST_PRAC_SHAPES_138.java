package opearators_arithmetics;

abstract class Shape{
	abstract public double perimeter();
	abstract public double area();
}
class circle extends Shape{
	double radius;
	
	public double perimeter(){
		return 2*Math.PI*radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
}
class rectangle extends Shape{
	double length, breadth;
	
	public double perimeter() {
		return 2*(length + breadth);
	}
	public double area() {
		return length*breadth;
	}
}

public class INH_ABST_PRAC_SHAPES_138 {

	public static void main(String[] args) {
		
		rectangle r = new rectangle();
		Shape s = r;
		r.length=10;
		r.breadth=5;
		System.out.println(s.area());
		circle c = new circle();
		c.radius=10;
		Shape d =c;
		System.out.println(d.area());
	}

}
