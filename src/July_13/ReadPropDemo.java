package July_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropDemo 
{
	public static void main(String[] args) 
	{
		
	try {
		FileInputStream fis = new FileInputStream("src\\July_13\\stud.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String id = prop.getProperty("studID");
		System.out.println(id);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
