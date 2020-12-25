
public class TestMyDate {

	public static void main(String[] args) {
		/* Write a test program that
		* creates two MyDate objects (using new MyDate() and new MyDate(34355555133101L)) and
		* displays their year, month, and day.*/
		MyDate date = new MyDate();
		MyDate date1 = new MyDate(34355555133101L);
		
		System.out.println("The year is " + date1.getYear() + ", the month is " + date1.getMonth() + ", the day is " + date1.getDay() + ".");
		

	}

}
