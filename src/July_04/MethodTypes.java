package July_04;

public class MethodTypes 
{
int x=99;
public int y=22;
private String pwd="test";
protected boolean status;

	void add()
	{
		int res = x+y;
		System.out.println("Add : "+ res);
	}


	int sub()
	{
		int res = x-y;
		System.out.println("sub : "+ res);
		return res;
	}
	
	void mul(int a, int b)
	{
		x=a;
		y=b;
		int res = x*y;
		System.out.println("Mul : "+ res);
	}

	float div(int a, int b)
	{
		x=a;
		y=b;
		float res = x/y;
		//System.out.println("div : "+ res);
		return res;
	}
	
	float mod(int a, float b)
	{
		x=a;
		float y=b;
		float res = x%y;
		return res;
	}
	
	public static void main(String[] args) 
	{
		MethodTypes m= new MethodTypes();
		m.add();
		
		int s = m.sub();
		System.out.println(s);

		m.mul(33, 3);
		
		float f= m.div(44, 3);
		System.out.println(f);
		
		System.out.println(m.mod(33, 3.4f));
	}

}
