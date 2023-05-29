package generic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

	public static String getTimeStamp()
	{
		 LocalDateTime currentDateTime = LocalDateTime.now();
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
	     String formattedDateTime = currentDateTime.format(formatter);
	     return formattedDateTime;
	}
}
