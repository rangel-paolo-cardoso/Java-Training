public class Exercise7 {
    public static void main(String[] args) throws Exception {
        int[] a = {5, 7, 7, 8, 9, 30, 55, 87, 93, 13};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("A: " + a[i]);
            System.out.println("B: " + b[i]);
            System.out.println("C: " + c[i] + "\n");
        }
    }
}
