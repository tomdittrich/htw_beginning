package excercise02;

import excercise01.Liste;
import excercise02.interfaces.StapelSchnittstelle;

/**
 * Klasse zum Erstellen und Verwalten von Stacks
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.3
 * @date 29.12.16
 */

public class Stapel extends Liste implements StapelSchnittstelle {
    /**
     * Legt ein Element auf den Stack
     *
     * @param wert der abzulegende Wert
     */
    @Override
    public void push(int wert) {

    }

    /**
     * Nimmt oberstes Element herunter und liefer es zurueck
     *
     * @return Wert des Elements
     */
    @Override
    public int pop() {
        return 0;
    }

    /**
     * Liefert Wert des obersten Elements zurueck
     *
     * @return Wert oberstes Element
     */
    @Override
    public int top() {
        return 0;
    }

    /**
     * Prüft ob Stack leer ist
     *
     * @return true, wenn leer
     */
    @Override
    public boolean isEmpty() {
        return false;
    }
}
