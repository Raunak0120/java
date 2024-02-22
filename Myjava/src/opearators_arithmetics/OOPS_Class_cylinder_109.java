package opearators_arithmetics;

class cylinder{
	public double radius;
	public double height;
	
	public double Sarea() {
		return (2*Math.PI*radius*radius) + (2*Math.PI*radius*height);
	}
	public double Larea() {
		return Math.PI*radius*radius;
	}
	public double volume() {
		return Larea()*height;
	}
}

public class OOPS_Class_cylinder_109 {

	public static void main(String[] gin) {
		
		cylinder c1 = new cylinder();
		
		c1.radius = 4;
		c1.height = 10;
		
		System.out.println("Surface area is:         "+c1.Sarea());
		System.out.println("Lid area is:             "+c1.Larea());
		System.out.println("Volume is:               "+c1.volume());
		
		

	}

}
