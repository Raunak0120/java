package opearators_arithmetics;

class Super{
	public void meth1() {
		System.out.println("Super Method 1");
	}
	public void meth2() {
		System.out.println("Super Method 2");
	}
}
class Sub extends Super{
	public void meth2(){
		System.out.println("Sub Method 2");
	}
	public void meth3() {
		System.out.println("Sub Method 3");
	}
}

public class INH_Dynamic_Method_Dispatch_131 {

	public static void main(String[] args) {
		
		Super sup = new Super();
		sup.meth1();
		sup.meth2();
		
		System.out.println();
		
		Sub sb = new Sub();
		
		sb.meth1();
		sb.meth2();
		sb.meth3();
	
		System.out.println();
		
		Super s = new Sub();
		s.meth1();//this will print super's class meth1
		s.meth2();// this will print sub class meth2 as it shadowed the super's class meth2
		//s.meth3();// it will not be called as it is not be present in Super class

	}

}
