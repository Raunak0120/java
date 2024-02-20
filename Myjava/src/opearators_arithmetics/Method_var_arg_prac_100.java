package opearators_arithmetics;

public class Method_var_arg_prac_100 {

	static int max(int ...a) {
		if (a.length == 0)
			return Integer.MIN_VALUE;
		int m = 0;
		for(int i = 1; i<a.length;i++)
			if(a[i]>m)
				m=a[i];
		return m;
	}
	
	static int sum(int ...a) {
		int s = 0;
		for (int i=0;i<a.length;i++)
			s=s+a[i];
		return s;
	}
	
	static double discount(double ...x) {
		double s = 0;
		
		for (int i=0; i<x.length; i++) 
			s = s+x[i];
		
		
		if (s<=500) 
			return s-s*0.10;
		
		else if(s>500 && s<=1000) 
			return s-s*0.15;
		
		else if (s>1000)
			return  s-s*0.2;
		return s;
	}
	
	
	public static void main(String[] args) {
		System.out.println(max());
		System.out.println(max(10));
		System.out.println(max(10, 20, 30, 40));
		
		System.out.println(sum(10, 20, 30, 40));
		
		System.out.println(discount(100, 150, 250, 500));
		
		
	}

}
