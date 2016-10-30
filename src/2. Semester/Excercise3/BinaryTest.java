/**
 * reine Testklasse für die Klasse Binary
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/10/16
 */
public class BinaryTest {

    public static void main(String[] args) {

        // Grenzwert Integer im neg. Bereich
        int testzahl1 = -2147483648;
        System.out.println(testzahl1 + " : " + Binary.inBinary(testzahl1));

        // Grenzwert Integer im pos. Bereich
        int testzahl2 = 2147483647;
        System.out.println(testzahl2 + " : " + Binary.inBinary(testzahl2));

        int testzahl3 = 130;
        System.out.println(testzahl3 + " : " + Binary.inBinary(testzahl3));

        int testzahl4 = 9;
        System.out.println(testzahl4 + " : " + Binary.inBinary(testzahl4));

        int testzahl5 = -0;
        System.out.println(testzahl5 + " : " + Binary.inBinary(testzahl5));
    }
}
