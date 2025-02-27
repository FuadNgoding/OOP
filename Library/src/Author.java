public class Author {
    private String name;
    private String definition;

    public Author(String a, String b){
        this.name = a;
        this.definition = b;
    }
    
    public String getName(){
        return name;
    }

    public String getDef(){
        return definition;
    }
}
