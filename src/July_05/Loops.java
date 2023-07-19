package July_05;

public class Loops
{
	
public void getWhile()
{
	int x=5;
	while(x<10)
	{
		System.out.println(x);
		x++ ;//x=x+1;
		
	}
	System.out.println("done...");
}

public void getDoWhile()
{
	int x=55;
	do
	{
		System.out.println(x);
		x++ ;//x=x+1;
	}while(x<10);
	System.out.println("done...");
}

	public void getLoop()
	{
		for(int i=10 ; i<= 15 ; i++)
		{ 
			for(int j=1; j<= 5 ; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("done...");
	}

	
	public void getForEach()
	{
		int[] id= {3,5,68,3};
		for(int e : id)
		{
			System.out.println(e);
		}
		System.out.println("done...");
	}
	
	public static void main(String[] args) {

		Loops obj= new Loops();
		//obj.getWhile();
		
	//	obj.getDoWhile();
		
		//obj.getLoop();
		obj.getForEach();
	}

}
