package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class datamethod {

	
	public FileInputStream datas() throws IOException   {
		
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Utilities\\data.properties");
		return ip;
		
		
	}
	
	
	//src\main\java\Utilities\data.properties
	
	//System.getProperty("user.dir")+

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
