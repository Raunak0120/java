package opearators_arithmetics;

abstract class Super3{
	public Super3() {
		System.out.println("Super Constructor");
	}
	public void meth1() {
		System.out.println("Super Meth 1");
	}
	abstract public void meth2();
}
class Sub3 extends Super3{
	@Override
	public void meth2() {
		System.out.println("Sub Meth 2");
	}
}

public class INH_Abstract_135 {

	public static void main(String[] args) {
		Super3 sup =new Sub3();
		sup.meth1();
		sup.meth2();
		

	}

}
