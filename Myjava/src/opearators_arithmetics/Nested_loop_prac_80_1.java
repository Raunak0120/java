package opearators_arithmetics;

public class Nested_loop_prac_80_1 {

	public static void main(String[] args) {
		/* Display Pattern
		  * * * * * 
            * * * * 
              * * * 
                * * 
                  *               */

		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j >= i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
		/*Display pattern
		    * 
	      * * 
	    * * * 
	  * * * * 
	* * * * *                   */
		
		/*for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j > 5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}*/
		
	}

}
