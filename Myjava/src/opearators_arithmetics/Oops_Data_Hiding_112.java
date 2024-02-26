package opearators_arithmetics;


class rectangle2{
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setLength(double l) {
		if(l>=0)
			length = l;
		else
			length = 0;
	}
	public void setBreadth(double b) {
		if(b>=0)
			breadth = b;
		else
			breadth = 0;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	public double area() {
		return length*breadth;
	}
	public boolean isSquare() {
		if(length == breadth)
			return true;
		else 
			return false;
	}
}



public class Oops_Data_Hiding_112 {

	public static void main(String[] args) {
		rectangle2 r2 = new rectangle2();
		
		r2.setLength(6);
		r2.setBreadth(6);
		
		System.out.println("Area is:      "+r2.area());
		System.out.println("Perimeter is: "+r2.perimeter());
		System.out.println(r2.isSquare());
		
		
		
		
	}

}
