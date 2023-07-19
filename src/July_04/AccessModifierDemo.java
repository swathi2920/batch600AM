package July_04;

public class AccessModifierDemo
{
	
public void add()
{
	System.out.println("public...");
}

 void sub()
{
	System.out.println("default...");
}

private void mul()
{
	System.out.println("private...");
}

protected void div()
{
	System.out.println("protected...");
}

	public static void main(String[] args) {

		AccessModifierDemo a= new AccessModifierDemo();
		
		a.add();
		a.div();
		a.mul();
		a.sub();

	}

}
