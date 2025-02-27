import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
    private List<Book> borrowed;

    public Borrower(String a){
        this.name = a;
        this.borrowed = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void borrowBook(Book book){
        borrowed.add(book);
    }

    public void returnBook(Book book){
        borrowed.remove(book);
    }

    public void displayBorrowedBooks(){
            for (Book book : borrowed){
                System.out.println(book.getTitle() + " by " + book.getAuthor().getName());
            }
    }
}

