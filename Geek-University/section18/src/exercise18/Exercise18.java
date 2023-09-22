package exercise18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>Source of zukup file data? https://www.kaufland.pl/oferta/aktualny-tydzien.html
 * </p>
 */
public class Exercise18 {
    
    public static void main(String[] args) {
        Locale polishLocale = new Locale("pl", "PL");
        Locale.setDefault(polishLocale);

        Scanner sc = getScanner();

        System.out.print("Enter the path and the file name: ");
        String path = sc.nextLine();

        try {
            sc = getScanner(path);
            BigDecimal purchaseTotal = readPurchaseDataAndTheTotal(sc);
            System.out.println(purchaseTotal);
            System.out.printf("Total purchase: %.2f zł%n", purchaseTotal);
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static BigDecimal readPurchaseDataAndTheTotal(Scanner sc) {
        String[] lineData;
        BigDecimal total = BigDecimal.ZERO;
        while (sc.hasNextLine()) {
            lineData = sc.nextLine().split(",");
            total = total.add(BigDecimal.valueOf(Double.parseDouble(lineData[1])));
        }
        return total;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
