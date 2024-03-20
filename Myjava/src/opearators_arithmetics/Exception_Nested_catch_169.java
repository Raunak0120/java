package opearators_arithmetics;

public class Exception_Nested_catch_169 {

	public static void main(String[] args) {
		int A[]= {30, 20, 40, 10, 0};
		try {
		int c=A[0]/A[4];
		System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("Denomintor should not be 0, Try Again!!");
		}
		try {
		System.out.println(A[5]);
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("Invalid Index");
		}
		System.out.println("!!Bye!!");
		
	
	
	}

}
