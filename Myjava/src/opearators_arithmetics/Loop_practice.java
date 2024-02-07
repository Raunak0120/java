package opearators_arithmetics;
import java.util.*;

public class Loop_practice {

	public static void main(String[] gin) {
		
		// Display digit of a no.
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. ");
		int n = sc.nextInt();
		
		int r;
		
		while(n>0){
			r = n%10; // here we us % for remainder for eg. we take 549 so in these case % will divide 549 by 10 and by sing % operator it gives value 9 which is remainder
			n = n/10; // these will reduce one digit at a time and due to int it will not showing decimal value as eg. 549/10 will give 54.9 in general but in java it will give 54 only  
			System.out.println(r);// these will print value of r for eg. if we give value 549 it will print 9 than value of n is reduced to 54 than it will give 4 than it will give 5 than 0 
		}
		System.out.println(n);// this will print 0 as when loop is running it will eventually comes to 0 and condition will become false as n>0 */
		
		//count no. of digits
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.: ");
		int n = sc.nextInt();
		int c = 0;
		while(n > 0) {
			n = n/10;// we use n/10 to shorten the digit for eg. 345/10 will give 34 as it is int not float and than gives 3 ant than 0 as it is in loop after it will exited
			c++;// these will initially 0 and than 1 than so on for eg if n = 345 than by above condition its value will become 1 it will keep increasing until it will not be exited from loop
		}
		System.out.println(c);*/
		
		
		//find the no. s armstrong or not for eg. 153 1^3+5^3+3^3=1+125+27=153 this armstrong no.
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.: ");
		int n = sc.nextInt();
		int a = n;
		int r = 0;
		int s = 0;
		while (n>0){
			r = n%10;
			n = n/10;
			s = s + (r*r*r);	
		}
		System.out.println(s);
		if (s == a) {
			System.out.println("Given no. is a Armstrong no.");
		}
		else {
			System.out.println("Given no. is not a Armstrong no.");
		}*/
		
		// to print reverse of a no.
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.: ");
		int n = sc.nextInt();
		int a = n;
		int rev = 0;
		int r;
		
		while (n>0) {
			r = n%10;
			n = n/10;
			rev = rev * 10 + r;
		}
		System.out.println("Reverse no. of "+a+"\sis: "+rev);*/
		
		//to find palindrome no. palindrome no. is no. which is same as its reverse no. for eg. 12521 it is equal to its reverse order 12521=12521
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.: ");
		int n = sc.nextInt();
		int a = n, rev = 0,r;
		
		while(n > 0) {
			r = n%10;
			rev = rev * 10 + r;
			n = n/10;
		}
		if(rev == a)
			System.out.println(rev+"\ssame as\s"+a+". It is a Palindrome no.");
		else
			System.out.println("It is not a Palindrome no.");
		
	}

}
