import java.util.Scanner;
public class testPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Player[] player = new Player[11];
		
		for(int i = 0; i < 11; i++) {
			System.out.print("Enter name: ");
			String name = input.next();
			System.out.print("Enter ID: ");
			int ID = input.nextInt();
			System.out.print("Enter run: ");
			int run = input.nextInt();
			System.out.print("Enter strikeRate: ");
			double strikeRate = input.nextDouble();
			player[i] = new Player(name, ID, run, strikeRate);
			player[i].addRun(run);
		}
		
		int highestRun = player[0].getRun();
		String playerName = player[0].getName();
		for(int i = 1; i < 11; i++) {
			if(highestRun < player[i].getRun()) {
				highestRun = player[i].getRun();
				playerName = player[i].getName();
			}
		}
		System.out.println("Highest Run = " + highestRun + "\tPlayer Name = " + playerName);
	}

}
