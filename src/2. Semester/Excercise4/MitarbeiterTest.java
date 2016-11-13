/**
 * Reine Testklasse für die Klasse Mitarbeiter und Azubi
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 13/11/16
 */
public class MitarbeiterTest {

    public static void main(String[] args) {

        //neuer default Mitarbeiter
        // Test von Gettern
        // Test von Gehaltserhöhung inkl. Fehler
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

        // neuer Mitarbeiter, Standard
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Frank", "Walser", 1600);
        System.out.println(mitarbeiter2);

        // neuer Mitarbeiter, Standard
        // Test von Settern, inkl. Fehler
        Mitarbeiter mitarbeiter3 = new Mitarbeiter();
        mitarbeiter3.setVorname("Hans");
        mitarbeiter3.setName("Boss");
        mitarbeiter3.setGehalt(-4000);
        System.out.println(mitarbeiter3);

        // neuer Mitarbeiter, Standard, inkl Fehler
        Mitarbeiter mitarbeiter4 = new Mitarbeiter("Eva", "Flink", -1650);
        System.out.println(mitarbeiter4);

        // neuer default Azubi
        // Test von Gettern
        // Test von Gehaltserhöhung
        Azubi azubi1 = new Azubi();
        System.out.println("Default Azubi Vorname: " + azubi1.getVorname());
        System.out.println("Default Azubi Name: " + azubi1.getName());
        System.out.println("Default Azubi Gehalt: " + azubi1.getGehalt());
        System.out.println("Default Azubi Jahr: " + azubi1.getJahr());
        System.out.println("Default Azubi Berufsname: " + azubi1.getBeruf());
        azubi1.erhoeheGehalt(105.44);
        System.out.println("Default Azubi neues Gehalt (+105,44€): " + azubi1.getGehalt() + "\n");

        // neue Azubine, Standard
        Azubi azubi2 = new Azubi("Sabrina", "Lustig", 900.5, 03, "Grafikdesign");
        System.out.println(azubi2);

        // neuer Azubi, Standard
        // Test von Settern, inkl. Fehler
        Azubi azubi3 = new Azubi();
        azubi3.setVorname("Sven");
        azubi3.setName("Vogel");
        azubi3.setGehalt(450.00);
        azubi3.setJahr(-02);
        azubi3.setBeruf("Kaufmann");
        System.out.println(azubi3);

    }
}
