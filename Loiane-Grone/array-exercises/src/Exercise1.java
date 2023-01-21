public class Exercise1 {
    public static void main(String[] args) throws Exception {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("A: " + a[i]);
            System.out.println("B: " + b[i] + "\n");
        }
    }
}
