package exercise27;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here contain fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise27 {

    public static void main(String[] args) {

        do {
            printMenu();
        } while (true);
    }

    private static void printMenu() {
        System.out.print(
                "---------- Menu ----------\n"
                        + "a) - Define class infromation\n"
                        + "b) - Insert student and grades\n"
                        + "c) - Show students and averages\n"
                        + "d) - Show approved students\n"
                        + "e) - Show failed students\n"
                        + "f) - Save data to the disk\n"
                        + "g) - Exit system\n"
                        + "Choose your option: ");
    }
}
