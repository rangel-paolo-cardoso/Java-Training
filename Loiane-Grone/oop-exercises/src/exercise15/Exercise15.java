package exercise15;

public class Exercise15 {
    
    public static void main(String[] args) {
        
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Count after 3 instances: " + Counter.getCount());
        Counter.increment(5);
        System.out.println("Count after increment 5: " + Counter.getCount());
        Counter.resetCount();
        System.out.println("Count after reseting: " + Counter.getCount());
    }
}
