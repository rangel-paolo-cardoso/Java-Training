import java.util.Locale;

public class Exercise32 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        System.out.println("Lauching 2 dices...");
        String sentence = "Dice1 %s Dice2\n  [%d] %s [%d]\n";
        int faces = 6;
        int dice1 = (int) Math.ceil(Math.random() * faces);
        int dice2 = (int) Math.ceil(Math.random() * faces);

        if (dice1 > dice2) {
            System.out.printf(sentence, ">", dice1, ">", dice2);
        } else if (dice1 < dice2) {
            System.out.printf(sentence, "<", dice1, ">", dice2);
        } else {
            System.out.printf(sentence, "=", dice1, "=", dice2);
        }
    }
}
