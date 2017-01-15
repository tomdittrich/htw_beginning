package stapel_warteschlange;

/**
 * Interfaces fuer generische Stacks mit entsprechenden Methoden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.17
 */

public interface StapelSchnittstelle<T> {

    /**
     * Legt ein Element auf den Stack
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
     * liefert die String-Repruesentation des Stacks zurueck
     */
    public abstract String toString();
}