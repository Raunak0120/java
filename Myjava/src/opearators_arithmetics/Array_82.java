package opearators_arithmetics;

public class Array_82 {

	public static void main(String[] gin) {

		//Methods to declare Array
		
		//1.
		
		int A[] = new int [5];// In  these we first create a heap in which we have to store Array
		
		A[0] = 1;  // By these we have assign value in indices of array
		A[1] = 10;
		A[2] = 4;
		A[3] = 3;
		A[4] = 2;
		System.out.println(A[1]);// By using these we print only particular value of an Array, here A[1] is the indices and its value is 10 
		System.out.println();
		 
		for (int i=0;i<=A.length-1;i++) { //By using these we can print all value of an Array, here we use A.length-1 as A.length is 5 here but the indices is 4 as it starts with 0(0, 1, 2, 3, 4)
			System.out.print(A[i]+",\s");
			
		}
		System.out.println();
		
		//2.
		int B[];
		B = new int[5];
		B[0] = 2;
		B[1] = 3;
		B[2] = 4;
		B[3] = 5;
		B[4] = 1;
		
		B[2] = 36;// By these we reassign the value of any particular indices as previously B[2] is 4 now it is 36
		
			System.out.println();
			for(int j=0;j<B.length;j++) {
				System.out.print(B[j]+",\s");
			}
			System.out.println();
			System.out.println();
			
			//3.
			
			int C[] = {1, 2, 3, 4, 5};//Here we directly assign the value in an Array
		
			for (int x:C) {//By using these we can also print all the value of an Array
				System.out.print(x+", ");
			}
			System.out.println();
			//Also
			for (int k=0;k<C.length;k++) {
				System.out.print(C[k]++ +", ");// Here we increment each value of an Array it does not print incremented value in these for loop also for incrementing only these for loop will be use
			}
			System.out.println();
			for (int y:C) {// Here incremented value is printed
				System.out.print(y+", ");
			}
			
	}

}
