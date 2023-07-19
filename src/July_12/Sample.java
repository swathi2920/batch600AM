package July_12;

public class Sample 
{

	public static void main(String[] args) throws InterruptedException ,ArrayIndexOutOfBoundsException
	{

System.out.println("started...");
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}

Thread.sleep(1000);
System.out.println("stopped...");

	}

}
