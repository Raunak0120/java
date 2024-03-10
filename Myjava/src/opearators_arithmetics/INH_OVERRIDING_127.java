package opearators_arithmetics;

class Super{
	public void display() {
		System.out.println("Super Class Display");
	}
}
class sub extends Super{
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
		Super sup = new Super();
		sup.display();
		sub s = new sub();
		s.display();
	}

}
