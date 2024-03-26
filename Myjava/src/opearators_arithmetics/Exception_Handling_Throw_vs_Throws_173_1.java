package opearators_arithmetics;

class NegativeDimensionException extends Exception{// we can create our own Exceptions by making a class of that Exception 
	public String toString(){
		return "Dimensions of rectangle cannot be Negative";
	}
}

public class Exception_Handling_Throw_vs_Throws_173_1 {
	static int area(int l, int b)throws NegativeDimensionException {// here we write throws because it throws exception to other method to further throw to another method we have to write throws in that method
		
		if(l>0 || b>0) {
			throw new NegativeDimensionException();
		}	
		else {
		return l*b;
		}
	}
	static void meth1()throws NegativeDimensionException {
		System.out.println(area(10, 3));
	}

	public static void main(String[] args) {
		try {  // to break throws we have to handle the exception by ourself by try and catch method
		meth1();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
