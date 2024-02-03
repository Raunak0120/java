package opearators_arithmetics;
import java.util.Scanner;
public class Conditional_statement_1 {
	public static void main(String[] gin) {
		
		// Find odd and even no. that is given
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		if (a%2 == 0) {
			System.out.println("Number is EVEN");
		}
		else{
			System.out.println("Number is ODD");
		}*/
		
		
		// find whether the person is young or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int age = sc.nextInt();
		if (age < 1) {
			System.out.println("Invalid entry");
		}
		else if (age > 14 && age < 50 ) {
			System.out.println("You are Young");
		}
		else if (age < 14 || age > 50) {
			System.out.println("You are not Young");
		}
		
		// find grade for given marks
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		System.out.print("Physics: ");
		float phy = sc.nextFloat();
		System.out.print("Chemistry: ");
		float chem = sc.nextFloat();
		System.out.print("Mathematics: ");
		float math = sc.nextFloat();
		System.out.print("English: ");
		float eng = sc.nextFloat();
		System.out.print("I.P: ");
		float ip = sc.nextFloat();
		float marks = (phy + chem + math + eng + ip)/5.0f;
		
		if (phy > 100) {
			System.out.println("Invalid entry of marks in Physics, marks should not be greter than 100");
		}
		
		if (chem > 100) {
			System.out.println("Invalid entry of marks in Chemistry, marks should not be greter than 100");
		}
		if (math > 100) {
			System.out.println("Invalid entry of marks in Mathematics, marks should not be greter than 100");
		}
		
		if (eng > 100) {
			System.out.println("Invalid entry of marks in English, marks should not be greter than 100");
		}
		if (ip > 100) {
			System.out.println("Invalid entry of marks in IP, marks should not be greter than 100");
		}
		if (marks > 100) {
			System.out.println();
			
		}
		else if (marks > 95) {
			System.out.println("Your % is: " +marks+ "\nYour grade is A+");
		}
		else if (marks > 85 && marks < 95) {
			System.out.println("Your % is: " +marks+ "\nYour grade is A");
		}
		else if (marks > 75 && marks < 85) {
			System.out.println("Your % is: " +marks+ "\nYour grade is B+");
		}
		else if (marks > 65 && marks < 75) {
			System.out.println("Your % is: " +marks+ "\nYour grade is B");
		}
		else if (marks > 50 && marks < 65) {
			System.out.println("Your % is: " +marks+ "\nYour grade is C");
		}
		else if (marks > 35 && marks < 50) {
			System.out.println("Your % is: " +marks+ "\nYour grade is D");
		}
		else {
			System.out.println("Your % is: " +marks+ "\nYour grade is E ");
		}	*/	
	}

}
