import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		/**
		 * Store 5 books in an array with author, title, isbn and numberOfPages.
		 * prompts the user to enter a title-->
		 * If the title is entered incorrectly, ask the user to enter a correct title.
		 * Once a title is accepted, user will borrow a book and also return it.
		 * show the availability of a book in the library-->
		 * Thus, once a book is borrowed, it can be borrowed again when it is returned.
		 */
		Scanner input = new Scanner(System.in);
		Book[] books = new Book[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter author name: ");
			String author = input.nextLine();
			
			System.out.print("Enter title: "); //Make try-catch block
			String title = input.nextLine();
			
			System.out.print("Enter isbn and numberOfPages(seperated by space): ");
			int isbn = input.nextInt();
			int numberOfPages = input.nextInt();
			books[i] = new Book(author, title, isbn, numberOfPages);
			books[i].BorrowBook(author, title);
			books[i].ReturnBook(author, title);
			input.nextLine();
		}
		

	}

}
