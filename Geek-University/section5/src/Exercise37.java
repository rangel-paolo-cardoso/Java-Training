import java.util.Locale;

public class Exercise37 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        String numbers = "";

        for (int count = 1000; count <= 9999; count += 1) {
            String[] number = String.valueOf(count).split("");
            int higherOrder = Integer.parseInt(number[0] + number[1]);
            int lowerOrder = Integer.parseInt(number[2] + number[3]);
            int sum = higherOrder + lowerOrder;
            if (sum * sum == count) {
                numbers += (count < 9999) ? count + ", " : count;
            }
        }

        System.out.println(numbers);
    }
}
