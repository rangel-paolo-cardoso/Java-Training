import java.util.Locale;

public class Exercise31 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        String expression = "";
        double s = 1.00;

        double denominator = 1.0;
        for (int numerator = 1; denominator <= 50; numerator += 2, denominator += 1) {
            s += (numerator / denominator);
            expression += (denominator != 50)
                ? "(" + (numerator) + "/" + denominator + ") + "
                : "(" + numerator +  "/" + denominator + ") = ";
        }

        System.out.println(expression + s);
    }
}
