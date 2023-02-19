package exercise4;

import java.util.Date;
import java.util.Locale;

public class Exercise4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        LibraryBook book = new LibraryBook();
        book.title = "Java®: Como Programar";
        book.publisher = "Pearson Universidades; 10ª edição (24 junho 2016)";
        book.language = "Portuguese";
        book.isbn10 = "8543004799";
        book.isbn13 = "978-8543004792";
        book.dimensions = "28 x 20.8 x 3.8 cm";
        book.rating = 5;
        book.returnindDate = new Date();
        book.borrowed = true;

        System.out.println("Books tile: " + book.title);
    }
}
