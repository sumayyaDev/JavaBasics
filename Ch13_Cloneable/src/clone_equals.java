import java.util.Calendar;
import java.util.GregorianCalendar;

public class clone_equals {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2013, 2, 1);
		Calendar calendar1 = calendar;  //Reference is copied(as reference same so content also same)
		Calendar calendar2 = (Calendar)calendar.clone(); //Content is copied but their references are different
		System.out.println("calendar == calendar1?  " + (calendar == calendar1));  // == check reference
		System.out.println("calendar == calendar2?  " + (calendar == calendar2));  
		System.out.println("calendar.equals(calendar1)?  " + (calendar.equals(calendar1))); //equals check content
		System.out.println("calendar.equals(calendar2)?  " + (calendar.equals(calendar2)));

	}

}
