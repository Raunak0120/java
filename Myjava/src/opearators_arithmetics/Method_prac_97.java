package opearators_arithmetics;

public class Method_prac_97 {
	static int area (int l, int b) {
		int a;
		a = l*b;
		return a;
				
	}
	static double area(double r) {
		double a;
		a = Math.PI*r*r;
		return a;
	}
	static int area(int a) {
		int ar = a*a;
		return ar;
	}

	public static void main(String[] args) {
		System.out.print("Area of rectangle is: "+area(2, 4)+"\n");
		System.out.print("Area of circle is: "+area(5)+"\n");
		System.out.print("Area of square is: "+area(4)+"\n");
		

	}

}
