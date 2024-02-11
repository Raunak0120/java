package opearators_arithmetics;

public class Loop_star_prac_80 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j > 5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}	
			}
			for (int l=2; l<=i;l++) {
				System.out.print("* ");
				}
			System.out.println();
				}
		for (int m=1;m<=5;m++) {
			for(int n=1;n<=5;n++) {
				if(n >= m) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int p=4;p>=1;p--) {
				for (int q=1;q<=p;q++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}		
	}
}