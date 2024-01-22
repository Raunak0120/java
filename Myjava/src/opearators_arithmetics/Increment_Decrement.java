package opearators_arithmetics;

public class Increment_Decrement {

	public static void main(String[] args) {
	/*	int x = 5;
		x++;  //--> post increment
		System.out.println(x);*/
		
		/*int x = 5;
		++x;    //--> pre increment
		System.out.println(x);*/
		
		//--> above two codes have same value 6 to better understand see below coding
		
		/*char a = 'A';
		a++;
		System.out.println(a);*/
		
		/*int x = 5;
		int y =x++;
		System.out.println("x = " +x+ " & " + "y = " +y);
		//--> the result will be x = 6 and y = 5 as in post increment first y is assigned and than x is incremented.*/
		
		/*int x = 5;
		int y =++x;
		System.out.println("x = " +x+ " & " + "y = " +y);
		//--> the result will be x = 6 and y = 6 as in pre increment first x is incremented and than y is assigned.*/
		
		
		/*int x = 5, y = 4, z;
		z =2 * x++ + 3 * ++y;
		System.out.println("z = " +z);
		//--> in these eqn x is post increment so the value of x is same as 5 first and afterwards it is incremented*/
		
		int x = 5, y = 4, z;
		z =2 * x++ + 3 * ++x;
		System.out.println("z = " +z);
		//--> in these eqn first 2 is multiplied by x = 5 after ward x is incremented and than 3 is multiplied by 7 as value of x becomes 6 and after that 
		//--> it is pre incremented and the value of x becomes 7.

	}

}
