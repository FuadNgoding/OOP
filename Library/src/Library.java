import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook (Book book){
        books.add(book);
    }

    public void borrowBook(Borrower borrower, Book book){
        if (books.contains(book)){
            books.remove(book);
            borrower.borrowBook(book);
            System.out.println(borrower.getName() + " borrowed " + book.getTitle());
        }
        
        else {
            System.out.println(book.getTitle() + " is not available in the library.");
        }
    }
    
    public void returnBook(Borrower borrower, Book book){
        borrower.returnBook(book);
        books.add(book);
        System.out.println(borrower.getName() + " returned the " + book.getTitle());
    }

    public void displayLibraryBooks(){
        System.out.println("Book(s) that available in library : ");

        for (Book book : books){
            System.out.println(book.getTitle() + " by " + book.getAuthor().getName());
        }
    }
}
