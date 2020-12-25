
public class Time {
	
	private long hour;
	private long minute;
	private long second;
	
	public Time() {
		long totalSeconds = System.currentTimeMillis() / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		
		this.second = totalSeconds % 60;
		this.minute = totalMinutes % 60;
		this.hour = totalHours % 24;
	}
	public Time(long elapseTime) {
		long totalSeconds = elapseTime / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		
		this.second = totalSeconds % 60;
		this.minute = totalMinutes % 60;
		this.hour = totalHours % 24;
	}
	public Time(long hour, long minute, long second) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	
	public long getHour() {
		return hour;
	}
	public void setHour() {
		this.hour = hour;
	}
	public long getMinute() {
		return minute;
	}
	public void setMinute() {
		this.minute = minute;
	}
	public long getSecond() {
		return second;
	}
	public void setSecond() {
		this.second = second;
	}
	
	
	public void setTime(long elapseTime) {
		long totalSeconds = elapseTime / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		
		this.second = totalSeconds % 60;
		this.minute = totalMinutes % 60;
		this.hour = totalHours % 24;
	}
}
