package newboston16CrushName;
import java.util.Scanner;

class sumu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		crush crushObject = new crush();
		System.out.print("Enter name of first crush here: ");
		String temp = input.nextLine();
		
		crushObject.setName(temp);
		crushObject.saying();
	}

}
