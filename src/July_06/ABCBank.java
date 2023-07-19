package July_06;

public class ABCBank extends RBI{

	

	public static void main(String[] args) {
		ABCBank c1= new ABCBank();
		c1.account();
		c1.loan();
		c1.intrest();

	}

	@Override
	public void intrest() {
		System.out.println("8%...");
		
	}

}
