package opearators_arithmetics;

public class Bitwise_operator_prac {
	public static void main(String[] args) {
		//--> AND (&) operator
		
		/*int x = 0b1010; //--> this is 10.
		int y = 0b0110; //--> this is 6.
		int z = x & y;
		System.out.println(z); //--> answer will be 2 as when you anding x, y the ans is 0010 this is in binary and this value is 2 in numeric.  */
		
		//--> OR (|) operator
		
	/*	int x = 0b1010; //--> this is 10.
		int y = 0b0110; //--> this is 6.
		int z = x | y;
		System.out.println(z); // answer will be 14 as the ans is 1110 */
		
		//--> XOR (^) operator
		
		/*int x = 0b1010; //--> this is 10.
		int y = 0b0110; //--> this is 6.
		int z = x ^ y;
		System.out.println(z);*/
		
		//--> Left Shift operator (<<)
		
		/*int x = 0b1010, y;
		y = x << 1;
		System.out.println(y);
		
		//--> left shift operator gives us value n*2^k means in these case n = 10 = x so, 10*2^1 = 20 or to better under stand we gave value of k = 3 in below coding */
		
		/*int x = 0b1010, y;
		y = x << 2;
		System.out.println(y);*/
		
		//--> Right Shift operator(>>)
		
		/*int x = 0b1010, y;
		y = x >> 1;
		System.out.println(y); 
		System.out.println(String.format("%s",Integer.toBinaryString(y)));
		System.out.println(String.format("%32s",Integer.toBinaryString(y))); //--> it gives the value 5 */
		
		//--> right shift operator gives us value same as n/2^k means n = x =10 & k = 1 so, 12/2*1 = 2
		
		/*int x = 0b1100, y;
		y = x >> 2;
		System.out.println(y);
		System.out.println(String.format("%32s",Integer.toBinaryString(y)));
		
		//--> right shift operator gives us value same as n/2^k means n = x =12 & k = 2 so, 12/2*2 = 3, here i gave value of x = 12 as integer does not take value of decimals */
		
		//--> unsigned Right Shift (>>>)
		
		/*int x = -0b1010, y;
		y = x >>> 1;
		System.out.println(x);
		System.out.println(String.format("%s", Integer.toBinaryString(x)));
		System.out.println(y);
		System.out.println(String.format("%32s", Integer.toBinaryString(y)));
		//--> here we converted integer to bit(Binary) also unsigned right shift gives positive value as we can see by running the above programming
		//--> also we can see "%32s" we write to see the 32 value as 0 is not shown so it shown by spacing*/
		
		//--> Not (~) Operator
		
		int x = 0b1010, y;
		y =~ x;
		System.out.println(x);
		System.out.println(String.format("%32s", Integer.toBinaryString(x)));
		System.out.println(y);
		System.out.println(String.format("%32s",Integer.toBinaryString(y)));
	}

}
