package opearators_arithmetics;

public class Nested_loop_prac_78 {

	public static void main(String[] gin) {
		// Display pattern 1-5 5X5 
		
		/*for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(j+" ");// These will print 1-5 5X5
			//	System.out.print(i+" ");// this will print 1 1 1 1 1
										//                 2 2 2 2 2 and so on					
			}
			System.out.println();
		}*/
		
		 //  Display pattern 2 3 4 5 6
		//	 				 3 4 5 6 7
		//	  				 4 5 6 7 8
		//	 				 5 6 7 8 9
		//	 				 6 7 8 9 10
		
		/*for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}*/
		
		 //  Display pattern 01 02 03 04 05
		//	       			 06 07 08 09 10
		//	  				 11 12 13 14 15
		//	 			     16 17 18 19 20
		//	 				 21 22 23 24 25
		
			int count=0;
			for (int i=1;i<=5;i++) {
				for (int j=1;j<=5;j++) {
					count++;
					System.out.format("%02d ", count);// here we use format because we want output to be in fromated manner
				}
				System.out.println();
			}

	}

}
