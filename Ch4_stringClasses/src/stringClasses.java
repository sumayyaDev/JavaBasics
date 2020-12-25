import java.util.Scanner;
public class stringClasses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Check whether two strings are equals or not
		String s1 = "My name is Sumayya";
		String s2 = "My name is Sumayya";
		String s3 = "My name is Sumayya Akter";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println();
		
		System.out.println("Welcome to Java".startsWith("We"));
		System.out.println("Welcome to Java".startsWith("we"));
		System.out.println();
		
		System.out.println("Welcome to Java".endsWith("va"));
		System.out.println("Welcome to java".endsWith("v"));
		System.out.println();
		
		System.out.println("Welcome to Java".contains("to"));
		System.out.println("Welcome to Java".contains("To"));
		
	}

}
