package opearators_arithmetics;



public class max_element_method_94_3 {
	static int max(int a[]) {
		int max = a[0];
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	

	public static void main(String[] gin) {
		int a[] = {8, 13, 15, 7, 9, 2};
         System.out.println("maximum elelment of "+max(a));
	}

}
