package opearators_arithmetics;

public class String_methods {

	public static void main(String[] args) {
		
		//-->printf method
		/*System.out.printf("Hello \n");//--> here print f will print in the same line so we use \n for eg:-
		
		System.out.printf("Hello\s");//--> As we can see that both will print in same line so we use \n for print in next line also
		
		System.out.printf("Hello\t");// here we see that by \s gave space and print hello with space also
		
		System.out.printf("Hello");//--> the above \t gives us spacing equal to tab*/
		
		/*int x = 10;
		float y = 12.05f;
		char z = 'A';
		float a = 0.00125f;
		//System.out.printf("Hello\t %f %d %c",y,x,z);//-->%f is for float, %d is for integer, %c is for char
	//	System.out.printf("%e",y);//--> %e use for exponential it gives value in exponential form for better understanding 
		//System.out.printf("%e %e\t",y,a); //--> as we can see we use %e as %e will use in one variable
		//String str = "Hello java";
		//System.out.printf("%s", str);//-->here %s use for string
		
		//-->argument indices %1$d, %2$d %3$d %4$d %5$d, ....... in place of d i.e, integer we can use c(char), f(float), s(string) and so on.
		
		//System.out.printf("%1$d %1$d %1$d", x);//--> here we can see that vale of x is print 3 times
		
		//System.out.printf("%1$d %2$f %1$d",x,y);//--> here we can see that value of x is printed first than y and than x 
		
		//System.out.printf("%3$s %2$f %1$d",x,y,str);
		//System.out.printf("%1$d %2$f %3$c %4$a %5$str ", x,y,z,a,str);*/
		
		
		//-->width and flag
		
		//-->For an integer
		/*int a = 10;
		int b = -10;
		System.out.printf("%5d\n", a);//--> here we use width 5 so it will print in 5 places ___10;
		System.out.printf("%05d\n", a);//--> here 0 will takes places of spaces  00010;
		System.out.printf("%(5d\n", a);//--> here nothing will happen ___10;
		System.out.printf("%(5d\n", b);//--> here as the no. is negative bracket occur _(10);
		System.out.printf("%+5d\n", a);//--> here + sign occurs __+10;
		System.out.printf("%+5d\n", b); //--> as we know sign convention - + = - so __-10;
		System.out.printf("%-5d", a);//--> here - flag gives spaces after printing value 10___;
		System.out.printf("%-5d", b);//--> here - flag gives spaces after printing value 10___-10;
		System.out.printf("% d", a);//--> here '_' (space) flag gives a space 
		System.out.printf("% d", b);*/
		 
		//--> for float
		
		/*float e = 3.45f;
		float f = 123.45f;
		System.out.printf("%6f\n", f);//--> here we can see that in float always it gives precise value
		System.out.printf("%6.2f\n", f);//--> here in float if we give .2 it will  concise to the value that are given
		System.out.printf("%6.2f\n", e);//--> here the value of e takes upto 6 places __3.45
		System.out.printf("%06.2f\n", e);//--> it will print 003.45 0 will takes place of spaces;*/
		
		//--> for string
		
		String str = "Java";
		System.out.printf("%-10s\n", str);//--> takes upto 10 places after printing
		System.out.printf("%10s\n", str);
		
	}

}
