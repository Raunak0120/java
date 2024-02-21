package opearators_arithmetics;

public class Recursion_103 {

	static void fun (int n) {
		if (n>0) {
			System.out.println(n);
			fun(n-1);
		}
		
	}
	static void funs(int n) {
		if (n>0) {
			funs(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		//fun(3);
		funs(3);
		
	}

}
