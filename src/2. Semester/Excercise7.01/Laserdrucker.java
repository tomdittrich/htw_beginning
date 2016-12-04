import interfaces.Drucker;

/**
 * Drucker Klasse zum Drucken
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/11/16
 */
public class Laserdrucker implements Drucker {

    // "globaler" Zaehler
    private static int counter = 1;
    private int transmitter;

    /**
     * Default Konstruktor
     */
    public Laserdrucker() {
        transmitter = counter;
        counter++;
    }

    /**
     * Druckt eine zu übergebende Nachricht
     *
     * @param druckRef Nachricht als String
     */
    @Override
    public void drucken(String druckRef) {
        System.out.printf("Drucker Laser%d meldet sich\n%s\n%s\n", transmitter, drucksimulation, druckRef);
    }
}
