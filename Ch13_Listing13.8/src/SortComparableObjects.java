import java.math.*;

public class SortComparableObjects {

	public static void main(String[] args) {
		String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
		for(String x: cities) {
			System.out.print(x + "  ");
		}
		System.out.println("\nSorted array: ");
		java.util.Arrays.sort(cities);
		for(String x: cities) {
			System.out.print(x + "  ");
		}
		System.out.println("\n");
		
		BigInteger[] hugeNumber = {new BigInteger("2323231092923992"), new BigInteger("432232323239292"), new BigInteger("54623239292")};
		
		for(BigInteger numbers: hugeNumber) {
			System.out.print(numbers + "  ");
		}
		java.util.Arrays.sort(hugeNumber);
		System.out.println("\nSorted numbers: ");
		for(BigInteger numbers: hugeNumber) {
			System.out.print(numbers + "  ");
		}
	}

}
