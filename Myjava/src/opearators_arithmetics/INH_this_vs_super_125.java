package opearators_arithmetics;
class rectangle3{
	int length, breadth;
	int x =10;
	rectangle3(int l, int b){
		this.length=l;
		this.breadth=b;
	}
	void display() {
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
}
class cubiod3 extends rectangle3{
	int height;
	int x=20;
	cubiod3(int l, int b, int h){
		super(l, b);
		this.height=h;
	}
	void display() {
		System.out.println(super.breadth);
		System.out.println(super.length);
		System.out.println("Height: "+this.height);
		System.out.println(super.x);
		System.out.println(x);
	}
}
public class INH_this_vs_super_125 {

	public static void main(String[] gin) {
		cubiod3 c =new cubiod3(10, 5, 2);
		c.display();

	}

}
