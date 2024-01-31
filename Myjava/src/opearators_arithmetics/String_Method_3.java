package opearators_arithmetics;

public class String_Method_3 {

	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2 = "java";
		String s3 = "python";
		String s4 = "python";
		String s5 = new String("python");
		String s6 = "Java";
		System.out.println(s1.equals(s2));// it will print false as java is case sensitive
		System.out.println(s3.equals(s4));// it will print true
		System.out.println(s1.equalsIgnoreCase(s2));//this will print true as we ignore the case sensitive
		System.out.println(s3.equals(s5));// as the literals are equals it will print true
		System.out.println(s3 == s5);// this will print false as s3 reference and s5 reference are not equal as s3 reference is in pool and s5 reference is in heap
		System.out.println(s3 == s4);// this will print true as both the references s4 & s5 is same and stored in pool 
		System.out.println(s3.compareTo(s5));//this will print 0(zero) as both the contents are equals to dictionary order
		System.out.println(s2.compareTo(s6));//this will show 32 as smaller letter comes after the capital letter and 32 is the difference between the ASCI code
		System.out.println(s6.compareTo(s2));//this will show -32 as smaller letter comes after the capital letter and 32 is the difference between the ASCI code
		System.out.println(s6.compareToIgnoreCase(s2));//this will print 0 as ignore case is used.
		String s7 = "Taj Mahal is one of the seven wonders";
		System.out.println(s7.contains("one"));// this will print true as s7 string contains one.
		String s8 = "Taj Mahal is one";
		String s9 = "of the seven wonders";
		System.out.println(s8.concat(s9));// this will print Taj Mahal is one of the seven wonders it will concat 2 strings also
		System.out.println(s8 + s9);// this will also print Taj Mahal is one of the seven wonders
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
