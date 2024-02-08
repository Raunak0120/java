package opearators_arithmetics;
import java.util.*;

public class Loop_prac_2_76 {

	public static void main(String[] gin) {
		
		
		// Display AP (Arithmetic Progression)series means 5,10,15,.... and 7,11,15... etc.--> AP = a + a*1*d + a*2*d + a*3*d....
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Arithmetic Progression Series");
			System.out.print("Enter starting number of AP ");
			int a = sc.nextInt();
			System.out.print("Enter difference of AP ");
			int d = sc.nextInt();
			System.out.print("Enter length of series ");
			int l = sc.nextInt();
			
			int t = a;
			
			
			
		for(int i=0;i<l;i++) {
	    	System.out.print(t+", ");
			t = t + d;
		}
	}

}
