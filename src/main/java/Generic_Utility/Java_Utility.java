package Generic_Utility;

import java.util.Date;
import java.util.Random;

public class Java_Utility {
	
	/**
	 * This method id used for avoiding duplicate values
	 * @return
	 * @author Sayantan Chatterjee
	 */
	public int getRandomNum() {
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		return ranNum;
	}
	
	/**
	 * This method returns the current date and time
	 * @return
	 * @author Sayantan Chatterjee
	 */
	public String getDate(){
		Date date = new Date();
		String dateandtime = date.toString();
		
		String Year = dateandtime.split(" ")[5];
		String Month = dateandtime.split(" ")[1];
		String  day = dateandtime.split(" ")[2];
		
		String t = dateandtime.split(" ")[3];
		String time = t.replace(":", "-");
		
		return (Month+"_"+day+"_"+Year+"_"+time);
	}
}
