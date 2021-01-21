package newbos_InterJava_18;
import java.util.*;

public class GenericMethod_Implementation {

	public static void main(String[] args) {
		
		Integer[] iAray = {1, 2, 3, 4};
		Character[] cAray = {'s', 'u', 'm', 'a', 'y', 'y', 'a'};
		
		printMe(iAray);
		printMe(cAray);
	}
	
	// generic method							//Instead of having to build a whole bunch of different overloaded method
	public static <T> void printMe(T[] ray) {	//we can just pass it this one generic method and pass any type of data into it
		for(T x : ray)
			System.out.printf("%s ", x);
		System.out.println();
	}	
	
	
//	private static void printMe(Integer[] i) {
//		for(Integer x : i)
//			System.out.printf("%s ", x);
//		System.out.println();
//	}
//	private static void printMe(Character[] i) {
//		for(Character x : i)
//			System.out.printf("%s ", x);
//		System.out.println();
//	}

}
