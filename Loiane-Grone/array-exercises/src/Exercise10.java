public class Exercise10 {
    public static void main(String[] args) throws Exception {
        int[] a = {5, 7, 7, 8, 9, 30, 55, 87, 93, 13};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = (int) a[i] % 2;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("A: " + a[i]);
            System.out.println("B: " + b[i] + "\n");
        }
    }
}
