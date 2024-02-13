package opearators_arithmetics;
import java.util.*;
public class Array_1D_prac_83 {

	public static void main(String[] gin) {
		
				//Finding sum of all Elements
		
		/*int A[] = {3, 9, 7 , 8, 12 , 6, 15, 5, 4, 10};
		int sum = 0;
		for (int i=0;i<A.length;i++) {
			sum = sum + A[i];
		}
		System.out.println("Sum is: "+sum);*/
		
		// Finding an element of an Array
		
		/*int b[] = {3, 9, 7 , 8, 12 , 6, 15, 5, 4, 10};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key you wnat to find: ");
		
		int key = sc.nextInt();
		
		for (int j=0;j<b.length;j++) {
			if(b[j] == key) {
				System.out.println("Indices of key is: "+j);
				System.exit(0);
			}
		}
		System.out.println("Key not found");*/
		
		
		//Finding maximum Element
		
		/*int c[] = {3, 9, 7 , 8, 12 , 6, 15, 5, 4, 10};
		int max = c[0];
		
		for (int k=0;k<c.length;k++) {
			if(max<c[k]) {
				max = c[k];
			}
			
		}
		System.out.println(max);*/
		
		// finding second greatest element
		
		
		int d[] = {3, 9, 7 , 8, 12 , 6, 15, 5, 4, 10};
		int max1,max2;
		max1=max2=d[0];
		for(int m=0;m<d.length;m++) {
			if(d[m]>max1) {
				max2=max1;
				max1=d[m];
			}
			else if(d[m]>max2) {
				max2=d[m];
			}
		}
		System.out.println("Second largst no. is: "+max2);
	}

}
