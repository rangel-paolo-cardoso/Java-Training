import java.util.Locale;
import java.util.Scanner;

public class EnumExercise {

    public enum MathOperation {
        SUM("+") {
            @Override
            public double executeOperation(double x, double y) {
                return x + y;
            }
        },
        SUBTRACTION("-") {
            @Override
            public double executeOperation(double x, double y) {
                return x - y;
            }
        },
        MULTIPLICATION("*") {
            @Override
            public double executeOperation(double x, double y) {
                return x * y;
            }
        },
        DIVISAO("/") {
            @Override
            public double executeOperation(double x, double y) {
                return x / y;
            }
        };

        private String symbol;

        MathOperation(String symbol) {
            this.symbol = symbol;
        }

        public abstract double executeOperation(double x, double y);

        @Override
        public String toString() {
            return this.symbol;
        }
    }

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double x = sc.nextDouble();

        System.out.print("Enter  another number: ");
        double y = sc.nextDouble();

        for (MathOperation op : MathOperation.values()) {
            System.out.println(x + " " + op.toString() + " " + y + " = " + op.executeOperation(x, y));
        }

        sc.close();
    }
}
