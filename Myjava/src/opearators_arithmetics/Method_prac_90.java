package opearators_arithmetics;

public class Method_prac_90 {
	/*//static int max(int x,int y) {// here int is return type and max is a name and parameters are x and y here also we use static as static method only called static method
	     int max(int x,int y) {// above is also used but if we don't want to use static than
		if(x>y) 
			return x;  // here return is important if we don't use return it throws error
		else
			return y;
	}*/
	
	   static void inc (int x) {
		   x++;
		   System.out.println(x);
		
	}
	

	public static void main(String[] gin) {
		int a=10,b=15;
		//Method_prac_90 mp= new Method_prac_90(); // if we does not use static than we have to write these also we create object of a class as Method_prac_90 is class and we create an object mp through it
		//System.out.println(mp.max(a,b));
		inc(a);
		
		System.out.println(a);
		// here we can see that in above x will become 11 and a remains 10
	}

}
