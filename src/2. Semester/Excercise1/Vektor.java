/**
 * Mit Vektor koennen mehrdimensionale Vektoren erstellt, veraendert und ausgegeben werden.
 * Einfache Anwendungen wie das Skalarprodukt oder Transponieren sind moeglich.
 * Basis fuer weitere Methoden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @date 10.10.16
 * @version 0.9
 */
public class Vektor {

    private int dimension;
    private float[] komponenten;
    private boolean istZeilenvektor = true;

    /**
     * Default Konstruktor
     * Erzeugt 3D Zeilenvektor, gefüllt mit 0en
     */
    public Vektor() {
        dimension = 3;
        komponenten = new float[dimension];
        System.out.printf("Keine Paramater angegeben. Zeilen-Vektor mit %1d Dimensionen erzeugt und mit 0en gefüllt%n", dimension);
    }

    /**
     * Konstruktor
     * Erzeugt ein n-dimensionalen Vektor, gefüllt mit 0en
     *
     * @param dimension Dimension des Vektors
     * @param istZeilenvektor Zeilenvektor? Sonst Spaltenvektor
     */
    public Vektor(int dimension, boolean istZeilenvektor) {
        this.dimension = dimension;
        komponenten = new float[dimension];
        this.istZeilenvektor = istZeilenvektor;
    }

    /**
     * Konstruktor
     * Erzeugt einen n-dimensionalen Vektor, gefüllt mit dem Übergabe-Array
     *
     * @param komponenten Array Übergabe
     * @param istZeilenvektor Zeilenvektor? Sonst Spaltenvektor
     */
    public Vektor(float[] komponenten, boolean istZeilenvektor) {
        this.dimension = komponenten.length;
        this.komponenten = komponenten;
        this.istZeilenvektor = istZeilenvektor;
    }

    /**
     * Getter Dimension
     *
     * @return (int) die Dimension
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * Getter Zeilenvektor?
     *
     * @return (boolean) Zeilenvektor?
     */
    public boolean getIstZeilenvektor() {
        return istZeilenvektor;
    }

    /**
     * Setter Zeilenvektor
     *
     * @param istZeilenvektor boolean Zeilenvektor?
     */
    public void setIstZeilenvektor(boolean istZeilenvektor) {
        this.istZeilenvektor = istZeilenvektor;
    }

    /**
     * Setter Zahl im Vektor
     *
     * @param position Position im Array/Vektor
     * @param zahl zu füllende Zahl
     */
    public void setZahl(int position, float zahl) {
        if (position + 1 <= dimension) {
            komponenten[position] = zahl;
        } else {
            System.out.println(zahl + " konnte nicht hinzugefügt werden. Der Index " + position + " liegt ausserhalb des Bereichs.");
        }
    }

    /**
     * Getter Zahl aus Vektor
     *
     * @param position Position im Array/Vektor
     * @return (float) die Zahl der Position
     */
    public float getZahl(int position) {
        if (position + 1 <= dimension) {
            return komponenten[position];
        } else {
            System.out.print("Wert nicht abrufbar. Folgender Index liegt ausserhalb des Arrays: ");
            return position;
        }
    }

    /**
     * Getter Vektor/Array
     *
     * @return (Array) gibt Vektor/Array zurück
     */
    public float[] getKomponenten() {
        return komponenten;
    }

    /**
     * Transponiert einen Spalten- in einen Zeilenvektor (oder andersherum).
     */
    public void transponieren() {
        if (istZeilenvektor) {
            istZeilenvektor = false;
            System.out.println("Zeilenvektor zu Spaltenvektor transponiert.");
        } else {
            istZeilenvektor = true;
            System.out.println("Spaltenvektor zu Zeilenvektor transponiert.");
        }
    }

    /**
     * Berechnet Skalarprodukt mit einem zusätzlichen Vektor
     *
     * @param bVektor zweiter zu übergebender Vektor (Vektor Objekt)
     * @return (float) das Skalar
     */
    public float skalarProdukt(Vektor bVektor) {
        float skalar = 0;

        if (komponenten.length == bVektor.getDimension()) {
            for (int i = 0; i < komponenten.length; i++) {
                skalar += komponenten[i] * bVektor.getZahl(i);
            }
        } else {
            System.out.println("Dimensionen stimmen nicht überein, kein Skalarprodukt möglich.");
        }

        return skalar;
    }

    /**
     * toString() Methode / Ausgabe
     *
     * @return (string)
     */
    public String toString() {
        String ausgabe = new String();

        if (istZeilenvektor) {
            ausgabe += "( ";
            for (float elem : komponenten) {
                ausgabe += elem + " ";
            }
            ausgabe += ")\n";
            ausgabe += "Ist ein Zeilenvektor mit der Dimension " + dimension;

        } else {
            for (float elem : komponenten) {
                ausgabe += "( " + elem + " )\n";
            }
            ausgabe += "Ist ein Spaltenvektor mit der Dimension " + dimension;
        }

        return ausgabe;


    }

}
