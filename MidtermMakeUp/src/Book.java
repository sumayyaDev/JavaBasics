
public class Book {
	private String author = null;
	private String title = null;
	private int isbn = 0;
	private java.util.Date dateStored;
	private int numberOfPages = 0;
	
	public Book() {
		super();
	}
	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}
	
	public Book(String author, String title, int isbn, int numberOfPages) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.numberOfPages = numberOfPages;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public java.util.Date getDateStored() {
		return dateStored;
	}
	
	//A method named BorrowBook() that borrows the book.
	public void BorrowBook(String author, String title) {
		System.out.println("\n//The info of the book that you have borrowed is://"+
				            "\nauthor: " + author + "\ntitle: " + title);
	}
	
	//A method named ReturnBook() that returns the book.
	public void ReturnBook(String author, String title) {
		System.out.println("\n//The info of the book that you have to raturn is://"+
	            "\nauthor: " + author + "\ntitle: " + title);
	}

}
