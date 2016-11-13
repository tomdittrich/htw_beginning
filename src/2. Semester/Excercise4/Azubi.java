/**
 * Mit Azubi können Azubis in das System eingetragen und teilweise verändert werden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 13/11/16
 */
public class Azubi extends Mitarbeiter {

    private int jahr;
    private String beruf;

    /**
     * Default Konstruktor, Azubi Dummy
     */
    public Azubi() {
        super();
        jahr = 01;
        beruf = "Testberuf";
    }

    /**
     * Konstruktor
     *
     * @param vorname Vorname
     * @param name    Zuname
     * @param gehalt  Gehalt
     * @param jahr    Ausbildungsjahr
     * @param beruf   Berufsbezeichnung
     */
    public Azubi(String vorname, String name, double gehalt, int jahr, String beruf) {
        super(vorname, name, gehalt);
        setJahr(jahr);
        this.beruf = beruf;
    }

    /**
     * Getter Jahr
     *
     * @return Jahr
     */
    public int getJahr() {
        return jahr;
    }

    /**
     * Setter Jahr
     *
     * @param jahr Jahr
     */
    public void setJahr(int jahr) {
        // falls negative Eingabe, wird in positiv umgewandelt
        // 0 ist als "Platzhalter" zusällig, falls Ausbildung noch nicht gestartet ist
        if (jahr < 0) {
            System.out.println("Aus.Jahr darf nicht negativ sein und wurde in eine positive Zahl gewandelt.");
            this.jahr = Math.abs(jahr);
        } else {
            this.jahr = jahr;
        }
    }

    /**
     * Getter Berufsbezeichnung
     *
     * @return Beruf
     */
    public String getBeruf() {
        return beruf;
    }

    /**
     * Setter Berufsbezeichnung
     *
     * @param beruf Beruf
     */
    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    /**
     * Ausgabe der AzubiDaten
     *
     * @return Azubidaten
     */
    @Override
    public String toString() {
        String ausgabe = new String();

        ausgabe += super.toString();
        ausgabe += "Aktuelles Ausbildungsjahr: " + jahr + "\n";
        ausgabe += "Der Name des Ausbildungsberufs lautet: " + beruf + "\n";
        return ausgabe;
    }
}
