package login;

import exception.KeineBerechtigungException;
import exception.ZugriffUngueltigException;

/**
 * Einfache Klasse um sich wo An- und Abzumelden, inkl. Bearbeitung
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 14.12.16
 */
public class Login {

    private boolean angemeldet;

    /**
     * Default Konstruktor
     * setzt "angemeldet" auf false
     */
    public Login() {
        angemeldet = false;
    }

    /**
     * Anmeldungsvorgang
     * Momentan nur gueltig
     * Benutzer: test
     * Passwort: 1234
     *
     * @param benutzer Benutzername
     * @param passwort Passwort
     * @throws ZugriffUngueltigException bei ungueltigem Benutzername oder Passwort
     */
    public void anmelden(String benutzer, String passwort) throws ZugriffUngueltigException {
        if (("test").equals(benutzer) && ("1234").equals(passwort)) {
            angemeldet = true;
        } else {
            throw new ZugriffUngueltigException();
        }
    }

    /**
     * Abmeldungsvorgang
     */
    public void abmelden() {
        angemeldet = false;
    }

    /**
     * Bearbeitungsvorgang
     *
     * @throws KeineBerechtigungException falls Nutzer keine Berechtigung hat/nicht angemeldet ist
     */
    public void bearbeiten() throws KeineBerechtigungException {
        if (!angemeldet) {
            throw new KeineBerechtigungException();
        }

        System.out.println("Bearbeitung vollständig");
    }
}
