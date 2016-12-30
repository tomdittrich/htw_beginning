package excercise02.interfaces;

/**
 * Interfaces fuer Stacks mit entsprechenden Methoden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30.12.16
 */

public interface StapelSchnittstelle {

    /**
     * Legt ein Element auf den Stack
     *
     * @param wert der abzulegende Wert
     */
    public abstract void push(int wert);

    /**
     * Nimmt oberstes Element herunter und liefer es zurueck
     *
     * @return Wert des Elements
     */
    public abstract int pop() throws NullPointerException;

    /**
     *
     * Liefert Wert des obersten Elements zurueck
     *
     * @return Wert oberstes Element
     */
    public abstract int top() throws NullPointerException;

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