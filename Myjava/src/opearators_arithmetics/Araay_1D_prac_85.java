package opearators_arithmetics;

public class Araay_1D_prac_85 {

	public static void main(String[] gin) {
		
		//To copy one array into another
		
		/*int a[] = {8, 6, 10, 9, 2, 15, 7, 13, 14, 11};
		int b[] = new int[10];

		for(int x:a) {
			System.out.print(x+", ");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int y:b) {
			System.out.print(y+", ");	
		}*/
		
		//Reverse copying of an array
		
		/*int a[] = {8, 6, 10, 9, 2, 15, 7, 13, 14, 11};
		int b[] = new int[10];
		
		for (int x:a) {
			System.out.print(x+", ");
		}
		System.out.println();
		
		for(int i=a.length-1,j=0;i>=0;i--,j++) {
			  b[j]=a[i];
		}
		for(int y:b) {
			System.out.print(y+", ");
		}*/
		
		//increasing size of an array
		
		int a[] = {8, 6, 9, 10, 2};
		System.out.println("Length of Array a is: "+a.length);
		
		int b[] = new int[2*a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		a=b;
		b=null;
		for(int x:a) {
			System.out.print(x+", ");
		}
		System.out.println();
		System.out.println("Length of Array a is: "+a.length);
	
	}

}
