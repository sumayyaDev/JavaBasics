
public class TestComparableCircle {

	public static void main(String[] args) {
		
		ComparableCircle comparableCircle1 = new ComparableCircle(13.5);
		ComparableCircle comparableCircle2 = new ComparableCircle(18.7);
		
		System.out.println("\nComparableCircle1:");
		System.out.println(comparableCircle1);
		System.out.println("\nComparableCircle2:");
		System.out.println(comparableCircle2);
		
		System.out.println(comparableCircle1.compareTo(comparableCircle2) == 1 ? "\ncomparableCircle1" : "\ncomparableCircle2" + " is the larger of the two circles");
		
		
	}

}
