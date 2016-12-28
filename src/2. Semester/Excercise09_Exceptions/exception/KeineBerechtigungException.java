package exception;

/**
 * Exception falls keine Berechtigung vorliegt
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 14.12.16
 */
public class KeineBerechtigungException extends Exception {

    /**
     * Default Konstruktor
     */
    public KeineBerechtigungException() {
        super("You have no power here.");
    }

    /**
     * Konstruktor mit Fehler-Textuebergabe
     *
     * @param message Text für Fehlermeldung
     */
    public KeineBerechtigungException(String message) {
        super(message);
    }
}
