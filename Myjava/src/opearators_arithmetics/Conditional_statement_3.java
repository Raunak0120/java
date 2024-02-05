package opearators_arithmetics;
import java.util.*;

public class Conditional_statement_3 {

	public static void main(String[] gin) {
		//Find day number
		
		/*Scanner sc = new Scanner (System.in);
		System.out.print("Enter day number: ");
		int day = sc.nextInt();
		if (day == 1 ) {
			System.out.println("Monday");
		}
		else if (day == 2 ) {
			System.out.println("Tuesday");
		}
		else if (day == 3 ) {
			System.out.println("Wednesday");
		}
		else if (day == 4 ) {
			System.out.println("Thursday");
		}
		else if (day == 5 ) {
			System.out.println("Friday");
		}
		else if (day == 6 ) {
			System.out.println("Saturday");
		}
		else if (day == 7 ) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("Invalid day number");
		}*/
		
		// Find the type of website and protocol used
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Website: ");
			String url = sc.next();
			String protocol = url.substring(0, url.indexOf(":"));
			if (protocol.equals("http")) {
				System.out.println("Hypertext Transfer Protocol");
			}
			else if(protocol.equals("ftp")) {
				System.out.println("File Transfer Protocol");
			}
			String ext = url.substring(url.lastIndexOf("."));
			
			if (ext.equals(".com")) {
				System.out.println("Commercial");
			}
			else if (ext.equals(".net")) {
				System.out.println("Network");
			}
			else if (ext.equals(".in")) {
				System.out.println("Indian");
			}
			else if (ext.equals(".org")) {
				System.out.println("Organisation");
			}
			
	}

}
