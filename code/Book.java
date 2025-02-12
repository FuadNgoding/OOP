public class Book{
    private  String title;
    private  String id;
    private  Author author;
    
    public Book(String a, String b, Author c){
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

    @Override
    public String toString(){
        return title + " " + id + " " + " by " + author.getName();
    }
}
