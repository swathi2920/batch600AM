package July_07;

public class ExceptionDemo {


	public static void main(String[] args) 
	{
		
		int n1=99;
		int y=0;
		System.out.println(n1/y);
		
		String s=null;
		System.out.println(s.length());
		
		
		int[] x= {3,6};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		System.out.println("done....");
		

	}

}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
//Exception in thread "main" java.lang.NullPointerException
//Exception in thread "main" java.lang.ArithmeticException: / by zero
