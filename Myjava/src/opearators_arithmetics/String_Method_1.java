package opearators_arithmetics;

public class String_Method_1 {

	public static void main(String[] args) {
		// To find length of a string
		
		/*String s1 = "Java";
		int l = s1.length();
		System.out.println(l);// this will print 4 as the length of java is 4*/
		
		//To lowercase the string
		
		/*String s1 = "JAVA";
		System.out.print(s1 + " ");
		s1 = s1.toLowerCase();
		System.out.println(   s1);// this will print java in lower case*/
		
		// To upper case the string
		
		/*String s1 = "java";
		System.out.print(s1 + " ");
		s1 = s1.toUpperCase();
		System.out.println(s1); //this will print the string in uppercase*/
		
		//to trim the string
		
		/*String s1 = "		Java Program		";
		s1 = s1.trim();
		System.out.println(s1);//this will trim the spaces and print (Java Program) after or before that is entered through us or the user
		s1 = s1.substring(2);
		System.out.println(s1);//this will print (va program) as we uses substring it will print where we put the index in these case we put index 2 
		s1 = s1.substring(2,9);
		System.out.println(s1);//this will print (va prog) it will include index 2 but will exclude index 9 */
		
		String s1 = "Taunak";
		System.out.print(s1 + " --> ");
		s1 = s1.replace('T', 'R');
		System.out.println(s1);
		
	}

}
