import java.util.*;
public class Library{
	
	private ArrayList<Book> allBook = new ArrayList<Book>();

    public Library(ArrayList<Book> other) {
        if (other == null) {
            throw new NullPointerException("null pointer");
        } else
            this.allBook = other;
    }

    public Library() {
        this.allBook = new ArrayList<Book>();
    }

    public boolean add(Book book) {
        if (book != null && !book.equals("")) {
            throw new IllegalArgumentException("Can't be empty");
        }
        allBook.add(book);
        return true;
    }

    public ArrayList<Book> findTitles(String title) {
        for(Book b: allBook) {
            if(title.compareTo(b.getTitle())== 0) {
                return allBook;
            }
        }
        return null;
    }

    public void sort() {
        Collections.sort(allBook);
    }

    public String toString() {
        return Library.this.toString();
    }
}


