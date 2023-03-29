package exercise3;

import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        BookStoreBook book = new BookStoreBook();
        book.title = "Java®: Como Programar";
        book.price = 42.90d;
        book.section = "Sifi";
        book.pages = 280;
        book.bookBinding = "Booklet";
        book.isbn = "9788535914061";
        book.weight = 233.0;
        book.format = "12.5 x 18 x 1.4 CM";
        book.keyWords = "Literatura Brasileira";
        book.rating = 5;
        book.url = "https://www.livrariamegafauna.com.br/produto/capitaes-da-areia-2/";

        System.out.println("Books tile: " + book.title);
    }
}
