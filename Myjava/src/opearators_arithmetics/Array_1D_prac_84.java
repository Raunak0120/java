package opearators_arithmetics;

public class Array_1D_prac_84 {

	public static void main(String[] gin) {
		
		//Rotating of an array
		
		
		/*int a[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
		int temp = a[0];
		int temp2 = a[a.length-1];
		
		// for left shifting
		
		/*for (int x:a) 
			System.out.print(x+", ");
		
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		System.out.println();
		for (int x:a) 
			System.out.print(x+", ");
		System.out.println();*/
		
		// for right shifting
		
		/*for (int x:a) 
			System.out.print(x+", ");
		
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp2;
		System.out.println();
		for (int x:a) 
			System.out.print(x+", ");*/
		
		
		// Inserting an element 
		
		/*int a[]=new int[10];
		a[0]=2;a[1]=12;a[2]=3;a[3]=32;a[4]=43;a[5]=22;
		int n=6;
		for (int i=0;i<n;i++)
			System.out.print(a[i]+", ");
			System.out.println();
			
			int x = 20;
			int index = 2;
			
			
		for(int i=n-1;i>index;i--)
			a[i]=a[i-1];
			a[index] = x;
			System.out.println();
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+", ");*/
		
		// Deleting an element
		

		int a[]=new int[10];
		a[0]=2;a[1]=12;a[2]=3;a[3]=32;a[4]=43;a[5]=22;
		int n = 6;
		
		for (int i=0;i<n;i++)
			System.out.print(a[i]+", ");
			System.out.println();
			
			int index = 5;
			
			for (int i=2;i<=index;i++)
				
				a[i-1] = a[i];
			a[index] = 0;
			     
			
			
			for (int i=0;i<n;i++)
				System.out.print(a[i]+", ");
				System.out.println();
				
				
	}

}
