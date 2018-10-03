package bookcomp;

public class Book {
    public String title;
    public Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void findAuthor(){
        if(author != null){
            author.printAuthorName();
        }
    }
}
