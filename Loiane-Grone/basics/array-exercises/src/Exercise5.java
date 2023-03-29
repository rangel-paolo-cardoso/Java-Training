public class Exercise5 {
    public static void main(String[] args) throws Exception {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * i;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("A: " + a[i]);
            System.out.println("B: " + b[i] + "\n");
        }
    }
}
