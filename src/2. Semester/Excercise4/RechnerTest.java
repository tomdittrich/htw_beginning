/**
 * Reine Testklasse für die Klasse Rechner
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.5
 * @date 02/11/16
 */
public class RechnerTest {

    public static void main(String[] args) {
        String[] test1 = {"5", "add", "5"};
        Rechner.main(test1);

        String[] test2 = {"5", "sub", "16.4"};
        Rechner.main(test2);

        String[] test3 = {"5", "mul", "-2.3"};
        Rechner.main(test3);

        String[] test4 = {"8.8", "div", "4.25"};
        Rechner.main(test4);
    }
}
