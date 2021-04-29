package date;
  

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Calendar;
  
public class TestDate {
  
    public static void main(String[] args) {
    	Calendar c = Calendar.getInstance();
    	System.out.println(c);
    	Date d = new Date(0);
    	c.setTime(d);
    	System.out.println(c);
    	LocalDate date1 = LocalDate.parse("2020-11-20", DateTimeFormatter.ISO_DATE);  
    	System.out.println(date1);
    	System.out.println( -10 % 3);
    }
        
}