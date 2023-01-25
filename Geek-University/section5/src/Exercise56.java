import java.util.Locale;

public class Exercise56 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        long sum = 2;
        boolean isPrime = true;

        System.out.println("Prime number: " + sum);
        for (int i = 3; i < 2_000_000; i += 1) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
            }
            isPrime = true;
        }

        System.out.println("The of prime number under 2 million is " + sum);
    }
}
