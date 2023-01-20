import java.util.Locale;

public class Exercise34 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int number6 = 6;
        int number7 = 7;
        int number8 = 8;
        int number9 = 9;
        int number10 = 10;
        int number11 = 11;
        int number12 = 12;
        int number13 = 13;
        int number14 = 14;
        int number15 = 15;
        int number16 = 16;
        int number17 = 17;
        int number18 = 18;
        int number19 = 19;
        int number20 = 20;
        int divisor = 2;
        int result = 1;

        while (number2 != 1
                || number3 != 1
                || number4 != 1
                || number5 != 1
                || number6 != 1
                || number7 != 1
                || number8 != 1
                || number9 != 1
                || number10 != 1
                || number11 != 1
                || number12 != 1
                || number13 != 1
                || number14 != 1
                || number15 != 1
                || number16 != 1
                || number17 != 1
                || number18 != 1
                || number19 != 1
                || number20 != 1) {
            while (number2 % divisor != 0
                    && number3 % divisor != 0
                    && number4 % divisor != 0
                    && number5 % divisor != 0
                    && number6 % divisor != 0
                    && number7 % divisor != 0
                    && number8 % divisor != 0
                    && number9 % divisor != 0
                    && number10 % divisor != 0
                    && number11 % divisor != 0
                    && number12 % divisor != 0
                    && number13 % divisor != 0
                    && number14 % divisor != 0
                    && number15 % divisor != 0
                    && number16 % divisor != 0
                    && number17 % divisor != 0
                    && number18 % divisor != 0
                    && number19 % divisor != 0
                    && number20 % divisor != 0) {
                divisor += 1;
            }

            if (number2 % divisor == 0) {
                number2 = number2 / divisor;
            }
            if (number3 % divisor == 0) {
                number3 = number3 / divisor;
            }
            if (number4 % divisor == 0) {
                number4 = number4 / divisor;
            }
            if (number5 % divisor == 0) {
                number5 = number5 / divisor;
            }
            if (number6 % divisor == 0) {
                number6 = number6 / divisor;
            }
            if (number7 % divisor == 0) {
                number7 = number7 / divisor;
            }
            if (number8 % divisor == 0) {
                number8 = number8 / divisor;
            }
            if (number9 % divisor == 0) {
                number9 = number9 / divisor;
            }
            if (number10 % divisor == 0) {
                number10 = number10 / divisor;
            }
            if (number11 % divisor == 0) {
                number11 = number11 / divisor;
            }
            if (number12 % divisor == 0) {
                number12 = number12 / divisor;
            }
            if (number13 % divisor == 0) {
                number13 = number13 / divisor;
            }
            if (number14 % divisor == 0) {
                number14 = number14 / divisor;
            }
            if (number15 % divisor == 0) {
                number15 = number15 / divisor;
            }
            if (number16 % divisor == 0) {
                number16 = number16 / divisor;
            }
            if (number17 % divisor == 0) {
                number17 = number17 / divisor;
            }
            if (number18 % divisor == 0) {
                number18 = number18 / divisor;
            }
            if (number19 % divisor == 0) {
                number19 = number19 / divisor;
            }
            if (number20 % divisor == 0) {
                number20 = number20 / divisor;
            }
            result *= divisor;
        }

        System.out.println("The LCM is " + result);
    }
}
