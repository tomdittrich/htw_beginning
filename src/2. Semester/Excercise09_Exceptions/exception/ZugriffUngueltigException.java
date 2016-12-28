package exception;

/**
 * Exception falls Benutzername oder Passwort nicht korrekt
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 14.12.16
 */
public class ZugriffUngueltigException extends Exception {

    /**
     * Default Konstruktor
     */
    public ZugriffUngueltigException() {
        super("Username or password incorrect.");
    }

    /**
     * Konstruktor mit Fehler-Textuebergabe
     *
     * @param message Text für Fehlermeldung
     */
    public ZugriffUngueltigException(String message) {
        super(message);
    }
}
