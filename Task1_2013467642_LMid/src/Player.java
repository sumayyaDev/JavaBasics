
public class Player {
	
	private String name = null;
	private int ID = 1;
	private int run = 0;
	private double strikeRate = 0;
	
	public Player() {
		
	}
	public Player(String name, int ID, int run, double strikeRate) {
		this.name = name;
		this.ID = ID;
		this.run = run;
		this.strikeRate = strikeRate;
	}
	
	public String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}
	public int getRun() {
		return run;
	}
	public double getStrikeRate() {
		return strikeRate;
	}
	
	public int addRun(int run) {
		int sum = 0;
		sum += run;
		return sum;		
	}
	
	public String toString() {
		return String.format("name = " + name + ", ID = " + ID + ", run = " + run + " and strikeRate = " +  strikeRate);
	}
}
