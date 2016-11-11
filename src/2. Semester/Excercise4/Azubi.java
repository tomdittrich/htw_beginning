/**
 * Description
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.8
 * @date 11/11/16
 */
public class Azubi extends Mitarbeiter {

    private int jahr;
    private String beruf;

    public Azubi() {
        super();
        jahr = 2016;
        beruf = "Testberuf";
    }

    public Azubi(String vorname, String name, double gehalt, int jahr, String beruf) {
        super(vorname, name, gehalt);
        this.jahr = jahr;
        this.beruf = beruf;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    @Override
    public String toString() {
        String ausgabe = new String();

        ausgabe += super.toString();
        ausgabe += "Aktuelles Ausbildungsjahr: " + jahr + "\n";
        ausgabe += "Der Name des Ausbildungsberufs lautet: " + beruf + "\n";
        return ausgabe;
    }
}
