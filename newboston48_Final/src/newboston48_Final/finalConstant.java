package newboston48_Final;

public class finalConstant {
	
	private int sum;
	public final int NUMBER;
	
	public finalConstant(int x) {
		NUMBER = x;
	}
	public void add() {
		sum += NUMBER;
	}
	public String toString() {
		return String.format("sum = %s\n", sum);
	}

}
