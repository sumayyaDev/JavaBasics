
public class Summation {

	public static void main(String[] args) {
		double sum = 0;
		for(int i = 1; i <= 625; i++) {
			double numerator = i;
			double denominator = Math.sqrt(i+1);
			sum += (numerator / denominator);
		}
		System.out.println("Sum: " + sum);
	}

}
