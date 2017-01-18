package stack;

import list.List;

/**
 * Klasse zum Erstellen und Verwalten von generischen Stacks/Stapeln
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.17
 *
 * @param <T> Typ der zu speichernden Daten
 */

// Methoden wie addAtIndex, clearAll, removeAtIndex, size werden vererbt
// um die Uebersichtlichkeit zu erhoehen, wurde auf eine erneute Implementierung
// dieser Methoden hier verzichtet

public class Stack<T> extends List<T> implements Stackable<T> {

    /**
     * Default Konstruktor
     */
    public Stack() {
        super();
    }

    /**
     * Konstruktor, ein Element wird angelegt
     *
     * @param a Inhalt des Elements
     */
    public Stack(T a) {
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
     * @throws NullPointerException wenn stack.Stack leer ist
     */
    public T pop() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("pop(): stack.Stack leer");
        }
        return removeFirst();
    }

    /**
     * Liefert Wert des obersten Elements zurueck
     *
     * @return Wert oberstes Element
     * @throws NullPointerException wenn stack.Stack leer ist
     */
    public T top() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("top(): stack.Stack leer");
        }
        return get(0);
    }

    /**
     * Prüft ob stack.Stack leer ist
     *
     * @return true, wenn leer
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Stack wird direkt ausgegeben
     *
     * @return Inhalt des Stacks
     */
    public void printStack() {
        System.out.println(this.toString());
    }

    /**
     * Stack wird als String zurück gegeben
     *
     * @return Inhalt des Stacks als String
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
