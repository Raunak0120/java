package opearators_arithmetics;

public class Method_pass_par_91 {

	/*static void update(int a[]) {
		a[0] =25;
	}*/
	//static void change (int a[], int index, int value) {// here a is not compulsory you can use different characters
		//a[index] = value;
	static void change (int x[], int index, int value) {
		x[index] = value;// as you can see we use different notation 
	}
	
	
	
	public static void main(String[] gin) {
		
		/*int a[] = {2, 3, 4, 5, 6};
		update(a);
		System.out.println(a[0]);*/
		
		int a[] = {2, 4, 6, 8, 10};
		change(a,1,20);
		for (int x:a) {
			System.out.print(x+", ");
		}
		

	}

}
