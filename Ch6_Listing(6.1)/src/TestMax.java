
public class TestMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 5;
		int n2 = 2;
		int maximum = max(n1, n2);
		System.out.println("The maximum of " + n1 + " and " + n2 + " is " + maximum);

	}
	public static int max(int num1, int num2) {
		if(num1 > num2)
			return num1;
		else
			return num2;
	}

}
