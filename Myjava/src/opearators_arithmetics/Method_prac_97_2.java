package opearators_arithmetics;

public class Method_prac_97_2 {

	static int reverse(int n) {
		int reve = 0;
		while (n>0) {
			int r = n%10;
			n = n/10;
			
			reve = reve * 10 + r;
		}
		return reve;
	}
	static int[] reverse(int a[]) {
		int b[]=new int[a.length];
		for (int i=0,j=a.length-1;i<a.length;i++,j--) {
			b[i] = a[j];
		}
		return b;
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse(2001));
		int a[] = {4, 5, 6 ,7, 8, 9};
		 int rev[] = reverse(a); 
		    for(int x : rev) {
		        System.out.print(x + ", "); 
		    } 
		//System.out.print(rev(a)+", ");
		
	}

}
