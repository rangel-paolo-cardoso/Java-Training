package common_exercises;
public class Exercise8 {
    public static void main(String[] args) throws Exception {
        System.out.println(printResult());
    }

    public static String printResult() {
        String pattern = "";
        for (int i = 0; i < 4; i++) {
            for (int j = i; j >= 0; j--) {
                pattern += "*";
            }
            pattern += "\n";
        }
        return pattern;
    }
}
