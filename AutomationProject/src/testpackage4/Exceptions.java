package testpackage4;

public class Exceptions {

	public static void main(String[] args) {
		
		int a = 1;
		System.out.println("a is = "+a);
		int b = 2;
		System.out.println("b is = "+b);
		int c = 0;
		int d [] = {1,3,4};
		
		
		try
		{
			c = b/a;
			System.out.println(d[6]);//array
		}
			
		catch(ArithmeticException e)
		{
			System.out.println("a = 0 and we can divise by zero");
		}
		
		catch(Exception e)
		{
			System.out.println("array is ouy of index/size");
		}
		
		System.out.println("c is = "+ c);
	}

}
