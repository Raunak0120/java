package opearators_arithmetics;

public class Method_var_arg_99 {
	static void show(int ...a) {
		for (int x:a) {
			System.out.println(x);
		}
	}
	static void showList(int start, String ...s) {//or we can use showList(String ...s) 
		for(int i=0;i<s.length;i++) {
			System.out.println(start+". "+s[i]);//this we can use for comm(i+1+". "+s[i]);
			start++;
		}
	}

	public static void main(String[] args) {
		show();
		show(10, 20, 30);
		show(new int[] {1, 3, 5, 7, 9});
		
		// show names with show method
		showList(101,"Maa", "Bhaiya", "Bhabhi", "Raunak", "Ankur", "Rudra");// we can use these to show whatever index we have to start from.
		//showList("Maa", "Bhaiya", "Bhabhi", "Raunak", "Ankur", "Rudra");

	}

}
// in these variable argument we can pass Array as well as any no. of strings, int, etc.