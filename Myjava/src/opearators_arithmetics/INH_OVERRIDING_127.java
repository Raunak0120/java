package opearators_arithmetics;

class Super1{
	public void display() {
		System.out.println("Super Class Display");
	}
}
class sub1 extends Super1{
	/*//@Override by these we redifine the super class */
	/*public void display() {// this method is for dispalying sub class without any parameter
		System.out.println("Sub Class Display");
	}*/
	public void display(int x) {
		System.out.println("Sub Class Display");
	}
}

public class INH_OVERRIDING_127 {

	public static void main(String[] args) {
		Super1 sup = new Super1();
		sup.display();
		sub1 s = new sub1();
		s.display();
	}

}
