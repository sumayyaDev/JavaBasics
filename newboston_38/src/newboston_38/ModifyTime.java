package newboston_38;

public class ModifyTime {
	
	private int hour;
	private int minute;
	private int second;
	// Constructor to set time(write time)
	public void setTime(int hour, int minute, int second) {
		this.hour = 4;
		this.minute = 5;
		this.second = 6;	
	}
	// Constructor to convert time into molitary time
	public String toMilitary() {
		return String.format("%02d : %02d : %02d", hour, minute, second);
	}
	public String toString() {
		return String.format("%02d : %02d : %02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour<12? "AM" : "PM"));
	}
	

}
