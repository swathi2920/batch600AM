package may_01;

public class Calculator2
{
	 int n1=99; // instance variable/global-- non static
	 int  n2=66;// instance variable/global--static
	
	
	int add()
	{
		int res = n1+n2;
		System.out.println("The add is : " +res);
		return res;
	}
	
	
	
	public static void main(String[] args) 
	{
		Calculator2 c= new Calculator2();
		int sum = c.add();
		System.out.println(sum);
	}

}
