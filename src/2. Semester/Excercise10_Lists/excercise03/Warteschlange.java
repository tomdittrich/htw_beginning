package excercise03;

import excercise01.Liste;
import excercise03.interfaces.WarteschlangeSchnittelle;

/**
 * Klasse zum Erstellen und Verwalten von Queues
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.3
 * @date 29.12.16
 */

public class Warteschlange extends Liste implements WarteschlangeSchnittelle {
    /**
     * Fuegt ein Elemet ans Ende der Warteschlange an
     *
     * @param wert der eingefuegte Wert
     */
    @Override
    public void enqueue(int wert) {

    }

    /**
     * Entnimmt erstes Element aus Warteschlange und liefert dessen Wert zurück
     *
     * @return Wert des Elements
     */
    @Override
    public int dequeue() {
        return 0;
    }

    /**
     * Liefert den ersten Wert der Warteschlange zurueck
     *
     * @return Wert des ersten Elements
     */
    @Override
    public int first() {
        return 0;
    }

    /**
     * Prüft ob Warteschlange leer ist
     *
     * @return true, wenn leer
     */
    @Override
    public boolean isEmpty() {
        return false;
    }
}
