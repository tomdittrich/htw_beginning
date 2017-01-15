package stapel_warteschlange;

import stapel_warteschlange.list.Liste;

/**
 * Klasse zum Erstellen und Verwalten von generischen Queues/Warteschlangen
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 30.12.16
 */

public class Warteschlange<T> extends Liste<T> implements WarteschlangeSchnittelle<T> {

    /**
     * Default Konstruktor
     */
    public Warteschlange() {
        super();
    }

    /**
     * Konstruktor, ein Element wird angelegt
     *
     * @param a Inhalt des Elements
     */
    public Warteschlange(T a) {
        super(a);
    }

    /**
     * Fuegt ein Elemet ans Ende der Warteschlange an
     *
     * @param wert der eingefuegte Wert
     */

    public void enqueue(T wert) {
        addLast(wert);
    }

    /**
     * Entnimmt erstes Element aus Warteschlange und liefert dessen Wert zurück
     *
     * @return Wert des Elements
     */

    public T dequeue() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("dequeue(): Queue leer");
        }

        return removeFirst();
    }

    /**
     * Liefert den ersten Wert der Warteschlange zurueck
     *
     * @return Wert des ersten Elements
     */

    public T first() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("first(): Queue leer");
        }

        return get(0);
    }

    /**
     * Prüft ob Warteschlange leer ist
     *
     * @return true, wenn leer
     */

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Warteschlange wird ausgegeben
     *
     * @return Inhalt der Warteschlange
     */

    public String toString() {
        String ergebnis = "<---";

        if (size() != 0) {
            for (int i = 0; i < size(); i++) {
                ergebnis += " " + get(i);
            }
            ergebnis += " <---";
            return ergebnis;
        }

        ergebnis += " Leer <---";
        return ergebnis;
    }
}
