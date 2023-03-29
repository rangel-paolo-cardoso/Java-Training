package exercise15;

public class Counter {
    
    private static int count = 0;

    public Counter() {
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public static void increment(int number) {
        count += number;
    }

    public static void resetCount() {
        count = 0;
    }
}
