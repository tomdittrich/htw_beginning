/**
 * Description
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.7
 * @date 11/11/16
 */
public class Mitarbeiter {

    private String vorname;
    private String name;
    private double gehalt;

    public Mitarbeiter(){
        vorname = "Hans";
        name = "Mustermann";
        gehalt = 1500;
    }

    public Mitarbeiter(String vorname, String name, double gehalt){
        this.vorname = vorname;
        this.name = name;
        this.gehalt = gehalt;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        if(gehalt<=0){
            System.out.println("Wert darf nicht 0 oder negativ sein");
        } else {
            this.gehalt = gehalt;
        }

    }

    public void erhoeheGehalt(double a){
        if(a<=0){
            System.out.println("Wert darf nicht 0 oder negativ sein");
        } else {
            gehalt += a;
        }
    }

    @Override
    public String toString(){
        String ausgabe = new String();

        ausgabe += "Der Vorname lautet: " + vorname + "\n";
        ausgabe += "Der Nachname lautet: " + name + "\n";
        ausgabe += "Das Gehalt beträgt: " + getGehalt() + "\n";
        return ausgabe;
    }


}