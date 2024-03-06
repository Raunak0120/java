package opearators_arithmetics;

class parent{
	public parent() {
		System.out.println("Parent Constructor");
	}
}
class child extends parent{
	public child() {
		System.out.println("Child Constructor");
	}
}
/*class Grandchild extends child{  // here we extends from child it will include child constructor and as well as parent constructor
	public Grandchild() {
		System.out.println("Grand Child Constructor");
	}
}*/
class Grandchild extends parent{ //here we extends from parent it will include only parent constructor
	public Grandchild() {
		System.out.println("Grand Child Constructor");
	}
}

public class INH_Const_eg_123 {

	public static void main(String[] args) {
		Grandchild gc = new Grandchild();

	}

}
