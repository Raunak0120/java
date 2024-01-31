package opearators_arithmetics;

public class Challenge_regular_expression {

	public static void main(String[] args) {
		
		//To find binary
		
		/*int b = 11010101;
		String s = String.valueOf(b);
		System.out.println(s.matches("[01]*"));*/
		
		//To Find Hexadecimal
		
		/*String s = "A52342AEB";
		System.out.println(s.matches("[0-9 A-F]+"));*/
		
		//to find the date format (dd/mm/yyyy)
		
		/*String date = "31/01/2024";
		System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));*/
		
		// to replace special characters
		
		/*String s = "a!B@c#1%2&3";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));*/
		
		// to replace empty spaces
		
		/*String s = "		Raunak     Ankur      Maa    Bhiya 		";
		s = s.replaceAll("\\s+"," ").trim();// here we use replaceAll\\s+ to replace the spaces and trim is for deleting those leading and tailing spaces 
		System.out.println(s);
		//System.out.println(s.replaceAll("[^A-Z]",""));*/
		
		// to find the number of words in string
		
		String s = "		Raunak     Ankur      Maa    Bhiya 		";
		s = s.replaceAll("\\s+"," ").trim();// here we use replaceAll\\s+ to replace the spaces and trim is for deleting those leading and tailing spaces 
		String word[] = s.split("\\s");// here we use .split("\\s") to split the spaces from word to cont the length of the word string also we use word[]([] = array) to count separately the word of an array which is created 
		System.out.println(word.length);
		
		
		
	}

}
