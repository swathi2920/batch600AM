package July_04;

public class ConstDEmo 
{
	int x;
	public int y;
	
	public ConstDEmo()
	{
		System.out.println("Default const...");
		x=99;
		y=66;
	}
	
//	public ConstDEmo(int a, int b)
//	{
//		System.out.println("parametrized const...");
//		x=a;
//		y=b;
//	}
//	
	public ConstDEmo(int x, int y)
	{
		System.out.println("parametrized const...");
		this.x=x;
		this.y=y;
	}

		void add()
		{
			int res = x+y;
			System.out.println("Add : "+ res);
		}


	public static void main(String[] args) {
		ConstDEmo c= new ConstDEmo();
		c.add();
		
		ConstDEmo c1= new ConstDEmo(33,4);
		c1.add();

	}

}
