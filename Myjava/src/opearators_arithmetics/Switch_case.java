package opearators_arithmetics;
import java.util.*;

public class Switch_case {

	public static void main(String[] gin) {

		// find day
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter day number: ");
		int day = 5;  //sc.nextInt();
		
		switch(day){
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;		
		case 4: System.out.println("Thursday");
				break;		
		case 5: System.out.println("Friday");
				break;		
		case 6: System.out.println("Saturday");
				break;	
		case 7: System.out.println("Sunday");
				break;
		default: System.out.println("Invalid entry");
				break;
		}*/
		
		//find month 
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number:\s");
		int mon = sc.nextInt();
		switch(mon) {
		case 1: System.out.println("January");
			break;
		case 2: System.out.println("Feburary");
			break;
		case 3: System.out.println("March");
			break;
		case 4: System.out.println("April");
			break;
		case 5: System.out.println("May");
			break;
		case 6: System.out.println("June");
			break;
		case 7: System.out.println("July");	
			break;
		case 8: System.out.println("August");
			break;
		case 9: System.out.println("September");
			break;
		case 10: System.out.println("October");
			break;
		case 11: System.out.println("November");
			break;
		case 12: System.out.println("December");
			break;
		default : System.out.println("Invalid entry");
			break;
		}*/
		
		//Display type of website
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter url:\s");
		String url = sc.nextLine();
		String type =url.substring(url.lastIndexOf(".")+1);
		switch(type) {
		case "org": System.out.println("Organisation");
			break;
		case "com": System.out.println("Commercial");
			break;
		case "net":	System.out.println("Network");
			break;
		case "in": System.out.println("Indian");	
			break;
		default: System.out.println("Invalid Entry");
			break;
		}
		
		
		
		
		
	}

}
