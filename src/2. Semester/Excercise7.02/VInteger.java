import interfaces.Vergleichbar;

/**
 * "VInteger" ist eine Klasse für Vergleichs-Integer
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 04/12/16
 */
public class VInteger extends Integer implements Vergleichbar {

    /**
     * Default Konstruktor
     * Wert wird auf 1 gesetzt
     */
    public VInteger() {
        super();
    }

    /**
     * Konstruktor
     * Eine int Zahl wird entgegengenommen
     *
     * @param w Zahl wird zum int Wert
     */
    public VInteger(int w) {
        super(w);
    }

    /**
     * vergleicht this mit dem als Parameter uebergebenen Objekt
     *
     * @param obj uebergebenes Objekt, mit dem this verglichen wird
     * @return -1, falls this kleiner ist als das Parameterobjekt;
     * 0, falls beide Objekte gleich gross sind;
     * 1, falls this groesser ist als das Parameterobjekt
     */
    @Override
    public int vergleicheMit(Vergleichbar obj) {

        // Prüfung für explizites Casting, obj zu VInteger
        if (obj instanceof VInteger) {

            // Down-Cast obj zu VInteger
            VInteger zuVergleichen = (VInteger) obj;

            if (getWert() < zuVergleichen.getWert()) {
                return -1;
            } else if (getWert() == zuVergleichen.getWert()) {
                return 0;
            } else {
                return 1;
            }
        }
        // wenn Casting nicht möglich, werfe Exception
        throw new IllegalArgumentException("Bitte VInter nutzen.");
    }
}
