/**
 * "Integer" nimmt Integerzahlen und kann diese zurück geben
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 04/12/16
 */
public class Integer {

    private int wert;

    /**
     * Default Konstruktor
     * Wert wird auf 1 gesetzt
     */
    public Integer() {
        wert = 1;
    }

    /**
     * Konstruktor
     * Eine int Zahl wird entgegengenommen
     *
     * @param w Zahl wird zum int Wert
     */
    public Integer(int w) {
        wert = w;
    }

    /**
     * Getter Wert
     *
     * @return Wert
     */
    public int getWert() {
        return wert;
    }

    /**
     * Ausgeber der int Zahl
     *
     * @return int Wert
     */
    public String toString() {
        return java.lang.Integer.toString(wert);
    }
}
