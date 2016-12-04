import interfaces.Vergleichbar;

/**
 * Klasse fuer nuetzliche Funktionen
 * So kann momentan das kleinste Element eines "Vergleichbar" Arrays gesucht werden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 04/12/16
 */
public class NuetzlicheFunktion {

    /**
     * bestimmt ein kleinstes (auf Basis der Vergleichbar-Implementierung)
     * Element des Parameter-Arrays
     *
     * @param array übergebenes Array
     * @return ein kleinstes Element des übergebenen Arrays
     */
    public static Vergleichbar kleinstesElement(Vergleichbar[] array) {

        if (array.length == 0) {
            System.out.println("Leeres Array, kein Vergleich");
            return null;
        } else if (array.length == 1) {
            return array[0];
        } else {
            Vergleichbar min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (min.vergleicheMit(array[i]) >= 1) {
                    min = array[i];
                }
            }
            return min;
        }
    }
}
