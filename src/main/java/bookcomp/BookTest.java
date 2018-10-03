package bookcomp;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("The Great Fatsby", new Author("F. Scott Fatsgerald", "fsfatty@gg.com", 'M'));

       System.out.println(book.author.getName());
    }
}
