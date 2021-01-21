import java.util.*;
public class GenericReturnTypes {

	public static void main(String[] args) {
		System.out.println(max(24, 42, 13));
		System.out.println(max("apples", "tots", "meat"));	
	}
	
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T maximum = a;
		
		if(b.compareTo(a) > 0)
			maximum = b;
		if(c.compareTo(maximum) > 0)
			maximum = c;
		return maximum;
	}

}
