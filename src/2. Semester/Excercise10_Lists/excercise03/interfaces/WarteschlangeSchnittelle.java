package excercise03.interfaces;

/**
 * Interfaces fuer Queues mit entsprechenden Methoden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30.12.16
 */

public interface WarteschlangeSchnittelle {

    /**
     * Fuegt ein Elemet ans Ende der Warteschlange an
     *
     * @param wert der eingefuegte Wert
     */
    public abstract void enqueue(int wert);

    /**
     * Entnimmt erstes Element aus Warteschlange und liefert dessen Wert zurück
     *
     * @return Wert des Elements
     */
    public abstract int dequeue() throws NullPointerException;

    /**
     * Liefert den ersten Wert der Warteschlange zurueck
     *
     * @return Wert des ersten Elements
     */
    public abstract int first() throws NullPointerException;

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
