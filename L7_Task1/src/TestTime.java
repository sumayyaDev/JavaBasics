
public class TestTime {

	public static void main(String[] args) {
		// Write a test program that creates two Time objects (using new Time() and new Time(555550000))
		// and second in the format hour:minute:second.
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		System.out.println(time2.getHour()+ ":" + time2.getMinute() + ":" + time2.getSecond());
		
	}

}
