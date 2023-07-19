package may_01;

public class LoginDemo 
{
	void display()
	{
		System.out.println("method called...."+ unm);
	}
	
	String unm="John";
	
	public static void main(String[] args) 
	{
		LoginDemo obj = new LoginDemo();
		obj.display();
		System.out.println(obj.unm);
	}

}
