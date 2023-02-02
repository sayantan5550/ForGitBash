package Generic_Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	
	/**
	 * Thia Method is used to read data from property file
	 * @param Key
	 * @return
	 * @throws Throwable
	 * @author Sayantan Chatterjee
	 */
	public String getKeyAndValue(String Key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/PropertyData.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(Key);
		return value;
	}

	
	
}
