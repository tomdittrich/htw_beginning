package stack;

/**
 * Interfaces fuer generische Stacks mit entsprechenden Methoden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.17
 *
 * @param <T> Typ der zu speichernden Daten
 */

public interface Stackable<T> {

    /**
     * Legt ein Element auf den stack.Stack
     *
     * @param wert der abzulegende Wert
     */
    public abstract void push(T wert);

    /**
     * Nimmt oberstes Element herunter und liefer es zurueck
     *
     * @return Wert des Elements
     */
    public abstract T pop() throws NullPointerException;

    /**
     * Liefert Wert des obersten Elements zurueck
     *
     * @return Wert oberstes Element
     */
    public abstract T top() throws NullPointerException;

    /**
     * Prüft ob Stack leer ist
     *
     * @return true, wenn leer
     */
    public abstract boolean isEmpty();

    /**
     * Stack wird ausgegeben
     *
     * @return Inhalt des Stack
     */
    public abstract void printStack();

    /**
     * Stack wird ausgegeben
     *
     * @return Inhalt des Stacks
     */
    public abstract String toString();
}