package interfaces;

/**
 * Interfaces für "Vergleichbar" Objekte mit vergleiche Methode
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 04/12/16
 */
public interface Vergleichbar {

    /**
     * vergleicht this mit dem als Parameter uebergebenen Objekt
     *
     * @param obj uebergebenes Objekt, mit dem this verglichen wird
     * @return -1, falls this kleiner ist als das Parameterobjekt;
     * 0, falls beide Objekte gleich gross sind;
     * 1, falls this groesser ist als das Parameterobjekt
     */

    public abstract int vergleicheMit(Vergleichbar obj);
}
