
public class deckOfCards {

	public static void main(String[] args) {
		// Write a program that will pick four cards at random from a deck of 52 cards.
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// Initialize the cards
		for(int i = 0; i < deck.length; i++)
			deck[i] = i;     // 52 cards index of(0 to 51)
		
		// Shuffle the cards
		  for(int i = 0; i < deck.length; i++) { 
			  // Generate an index randomly 
			  int index =(int) (Math.random() * deck.length); 
			  int temp = deck[i];
			  deck[i] = deck[index]; 
			  deck[index] = temp; 
			  }
		
		// Display the first four cards
		  for(int i = 0; i < 4; i++) { 
			  String suit = suits[deck[i] / 13]; 
			  String rank = ranks[deck[i] % 13]; 
			  System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
			  }
		 
		
		/*
		 * for(int i = 0; i < 4; i++) { int cardNumber = (int) (Math.random() *
		 * deck.length); String suit = suits[cardNumber / 13]; String rank =
		 * ranks[cardNumber % 13]; System.out.println("Card number " + deck[i] + ": " +
		 * rank + " of " + suit); }
		 */
	}

}
