/**
 * reine Testklasse fuer die Klasse Vektor
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @date 10.10.16
 * @version 0.9
 */
public class VektorTest {

    public static void main(String[] args) {

        // neues Objekt, Default Konstruktor
        // mit Werten füllen, transponieren und Ausgabe
        System.out.println("Vektor1:");
        Vektor v1 = new Vektor();

        v1.setZahl(0, 1);
        v1.setZahl(1, 2);
        v1.setZahl(2, 3);
        v1.transponieren();

        System.out.println("\n" + v1.toString());
        System.out.println("---------------");

        // neues Objekt, nur Dimensions Konstruktur
        // mit Werten füllen (inkl. Fehler), get/set Zeilenvektor-Methode testen, Ausgabe
        System.out.println("Vektor2:");
        Vektor v2 = new Vektor(2, false);

        v2.setZahl(0, 11);
        v2.setZahl(1, 22);
        v2.setZahl(2, 33);

        v2.setIstZeilenvektor(true);
        System.out.println("Zeilenvektor ? " + v2.getIstZeilenvektor());

        System.out.println("\n" + v2.toString());
        System.out.println("---------------");

        // neues Objekt, Array Konstruktur genutzt
        // get Methode gibt einen Wert aus dem Vektor wieder (inkl. Fehler), Ausgabe
        System.out.println("Vektor3:");
        Vektor v3 = new Vektor(new float[]{1, 2, 3}, false);

        System.out.println("Wert an 3.Stelle: " + v3.getZahl(2));
        System.out.println(v3.getZahl(3));

        System.out.println("\n" + v3.toString());
        System.out.println("---------------");

        // Bildung von Skalar Produkt des 1. und 3. Vektors (gleiche Dimension)
        System.out.println("\nDas Skalarprodukt von Vektor1 und 3 ist: " + v1.skalarProdukt(v3));

    }
}
