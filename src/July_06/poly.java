package July_06;

public class poly {

	public void login(String u, String p)
	{
		System.out.println("user...");
	}

	public void login(int u, String p)
	{
		System.out.println("Dev...");
	}
	public void login(String u, int p)
	{
		System.out.println("Admin...");
	}
	
	
	public static void main(String[] args) {

		poly c1= new poly();
		c1.login("aaa", "test");

	}

}
