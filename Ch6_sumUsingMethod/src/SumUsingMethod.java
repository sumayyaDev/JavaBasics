
public class SumUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum from 1 to 10 is " + sum(1, 10));
		System.out.println("Sum from 20 to 37 is " + sum(20, 37));
		System.out.println("Sum from 35 to 49 is " + sum(35, 49));
	}
	public static int sum(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		return sum;
	}

}
