package opearators_arithmetics;

public class Nested_loop_prac_79_1 {

	public static void main(String[] gin) {
	  //  Display pattern 1
					//	  1 2
					//	  1 2 3
					//	  1 2 3 4
					//	  1 2 3 4 5
		
		/*for (int i=1;i<=5;i++){
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		
		
	// Print pattern	01 
	//					02 03 
		//				04 05 06 
		//				07 08 09 10 
		//				11 12 13 14 15 
		
		
		
		
	/*	int count=0;
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				count++;
				System.out.format("%02d ", count);
			}
			System.out.println();
		}*/
		
		// Display pattern	  1 2 3 4 5
//		  					  1 2 3 4
//		  					  1 2 3
//		    				  1 2
		//					  1
		
		
		for (int i=5;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
