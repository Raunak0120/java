package opearators_arithmetics;

public class String_Object {
	public static void main(String[] args) {
		String s1 = "java Program";
	    System.out.println(s1);	
		
		String s2 = new String("Java");
		System.out.println(s2);
		
		char c[] = {'H','e','l','l','o'}; // [] bracket use for Array 
		String s3 = new String(c);
		System.out.println(s3);
		
		byte b[] = {65,66,67,68};  // in unicode 65 = A, 66 = B, 67 = C, 68 = D
		String s4 = new String(b);
		System.out.println(s4);
		
		//  Also 
		
		char d[] = {'R','a','u','n','a','k'};
		String s5 = new String(d,1,3);
		System.out.println(s5);// This will print only aun as we specify 1 & 3 1 is for where to start the index and 3 is for no.of letters you want
		 
		//Similarly this will use for byte also
		
		byte e[] = {65,66,67,68,69,70};
		String s6 = new String(e,2,4);
		System.out.println(s6);// this will print CDEF as we start the index by 2 and want print 4 letters
		
		// for checking pool if pool contain same value or not
		
		String s7 = "Java 2";
		String s8 = "Java 2";
		String s9 = "java 2";
		String s10 = new String("Java 2");
		System.out.println(s8 == s7);// this will print true as once you assign a value it contains there and does not create another object same as once you created
		System.out.println(s7 == s9);// this will print false as java is case sensitive
		System.out.println(s8 == s10);// this will print false as s10 string is created in heap and above all that are literals
		
	}

}
