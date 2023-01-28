import java.util.Locale;
import java.util.Scanner;

public class Exercise62 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = 1000;
        int numberOfLetters = 0; // In portuguese

        for (int i = 1; i <= number; i++) {
            String[] numberDigits = String.valueOf(i).split("");
            String invertedNumber = "";
            for (int j = numberDigits.length - 1; j >= 0; j--) {
                invertedNumber += numberDigits[j];
            }

            for (int j = 0; j < invertedNumber.length(); j++) {
                char convertedNUmber = invertedNumber.charAt(j);
                if (j == 0) {
                    switch (convertedNUmber) {
                        case '1':
                            numberOfLetters += 2;
                            break;
                        case '2':
                        case '3':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            numberOfLetters += 4;
                            break;
                        case '5':
                            numberOfLetters += 5;
                            break;
                        case '4':
                            numberOfLetters += 6;
                            break;
                    }
                }
                else if (j == 1) {
                    switch (convertedNUmber) {
                        case '1':
                            numberOfLetters += 3;
                            break;
                        case '2':
                            numberOfLetters += 5;
                            break;
                        case '3':
                            numberOfLetters += 6;
                            break;
                        case '4':
                            numberOfLetters += 8;
                            break;
                        case '5':
                            numberOfLetters += 9;
                            break;
                        case '6':
                            numberOfLetters += 8;
                            break;
                        case '7':
                        case '8':
                        case '9':
                            numberOfLetters += 7;
                            break;
                    }
                } // dezenas
                else if (j == 2) {
                    switch (convertedNUmber) {
                        case '1':
                            numberOfLetters += 3;
                            break;
                        case '2':
                            numberOfLetters += 8;
                            break;
                        case '3':
                            numberOfLetters += 9;
                            break;
                        case '4':
                            numberOfLetters += 12;
                            break;
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            numberOfLetters += 10;
                            break;
                    }
                } // centenas
                else {
                    numberOfLetters += 3;
                } // milhares
            }
        }

        System.out.println("NUmber of letters: " + numberOfLetters);

        sc.close();
    }
}
