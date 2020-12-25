package multipleClsMethodParametrs;
import java.util.Scanner;
class oranges {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		sumu sumuObject = new sumu();
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		sumuObject.sumayyasMessage(name);
		
	}

}
