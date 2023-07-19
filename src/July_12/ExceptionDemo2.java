package July_12;

public class ExceptionDemo2 {


	public static void main(String[] args) 
	{
		try
		{
		int n1=99;
		int y=10;
		System.out.println(n1/y);
		
		String s=null;
		System.out.println(s.length());
		
		
		int[] x= {3,6};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("done....");
		

	}

}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
//Exception in thread "main" java.lang.NullPointerException
//Exception in thread "main" java.lang.ArithmeticException: / by zero
