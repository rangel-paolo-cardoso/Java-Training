import java.util.Locale;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number under 1000: ");
        String number = sc.nextLine();

        String[] numberDigits = number.split("");
        String phrase = "";
        int hundreds = 0;
        int tens = 0;
        int units = 0;

        if (numberDigits.length == 1) {
            units = Integer.parseInt(numberDigits[0]);
        } else if (numberDigits.length == 2) {
            tens = Integer.parseInt(numberDigits[0]);
            units = Integer.parseInt(numberDigits[1]);
        } else {
            hundreds = Integer.parseInt(numberDigits[0]);
            tens = Integer.parseInt(numberDigits[1]);
            units = Integer.parseInt(numberDigits[2]);
        }

        if (hundreds > 0 && tens > 0 && units > 0) {
            if (hundreds > 0 && hundreds == 1) {
                phrase += "%d hundred, ";
            } else if (hundreds > 1) {
                phrase += "%d hundreds, ";
            }

            if (tens > 0 && tens == 1) {
                phrase += "%d ten and ";
            } else if (tens > 1) {
                phrase += "%d tens and ";
            }

            if (units > 0 && units == 1) {
                phrase += "%d unit\n";
            } else if (units > 1) {
                phrase += "%d units\n";
            }
            System.out.printf(phrase, hundreds, tens, units);
        } else if (hundreds > 0 && tens > 0) {
            if (hundreds > 0 && hundreds == 1) {
                phrase += "%d hundred and ";
            } else if (hundreds > 1) {
                phrase += "%d hundreds and ";
            }

            if (tens > 0 && tens == 1) {
                phrase += "%d ten\n";
            } else if (tens > 1) {
                phrase += "%d tens\n";
            }
            System.out.printf(phrase, hundreds, tens);
        } else if (hundreds > 0 && units > 0) {
            if (hundreds > 0 && hundreds == 1) {
                phrase += "%d hundred and ";
            } else if (hundreds > 1) {
                phrase += "%d hundreds and ";
            }

            if (units > 0 && units == 1) {
                phrase += "%d unit\n";
            } else if (units > 1) {
                phrase += "%d units\n";
            }
            System.out.printf(phrase, hundreds, units);
        } else if (tens > 0 && units > 0) {
            if (tens > 0 && tens == 1) {
                phrase += "%d ten and ";
            } else if (tens > 1) {
                phrase += "%d tens and ";
            }

            if (units > 0 && units == 1) {
                phrase += "%d unit\n";
            } else if (units > 1) {
                phrase += "%d units\n";
            }
            System.out.printf(phrase, tens, units);
        } else if (hundreds > 0) {
            if (hundreds > 0 && hundreds == 1) {
                phrase += "%d hundred\n";
            } else if (hundreds > 1) {
                phrase += "%d hundreds\n";
            }
            System.out.printf(phrase, hundreds);
        } else if (tens > 0) {
            if (tens > 0 && tens == 1) {
                phrase += "%d ten\n";
            } else if (tens > 1) {
                phrase += "%d tens\n";
            }
            System.out.printf(phrase, tens);
        } else if (units > 0) {
            if (units > 0 && units == 1) {
                phrase += "%d unit\n";
            } else if (units > 1) {
                phrase += "%d units\n";
            }
            System.out.printf(phrase, units);
        }

        sc.close();
    }
}
