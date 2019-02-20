import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Calen {
		
	public static void main(String[] args) {
		
		System.out.println(findDay(8,5,2999));
	
	/*String[] days = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
	//08 05 2999
		Date date= new Date(2999,5,8);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);*/
	}
	
	public static String findDay(int month, int day, int year) {
		
		 LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }
	 
	
}
