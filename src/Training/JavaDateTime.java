package Training;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class JavaDateTime {

	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy hh:mm a");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}

}
