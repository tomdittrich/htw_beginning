import interfaces.Drucker;
import interfaces.Fax;

/**
 * Kombigeraet Klasse zum Senden UND Drucken
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/11/16
 */
public class Kombigeraet implements Drucker, Fax {

    // "globaler" Zaehler
    private static int counter = 1;
    private int transmitter;

    /**
     * Default Konstruktor
     */
    public Kombigeraet() {
        transmitter = counter;
        counter++;
    }

    /**
     * Sendet eine zu übergebende Nachricht
     *
     * @param sendeRef Nachricht als String
     */
    @Override
    public void senden(String sendeRef) {
        System.out.printf("Absender ist: Kombigeraet%d\n%s\n%s\n", transmitter, faxsimulation, sendeRef);
    }

    /**
     * Druckt eine zu übergebende Nachricht aus
     *
     * @param druckRef Nachricht als String
     */
    @Override
    public void drucken(String druckRef) {
        System.out.printf("Kombigeraet Kombigeraet%d meldet sich\n%s\n%s\n", transmitter, drucksimulation, druckRef);
    }
}
