package opearators_arithmetics;

class Cylinder1{
	private double radius;
	private double height;
	
	public Cylinder1() {
		radius=height=1;
	}
	public Cylinder1(double r, double h) {
		radius=r;
		height=h;
	}
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public void setRadius(double r) {
		if (r>=0)
			radius=r;
		else
			radius=0;
	}
	public void setHeight(double h) {
		if(h>=0)
			height=h;
		else
			height=0;
	}
	public void setDimensions(double r, double h) {
		radius=r;
		height=h;
	}
	public double Sarea() {
		return (2*Math.PI*radius*radius)+(2*Math.PI*height*height);
	}
	public double Larea() {
		return Math.PI*radius*radius;
	}
	public double Volume() {
		return Larea()*height;
	}
}

public class OOPS_Cylinder_116 {

	public static void main(String[] args) {
		Cylinder1 c =new Cylinder1();
		c.setRadius(5);
		c.setHeight(8);
		c.setDimensions(5, 8);
		
		System.out.println("Radius is: "+c.getRadius());
		System.out.println("Height is: "+c.getHeight());
		System.out.println("Surface area is: "+c.Sarea());
		System.out.println("Lateral area is: "+c.Larea());
		System.out.println("Volume is:       "+c.Volume());

	}

}
