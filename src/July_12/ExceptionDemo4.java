package July_12;

public class ExceptionDemo4 {


	public static void main(String[] args) 
	{
		try
		{
		int n1=99;
		int y=0;
		System.out.println(n1/y);
		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
		
		finally
		{
			System.out.println("mandatory code...");
		}
		
		System.out.println("done....");
		

	}

}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
//Exception in thread "main" java.lang.NullPointerException
//Exception in thread "main" java.lang.ArithmeticException: / by zero
