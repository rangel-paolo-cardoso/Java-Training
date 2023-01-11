public class Exercise9 {
    public static void main(String[] args) throws Exception {
        System.out.println(printResult());
    }

    public static String printResult() {
        String finalStr = "";
        for (int i = 1; i <= 10; i++) {
            finalStr += 2 + " * " + i + " = " + (2 * i) + "\n";
        }
        return finalStr;
    }
}
