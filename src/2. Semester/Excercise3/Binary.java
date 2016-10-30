/**
 * Mit Binary kann eine Integer Zahl in ihre Binärdarstellung umgewandelt werden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/10/16
 */
public class Binary {

    /**
     * wandelt eine Integer Zahl in Binärdarstellung um
     *
     * @param zahl zu übergebende Zahl
     * @return Binärdarstellung
     */
    public static String inBinary(int zahl) {
        String ergebnis = "";
        int i = 31; // Zähler

        // schaut, wo die erste 1 gesetzt ist und merkt sich die Position mit "i"
        // i Zähler Bedingung geht nur bis 1: falls eingegebene Zahl 0 ist, wird sie noch bearbeitet/Ausgabe erstellt
        // sonst wäre die Ausgabe leer
        while (i > 0) {
            if (isSet(zahl, i)) {
                break;
            }

            i--;
        }

        // startet bei Position "i", prüft ob Bit gesetzt und setzt 1 oder 0 in den String
        while (i >= 0) {
            ergebnis += isSet(zahl, i) ? "1" : "0";
            i--;
        }

        return ergebnis;
    }

    /**
     * * gibt zurück, ob Bit bei Indexposition gesetzt ist
     *
     * @param zahl zu prüfende Zahl
     * @param index Indexposition
     * @return gesetzt? true
     */
    public static boolean isSet(int zahl, int index) {
        int hilf = 1;

        hilf = hilf << index;
        return ((zahl & hilf) == hilf) ? true : false;
    }
}
