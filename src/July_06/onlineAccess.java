package July_06;

public class onlineAccess {

	public static void main(String[] args) {
		EncapAuthentication c1= new EncapAuthentication();

		System.out.println(c1.username);
		c1.username="john";
		System.out.println(c1.username);
		
		System.out.println(c1.getPassword());
		c1.setPassword("test");
		System.out.println(c1.getPassword());
	}

}
