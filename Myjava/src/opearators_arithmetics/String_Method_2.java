package opearators_arithmetics;

public class String_Method_2 {
	public static void main(String[] gin) {
		
		//starts or ends with
		
		String s1 = "www.lootera.in";
		System.out.println(s1.startsWith("www"));//this will print true as string does starts with www
		System.out.println(s1.startsWith("xyz"));//this will print false as string does'nt starts with xyz
		System.out.println(s1.endsWith("in"));//this will print true as string does ends with in
		System.out.println(s1.endsWith("org"));//this will print false as string does not ends with org
		System.out.println(s1.charAt(7));// it will print "t" as the 7th index is t in string s1
		System.out.println(s1.indexOf('.'));// this will print the position of '.' present in string
		System.out.println(s1.indexOf('.',6));//as there is 2 '.' is present so we give the index i=and it will search after that index including that index no.
		System.out.println(s1.lastIndexOf('.'));//this will print the position of '.' from last as we use lastIndexOf it will print the index from right to left
		System.out.println(s1.lastIndexOf('.',10));//similarly there is 2 '.' present so we gave the index no. and it will search after that no. including index no. from right to left 
		
		
		
		
	}

}
