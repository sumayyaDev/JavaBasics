
public class PrimeNumberMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}
	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		while(count < numberOfPrimes) {
			if(isPrime(number)) {
				count++;
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.printf("%-5d\n", number);
				}
				else
					System.out.printf("%-5d", number);					
			}
			number++; // Check whether the next number is prime
		}
	}
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0) {  // If true number is not prime
				return false;
			}
		}
		return true;     // Number is prime
	}
}
