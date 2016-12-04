import interfaces.Fax;

/**
 * Faxgeraet Klasse zum Senden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/11/16
 */
public class Faxgeraet implements Fax {

    // "globaler" Zaehler
    private static int counter = 1;
    private int transmitter;

    /**
     * Default Konstruktor
     */
    public Faxgeraet() {
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
        System.out.printf("Absender ist: Fax%d\n%s\n%s\n", transmitter, faxsimulation, sendeRef);
    }
}
