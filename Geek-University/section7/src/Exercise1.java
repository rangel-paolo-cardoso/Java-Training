import java.util.Locale;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        int[] a = new int[6];
        a[0] = 1;
        a[1] = 0;
        a[2] = 5;
        a[3] = -2;
        a[4] = -5;
        a[5] = 7;

        int sum = a[0] + a[1] + a[5];
        System.out.println("The sum is " + sum);

        a[4] = 100;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
