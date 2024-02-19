package opearators_arithmetics;

public class Method_prac_97_3 {
	static boolean validate(String name) {
		return name.matches("[a-zA-z\\s]+");
	}
	static boolean validate(int age) {
		return age>=6 && age<=9;
	}

	public static void main(String[] args) {
		System.out.print(validate("Raunak")+"\n");
		
		System.out.print(validate(9));

	}

}
