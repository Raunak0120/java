package opearators_arithmetics;

public class Array_2D_prac_87 {

	public static void main(String[] gin) {
		
		// Adding 2 matrices
		
		/*int a[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
		int b[][] = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
		int c[][] = new int[3][3];
		
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.format(c[i][j]+" ");
			}
			System.out.println();
		}*/
		
		// Multiplying 2 matrices
		
		
		int a[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
		int b[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		int c[][] = new int[3][3];
		
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j] = 0;
				for (int k=0;k<3;k++) {
					c[i][j]= c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (int x[]:c) {
			for (int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		// Sorting String of an Array
		
		String str[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
		
		java.util.Arrays.sort(str);
		for(String z:str) {
			System.out.print(z+", ");
		}

	}

}
