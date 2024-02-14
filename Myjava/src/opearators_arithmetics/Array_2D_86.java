package opearators_arithmetics;

public class Array_2D_86 {

	public static void main(String[] gin) {
		
		//Creating 2-D Array
		
		//1.
		int a[][] = new int [3][4];
		//2.
		int b[][];
		b = new int[3][4];
		//3.
		int c[][] = {{1, 2, 3, 4, },{2, 4, 6, 8},{3, 5, 7, 9}};
		
		//now for printing array
		//1. By for counter loop
		/*
		for (int i=0;i<c.length;i++) {
			for (int j=0;j<c[0].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//2. By for-each loop
		
		for (int x[]:c) {
			for (int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		//how to create a Jagged Array
		
		int d[][];
		d = new int[3][];
		d[0] = new int[3];
		d[1] = new int[4];
		d[2] = new int[2];
		for (int p[]:d) {
			for (int q:p) {
				System.out.print(q+" ");
			}
			System.out.println();
		}
		

	}

}
