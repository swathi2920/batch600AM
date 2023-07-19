package July_06;

public class c extends P{

	public void account()
	{
		super.account();
		System.out.println(".child...account docs");
	}
	
	public static void main(String[] args) {
		c c1= new c();
		c1.account();
		

	}

	
}
