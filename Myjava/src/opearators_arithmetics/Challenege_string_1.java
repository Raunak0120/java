package opearators_arithmetics;

public class Challenege_string_1 {

	public static void main(String[] args) {
		String s = "programmer@gmail.com";
		int i = s.indexOf('@');
		String uname = s.substring(0,i);
		String domain =  s.substring(i+1,s.length());
		
		System.out.println("User name: " + uname);
		System.out.println("Domain name: " + domain);
		
		int a = domain.indexOf(".");
		String b = domain.substring(0,a);
		System.out.println(b.equals("gmail"));
		

	}

}
