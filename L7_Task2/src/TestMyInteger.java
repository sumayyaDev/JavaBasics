
public class TestMyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger objValue1 = new MyInteger(23);
		MyInteger objValue2 = new MyInteger(56);
		MyInteger objValue3 = new MyInteger(2);
		MyInteger objValue4 = new MyInteger(23);
		
		System.out.println(objValue1.getValue() + " is even: " + objValue1.isEven());
		System.out.println(objValue2.getValue() + " is odd: " + objValue2.isOdd());
		System.out.println(objValue3.getValue() + " is prime: " + objValue3.isPrime());
				
		System.out.println("86 is even: " + MyInteger.isEven(86));
		System.out.println("67 is odd: " + MyInteger.isOdd(67));
		System.out.println("27 is prime: " + MyInteger.isPrime(86));
		
		System.out.println("\n" + objValue4.getValue() + " is even: " + MyInteger.isEven(objValue4) + "\n");
		
		System.out.println(objValue1.getValue() + " is equal to " + objValue4.getValue() + ": " + objValue1.equals(objValue4));
		
		System.out.println("int value of numeric characters{'1', '5', '6'} is: " + MyInteger.parseInt(new char[] {'1', '5', '6'}));
		System.out.println("int value of yhe string \"454\" is: " + MyInteger.parseInt("454"));
		
	}

}
