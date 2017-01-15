package stapel_warteschlange;

/**
 * Reine Testklasse fuer die Stapel-Klasse
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 15.01.17
 */

public class StapelTest {
    public static void main(String[] args) {

        // Test mit Integer Werten
        Stapel<Integer> stapelInt = new Stapel<Integer>();

        stapelInt.push(1);
        stapelInt.push(2);
        stapelInt.push(-3);
        System.out.println("Stapel Test mit Integer Werten.");
        System.out.println("3 Elemente hinzugefuegt: \n" + stapelInt);

        System.out.println("\nPop: " + stapelInt.pop());
        System.out.println("Top: " + stapelInt.top());
        System.out.println("Stapel leer? " + stapelInt.isEmpty());
        System.out.println("\n" + stapelInt);

        // Test mit FLoat Werten
        Stapel<Float> stapelFloat = new Stapel<Float>();

        stapelFloat.push(1.1f);
        stapelFloat.push(2.2f);
        stapelFloat.push(-3.3f);
        System.out.println("\n----------------\nStapel Test mit Float Werten.");
        System.out.println("3 Elemente hinzugefuegt: \n" + stapelFloat);

        System.out.println("\nPop: " + stapelFloat.pop());
        System.out.println("Top: " + stapelFloat.top());
        System.out.println("Stapel leer? " + stapelFloat.isEmpty());
        System.out.println("\n" + stapelFloat);

    }
}
