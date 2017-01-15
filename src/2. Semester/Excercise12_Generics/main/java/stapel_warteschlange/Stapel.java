package stapel_warteschlange;

import stapel_warteschlange.list.Liste;

/**
 * Klasse zum Erstellen und Verwalten von generischen Stacks/Stapeln
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.17
 *
 * @param <T> Typ der zu speichernden Daten
 */

public class Stapel<T> extends Liste<T> implements StapelSchnittstelle<T> {

    /**
     * Default Konstruktor
     */
    public Stapel() {
        super();
    }

    /**
     * Konstruktor, ein Element wird angelegt
     *
     * @param a Inhalt des Elements
     */
    public Stapel(T a) {
        super(a);
    }

    /**
     * Legt ein Element auf den Stack
     *
     * @param wert der abzulegende Wert
     */

    public void push(T wert) {
        addFirst(wert);
    }

    /**
     * Nimmt oberstes Element herunter und liefer es zurueck
     *
     * @return Wert des Elements
     * @throws NullPointerException wenn Stack leer ist
     */

    public T pop() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("pop(): Stack leer");
        }
        return removeFirst();
    }

    /**
     * Liefert Wert des obersten Elements zurueck
     *
     * @return Wert oberstes Element
     * @throws NullPointerException wenn Stack leer ist
     */

    public T top() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("top(): Stack leer");
        }
        return get(0);
    }

    /**
     * Prüft ob Stack leer ist
     *
     * @return true, wenn leer
     */

    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Stack wird ausgegeben
     *
     * @return Inhalt des Stacks
     */

    public String toString() {
        String ergebnis = "";

        if (size() != 0) {
            for (int i = 0; i < size(); i++) {
                ergebnis += "** " + get(i) + " **\n";
            }
            ergebnis += "*******";
            return ergebnis;
        }

        ergebnis += "* Leer *\n********";
        return ergebnis;
    }
}
