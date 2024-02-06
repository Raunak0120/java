package opearators_arithmetics;

public class Loops_while_do_while {

	public static void main(String[] gin) {
		//Squares of 2 using while loop
		
		/*int i = 1, n = 100;
		while(i<n) {
			System.out.println(i);
			i = i * 2;

		}*/
		
		//squares of 2 using do while loop
		
		/*int i = 1, n = 100;
		do {
			System.out.println(i);
			i = i * 2;
		}
		while(i<n);*/
		
		//infinite loop
			
		/*int i = 1;
		while(true) {
			System.out.println(i);
			i++;
		}*/
		
		// Printing 0-10 using for loop 
		
		/*for (int i = 0; i < 11; i++) {
			System.out.print(i+"\t");
			
		}System.out.println();
		//printing reverse 10-0 using for loop
		
		for (int i = 10; i >= 0; i--) {
			System.out.print(i+"\t");
		}*/
		
		// double variable in for loop
		
		for (int i=0,j=1; i<=10; i++,j=j*2) {
			System.out.println("2^"+i+"\s=\s"+j);
		}
	
		
	}

}
