package generate_random_string;

import java.nio.charset.Charset;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        System.out.println(generatedString);
    }
}
