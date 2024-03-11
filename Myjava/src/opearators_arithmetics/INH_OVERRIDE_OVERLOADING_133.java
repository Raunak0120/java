package opearators_arithmetics;

class overloading{
	public int max(int a, int b) {
		if (a>b)
			return a;
		else
			return b;
		}
	public int max(int a, int b, int c) {
		if (a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
}
class super2{
	public void display() {
		System.out.println("Super Display");
	}
}
class sub2 extends super2 {
	public void display() {
		System.out.println("Sub Display");
	}
}
public class INH_OVERRIDE_OVERLOADING_133 {

	public static void main(String[] args) {
		overloading ol = new overloading();
		System.out.println("Greater is: "+ol.max(5, 10));
		System.out.println("Greater is: "+ol.max(5, 10, 15));
		
		super2 sup = new sub2();
		sup.display();

	}

}
