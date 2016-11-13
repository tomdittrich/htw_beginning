/**
 * Mit Mitarbeter kann neues Personal in das System eingetragen und teilweise verändert werden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 13/11/16
 */
public class Mitarbeiter {

    private String vorname;
    private String name;
    private double gehalt;

    /**
     * Default Konstruktor, Mitarbeiter Dummy
     */
    public Mitarbeiter() {
        vorname = "Hans";
        name = "Mustermann";
        gehalt = 1500;
    }

    /**
     * Konstruktur
     *
     * @param vorname Vorname
     * @param name    Nachname
     * @param gehalt  Gehalt
     */
    public Mitarbeiter(String vorname, String name, double gehalt) {
        this.vorname = vorname;
        this.name = name;
        setGehalt(gehalt);
    }

    /**
     * Getter Vorname
     *
     * @return Vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Setter Vorname
     *
     * @param vorname Vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * Getter Zuname
     *
     * @return Zuname
     */
    public String getName() {
        return name;
    }

    /**
     * Setter Zuname
     *
     * @param name Zuname
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter Gehalt
     *
     * @return Gehalt
     */
    public double getGehalt() {
        return gehalt;
    }

    /**
     * Setter Gehalt
     *
     * @param gehalt Gehalt
     */
    public void setGehalt(double gehalt) {
        // falls negative Eingabe, wird in positiv umgewandelt
        // 0 ist zusällig, falls jemand kein Gehalt bezieht (Praktikant)
        if (gehalt < 0) {
            System.out.println("Wert darf nicht negativ sein und wurde in eine positive Zahl gewandelt.");
            this.gehalt = Math.abs(gehalt);
        } else {
            this.gehalt = gehalt;
        }

    }

    /**
     * Erhoeht das Gehalt
     *
     * @param a zu erhoehender Betrag
     */
    public void erhoeheGehalt(double a) {
        // Wert 0 ? ungültig
        if (a == 0) {
            System.out.println("Wert darf nicht 0 sein.");
        } else {
            // Wert negativ? Absolut Betrag
            if (a < 0) {
                System.out.println("Wert darf nicht negativ sein und wurde in eine positive Zahl gewandelt.");
                gehalt += Math.abs(a);
            } else {
                gehalt += a;
            }
        }
    }

    /**
     * Ausgabe der Personaldaten
     *
     * @return Personaldaten
     */
    @Override
    public String toString() {
        String ausgabe = new String();

        ausgabe += "Der Vorname lautet: " + vorname + "\n";
        ausgabe += "Der Nachname lautet: " + name + "\n";
        ausgabe += "Das Gehalt beträgt: " + getGehalt() + "\n";
        return ausgabe;
    }

}