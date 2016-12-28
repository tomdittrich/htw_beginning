package login;

import exception.KeineBerechtigungException;
import exception.ZugriffUngueltigException;

import java.util.Scanner;

/**
 * Testklasse für die Klasse Login und Exceptions
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 14.12.16
 */
public class TestLogin {
    public static void main(String[] args) {

        Login login = new Login();
        Scanner input = new Scanner(System.in);
        String benutzer = "";
        String passwort = "";

        // Eingabe von Benutzername und Passwort
        System.out.print("Bitte geben Sie den Benutzernamen ein: ");
        benutzer = input.next();
        System.out.print("Bitte geben Sie das Passwort ein: ");
        passwort = input.next();

        // Anmeldung
        try {
            System.out.println("Sie werden angemeldet ...");
            login.anmelden(benutzer, passwort);
            System.out.println("Anmeldung erfolgreich!");
        } catch (ZugriffUngueltigException ex) {
            System.out.println(ex.getMessage());
        }

        // Bearbeitung
        try {
            System.out.println("Methode bearbeiten() wird aufgerufen ...");
            login.bearbeiten();
        } catch (KeineBerechtigungException ex) {
            System.out.println(ex.getMessage());
        }

        // Abmeldung
        System.out.println("Sie werden abgemeldet ...");
        login.abmelden();

        // erneuter Bearbeitungsversuch
        try {
            System.out.println("Methode bearbeiten() wird aufgerufen ...");
            login.bearbeiten();
        } catch (KeineBerechtigungException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
