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
		
		/*for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}*/
		
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
