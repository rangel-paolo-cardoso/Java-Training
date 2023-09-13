package exercise10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise10 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the first file: ");
        String path = sc.nextLine();

        System.out.print("Enter the name to the new file: (txt, doc, etc) ");
        String fileName = sc.nextLine();

        try {
            sc = getScanner(path);
            String mostPopulousCity = defineTheMostPopulousCity(sc);
            writeFileWithTheCityInfo(fileName, mostPopulousCity);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        } finally {
            sc.close();
        }
    }

    private static void writeFileWithTheCityInfo(String fileName, String mostPopulousCity) {
        try (PrintStream fileWriter = new PrintStream(fileName)) {
            fileWriter.println(mostPopulousCity);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occured while trying to write to the file.");
        }
    }

    private static String defineTheMostPopulousCity(Scanner sc) {
        StringBuilder cityDescription = new StringBuilder();
        String mostPopulousCity = null;
        int habitants = 0;
        while (sc.hasNextLine()) {
            int previousHabitants = 0;
            String line = sc.nextLine().replaceAll("\\s+", " ");
            int lastWhiteSpacePosition = line.lastIndexOf(" ");
            previousHabitants = Integer.parseInt(line.substring(lastWhiteSpacePosition + 1));
            if (previousHabitants > habitants) {
                habitants = previousHabitants;
                mostPopulousCity = line.substring(0, lastWhiteSpacePosition);
            }
        }
        cityDescription.append("City: ");
        cityDescription.append(mostPopulousCity);
        cityDescription.append(", Number of habitants: ");
        cityDescription.append(habitants);
        return cityDescription.toString();
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
