package Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimePrac {

	public static void main(String[] args) {
		// LOCAL DATE
  LocalDate getMyDate = LocalDate.now();
  System.out.println("LOCAL TIME IS : "+getMyDate);
  
       // LOCAL TIME
  LocalTime getMyTime = LocalTime.now();
  System.out.println("LOCAL TIME IS : "+getMyTime);
    
     // LOCAL DATE AND TIME
  LocalDateTime getMyDateAndTime = LocalDateTime.now();
  System.out.println("LOCAL DATE AND TIME IS : "+getMyDateAndTime);
  
   // FORMATTING DATE AND TIME
   DateTimeFormatter getFormattedDateTime = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
   DateTimeFormatter getFormattedDateTime1 = DateTimeFormatter.ofPattern("hh/mm a");
   String formateName = getMyDateAndTime.format(getFormattedDateTime1);
   String formatName = getMyDateAndTime.format(getFormattedDateTime);
   System.out.println("CURRENT DATE IS : "+formatName);
   System.out.println("CURRENT TIME IS : "+formateName);
	}

}
