package stapel_warteschlange;

/**
 * Reine Testklasse fuer die Warteschlange-Klasse
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 15.01.17
 */

public class WarteschlangeTest {
    public static void main(String[] args) {

        // Test mit Double Werten
        Warteschlange<Double> warteDouble = new Warteschlange<Double>();

        warteDouble.enqueue(1.1);
        warteDouble.enqueue(2.2);
        warteDouble.enqueue(-3.3);
        System.out.println("Queue Test mit Double Werten.");
        System.out.println("3 Elemente hinzugefuegt: \n" + warteDouble);

        System.out.println("\nDeque: " + warteDouble.dequeue());
        System.out.println("First: " + warteDouble.first());
        System.out.println("Queue leer? " + warteDouble.isEmpty());
        System.out.println("\n" + warteDouble);

        // Test mit Char Werten
        Warteschlange<Character> warteChar = new Warteschlange<Character>();

        warteChar.enqueue('a');
        warteChar.enqueue('b');
        warteChar.enqueue('c');
        System.out.println("\n----------------\nQueue Test mit Characters.");
        System.out.println("3 Elemente hinzugefuegt: \n" + warteChar);

        System.out.println("\nDeque: " + warteChar.dequeue());
        System.out.println("First: " + warteChar.first());
        System.out.println("Queue leer? " + warteChar.isEmpty());
        System.out.println("\n" + warteChar);

    }
}
