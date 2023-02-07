import java.util.Locale;

public class Exercise25 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        int[] numbers = new int[100];
        int count = 0;
        int number = 1;

        while (count < 100) {
            String numberString = String.valueOf(number);
            char lastDigit = numberString.charAt(numberString.length() - 1);
            if (number % 7 != 0 && lastDigit != '7') {
                numbers[count] = number;
                count += 1;
            }
            number += 1;
        }

        System.out.println("Length: " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
