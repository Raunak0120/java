package opearators_arithmetics;

public class Exception_Handling_Finally_Block_174 {
	static void meth1()throws Exception{
		try {
			throw new Exception();
		}
		/*catch(Exception e) {  // if we write catch method that means we handle Exception so finally is not required
			System.out.println(e);
		}*/
		finally {// this will print the message if there was error or not for better understanding run the program
			System.out.println("Final Message");
		}
	}

	public static void main(String[] args)throws Exception {
		meth1();

	}

}
