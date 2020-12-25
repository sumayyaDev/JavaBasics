package newboston_35;

public class VariableLengthArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(average(42, 65, 98, 97, 27, 97, 92, 25));
		System.out.println(average(1, 2, 3));
	}
	public static int average(int...numbers) {
		int total = 0;
		for(int x: numbers) {
			total += x;
		}
		return total / numbers.length;
	}

}
