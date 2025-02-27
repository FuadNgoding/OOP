public class Book {
    private String title;
    private String id;
    private Author author;

    Book(String a, String b, Author c){
        this.title = a;
        this.id = b;
        this.author = c;
    }

    public String getTitle(){
        return title;
    }

    public String getId(){
        return id;
    }

    public Author getAuthor(){
        return author;
    }

    public void displayAddBook(){
        System.out.println("Book added " + getTitle() + " " + getId() + " " + getAuthor().getName());
    }
}
