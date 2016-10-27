/**
 * Mit Binary kann eine Integer Zahl in ihre Binärdarstellung umgewandelt werden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 10/27/16
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
        BitFlags bit = new BitFlags(zahl);
        int i = 31; // Zähler

        // schaut, wo die erste 1 gesetzt ist und merkt sich die Position mit "i"
        // i Zähler Bedingung geht nur bis 1: falls eingegebene Zahl 0 ist, wird sie noch bearbeitet/Ausgabe erstellt
        // sonst wäre die Ausgabe leer
        while (i > 0) {
            if (bit.isSet(i)) {
                break;
            }

            i--;
        }

        // startet bei Position "i", prüft ob Bit gesetzt und setzt 1 oder 0 in den String
        while (i >= 0) {
            ergebnis += bit.isSet(i) ? "1" : "0";
            i--;
        }

        return ergebnis;
    }
}
