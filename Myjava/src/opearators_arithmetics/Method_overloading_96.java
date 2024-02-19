package opearators_arithmetics;

public class Method_overloading_96 {
	
	static int max(int x, int y) {
		return x>y?x:y;
	}
	static float max(float x, float y) {
		return x>y?x:y;
	}
	static int max(int x, int y, int z) {
		if(x>y && x>z) {
			return x;
		}
		else if (y>x && y>z) {
			return y;
		}
		else {
			return z;
		}
	}

	public static void main(String[] args) {
		
		System.out.print("Gratest no.is: "+max(15, 9)+"\n");
		
		System.out.print("Gratest no. is: "+max(15f, 22f)+"\n");
		
		System.out.print("Gratest no. between three no. is: "+max(15, 25, 60)+"\n");
		
	}

}
