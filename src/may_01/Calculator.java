package may_01;

public class Calculator
{
	static int n1=99; // instance variable/global-- non static
	static int  n2=66;// instance variable/global--static
	
	char n3=100;
	
	void add()
	{
		 int n1=100; // local variable
		int res = n1+n2;
		n1=10;
		System.out.println("The add is : " +res);
	}
	
	void sub()
	{
		int res = n1-n2;
		System.out.println("The sub is : " +res);
	}
	
	void mul()
	{
		int res = n1*n2;
		System.out.println("The mul is : " +res);
	}
	
	void div()
	{
		int res = n1/n2;
		System.out.println("The div is : " +res);
	}
	
	static void mod()
	{
		int res = n1%n2;
		System.out.println("The mod is : " +res);
	}
	
	public static void main(String[] args) 
	{
		Calculator c= new Calculator();
		c.add();
		c.div();
		c.mod();
		c.mul();
		c.sub();
		System.out.println(c.n1);
		
		int x =c.n2;
		System.out.println(x);
		
		System.out.println(n2);
		System.out.println(Calculator.n2);
		Calculator.mod();
		mod();
	}

}
