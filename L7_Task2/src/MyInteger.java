
public class MyInteger {
	
	private int value;
	
	public MyInteger() {
		
	}
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	public boolean isOdd() {
		return !isEven();
	}
	public boolean isPrime() {
		for(int i = 2; i < value/2; i++) {
			if(value == 1 || (value != 2 && value % i == 0))
				return false;
		}
		return true;
	}
	
	
	public static boolean isEven(int value) {
		if(value % 2 == 0)
			return true;
		else
			return false;
		
	}
	public static boolean isOdd(int value) {
		if(value % 2 != 0)
			return true;
		else
			return false;
		
	}
	public static boolean isPrime(int value) {          // Check prime or not.
		for(int i = 2; i <= value/2; i++) {
			if(value == 1 || (value != 2 && value % i == 0))
				return false;
		}
		return true;
	}
	
	
	
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}
	
	
	public boolean equals(int value) {
		return this.value == value;
	}
	public boolean equals(MyInteger myInteger) {
		return this.value == myInteger.value;
	}
	
	// converts an array of numeric characters to an int value.
	public static int parseInt(char[] value) {
		int sum = 0;
		for(char i: value) {
			sum += Character.getNumericValue(i);
		}
		return sum;
	}
	// converts a string into an int value.
	public static int parseInt(String value) {
		return Integer.parseInt(value);
	}
	

}
