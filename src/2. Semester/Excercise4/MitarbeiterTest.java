/**
 * Description
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.8
 * @date 11/11/16
 */
public class MitarbeiterTest {

    public static void main(String[] args) {

        Mitarbeiter mitarbeiter1 = new Mitarbeiter();
        System.out.println("Default Mitarbeiter Vorname: " + mitarbeiter1.getVorname());
        System.out.println("Default Mitarbeiter Zuname: " + mitarbeiter1.getName());
        System.out.println("Default Mitarbeiter Gehalt: " + mitarbeiter1.getGehalt());
        mitarbeiter1.erhoeheGehalt(700.50);
        System.out.println("Default Mitarbeiter neues Gehalt (+700,50€): " + mitarbeiter1.getGehalt());
        mitarbeiter1.erhoeheGehalt(-500.30);
        System.out.println("Default Mitarbeiter neues Gehalt (ABSOLUT -500.30): " + mitarbeiter1.getGehalt());
        mitarbeiter1.erhoeheGehalt(0);
        System.out.println("");

        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Frank", "Walser", 1600);
        System.out.println(mitarbeiter2);

        Mitarbeiter mitarbeiter3 = new Mitarbeiter();
        mitarbeiter3.setVorname("Hans");
        mitarbeiter3.setName("Boss");
        mitarbeiter3.setGehalt(-4000);
        System.out.println(mitarbeiter3);

        Azubi azubi1 = new Azubi();
        System.out.println("Default Azubi Vorname: " + azubi1.getVorname());
        System.out.println("Default Azubi Name: " + azubi1.getName());
        System.out.println("Default Azubi Gehalt: " + azubi1.getGehalt());
        System.out.println("Default Azubi Jahr: " + azubi1.getJahr());
        System.out.println("Default Azubi Berufsname: " + azubi1.getBeruf());
        azubi1.erhoeheGehalt(105.44);
        System.out.println("Default Azubi neues Gehalt (+105,44€): " + azubi1.getGehalt() + "\n");

        Azubi azubi2 = new Azubi("Sabrina", "Lustig", 900.5, 2014, "Grafikdesign");
        System.out.println(azubi2);

        Azubi azubi3 = new Azubi();
        azubi3.setVorname("Lutz");
        azubi3.setName("Winkler");
        azubi3.setGehalt(1050.64);
        azubi3.setJahr(2015);
        azubi3.setBeruf("Kaufmann");
        System.out.println(azubi3);


    }
}
