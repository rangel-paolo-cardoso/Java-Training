package multi_threading;

public class Counter {
    
    private int count = 0;

    public synchronized void incremet() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
