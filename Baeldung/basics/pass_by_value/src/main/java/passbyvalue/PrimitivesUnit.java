package passbyvalue;

public class PrimitivesUnit {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println("X before: " + x);
        System.out.println("Y before: " + y);

        modify(x, y);

        System.out.println("X after: " + x);
        System.out.println("Y after: " + y);

        // With Objects
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        System.out.println("Foo A before: " + a.num);
        System.out.println("Foo B before: " + b.num);
        
        modify(a, b);
        
        System.out.println("Foo A after: " + a.num);
        System.out.println("Foo B after: " + b.num);
    }

    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }

    public static void modify(Foo a1, Foo b1) {
        a1.num++;
       
        b1 = new Foo(1);
        b1.num++;
    }
}
