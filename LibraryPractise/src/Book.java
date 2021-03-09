import java.util.*;
public class Book implements Comparable<Book>{
	
	private String bookTitle;
    private ArrayList<String> bookAuthor;

    public Book(String title, ArrayList<String> authors) {
        if(title == null && authors == null) {
            throw new IllegalArgumentException("Can't be null");
        }
        if(title.isEmpty() && authors.isEmpty()) {
            throw new IllegalArgumentException("Can't be empty");
        }
        bookTitle = title;
        bookAuthor = authors;
    }

    public String getTitle() {
        return bookTitle;
    }
    public ArrayList<String> getAuthors( ) {
        return bookAuthor;
    }

    public String toString( ) {
        return bookTitle + bookAuthor;
    }
    public int compareTo(Book other){
        return bookTitle.compareTo(other.bookTitle);
    }
    public boolean equals(Object o) {
         if(!(o instanceof Book)) {
             return false;
        }
         Book b = (Book) o;
         return b.bookTitle.equals(bookTitle)
                 && b.bookAuthor.equals(bookAuthor);
    }


}


