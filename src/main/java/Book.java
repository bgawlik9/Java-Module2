public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author1, String title1){

        Book book = new Book(author1,title1);

        return book;
    }

    public static void main(String[] args) {
        Book book = Book.of("Hanz Guderian", "Achtung Panzer!");
    }
}
