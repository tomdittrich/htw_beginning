package stapel_warteschlange;

/**
 * Interfaces fuer generische Queues mit entsprechenden Methoden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.17
 */

public interface WarteschlangeSchnittelle<T> {

    /**
     * Fuegt ein Elemet ans Ende der Warteschlange an
     *
     * @param wert der eingefuegte Wert
     */
    public abstract void enqueue(T wert);

    /**
     * Entnimmt erstes Element aus Warteschlange und liefert dessen Wert zurück
     *
     * @return Wert des Elements
     */
    public abstract T dequeue() throws NullPointerException;

    /**
     * Liefert den ersten Wert der Warteschlange zurueck
     *
     * @return Wert des ersten Elements
     */
    public abstract T first() throws NullPointerException;

    /**
     * Prüft ob Warteschlange leer ist
     *
     * @return true, wenn leer
     */
    public abstract boolean isEmpty();

    /**
     * liefert die String-Repruesentation der Warteschlange zurueck
     */
    public abstract String toString();
}
