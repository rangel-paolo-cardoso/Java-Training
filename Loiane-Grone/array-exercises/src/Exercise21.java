import java.util.Locale;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        double zeroPercentage = 0.0;
        double onesPercentage = 0.0;

        for (int pos = 0; pos < a.length; pos++) {
            a[pos] = (int) Math.round(Math.random() * 1);
        }

        for (int pos = 0; pos < a.length; pos++) {
            if (a[pos] == 0) {
                zeroPercentage +=1;
            } else {
                onesPercentage += 1;
            }
        }
        zeroPercentage = zeroPercentage / a.length * 100.0;
        onesPercentage = onesPercentage / a.length * 100.0;

        System.out.println("Percentage of zeros: " + zeroPercentage + "%");
        System.out.println("Percentage of ones: " + onesPercentage + "%");

        sc.close();
    }
}
