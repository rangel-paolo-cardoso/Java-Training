package exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java®: Como Programar";
        book.publisher = "Pearson Universidades; 10ª edição (24 junho 2016)";
        book.language = "Portuguese";
        book.isbn10 = "8543004799";
        book.isbn13 = "978-8543004792";
        book.dimensions = "28 x 20.8 x 3.8 cm";
        book.rating = 5;

        System.out.println("Books tile: " + book.title);
    }
}
