package opearators_arithmetics;

class parent1{
	public parent1() {
		System.out.println("Non Param of parent");
	}
	public parent1(int x) {
		System.out.println("Param of Parent"+x);
	}
}
class child1 extends parent1{
	public child1() {
		System.out.println("Non param of Child");
	}
	public child1(int y) {
		System.out.println("Param of Child "+y);
	}
	public child1(int x, int y) {
		super(x);
		System.out.println("Double param of Child");
		
	}
}

public class INH_Par_Cons_child_124 {

	public static void main(String[] args) {
		
		//child1 c = new child1();
		//child1 c1 = new child1(15);
		child1 c2 = new child1(10, 20);
	}

}
