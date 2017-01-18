package list;

/**
 * Interfaces fuer generische Listen mit entsprechenden Methoden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.16
 * @param <T> Typ der zu speichernden Daten
 */

public interface Listable<T> {

    /**
     * berechnet die Laenge der List
     *
     * @return Laenge der List
     */
    public abstract int size();


    /**
     * prueft, ob ein gegebener Wert in der List vorhanden ist
     *
     * @param wert gesuchter Wert
     * @return true, wenn gesuchter Wert in der List vorhanden
     */
    public abstract boolean contains(T wert);


    /**
     * gibt den Wert eines Elementes am gegebenen Index zurueck (Lesen)
     *
     * @param index gefragter Index
     * @return Wert des Elements am gefragten Index
     * @throws NullPointerException wenn Index in der List nicht vorhanden ist
     */
    public abstract T get(int index) throws NullPointerException;


    /**
     * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben)
     * und gibt den alten ueberschriebenen Wert des Elements zurueck
     *
     * @param index Index, an dem der Wert ueberschrieben werden soll
     * @param wert  neuer Wert
     * @return alter ueberschriebener Wert
     * @throws NullPointerException wenn Index in der List nicht vorhanden ist
     */
    public abstract T set(T wert, int index) throws NullPointerException;


    /**
     * fuegt einen Wert an den Anfang der List ein
     *
     * @param wert der einzufuegende Wert
     */
    public abstract void addFirst(T wert);


    /**
     * fuegt einen Wert ans Ende der List ein
     *
     * @param wert der einzufuegende Wert
     */
    public abstract void addLast(T wert);


    /**
     * fuegt einen Wert am gegebenen Index in die List ein
     *
     * @param wert  der einzufuegende Wert
     * @param index Index, an dem das neue Element eingefuegt werden soll
     * @return true, wenn das Element am gegebenen Index erfolgreich eingefuegt wurde
     */
    public abstract boolean addAtIndex(T wert, int index);


    /**
     * entfernt ein Element mit gegebenem Wert aus der List
     *
     * @param wert zu entfernende Wert
     * @return true, wenn Element mit gegebenem Wert gefunden und aus der List entfernt wurde
     */
    public abstract boolean remove(T wert);


    /**
     * entfernt das erste Element aus der List
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn List leer
     */
    public abstract T removeFirst() throws NullPointerException;


    /**
     * entfernt das letzte Element aus der List
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn List leer
     */
    public abstract T removeLast() throws NullPointerException;

    /**
     * Entfernt die komplette Liste
     */
    public abstract void clearAll();

    /**
     * entfernt das Element am gegebenen Index aus der List
     *
     * @param index Index, an dem das Element entfernt werden soll
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Index in der List nicht vorhanden
     */
    public abstract T removeAtIndex(int index) throws NullPointerException;


    /**
     * liefert die String-Repruesentation der List zurueck
     */
    public abstract String toString();
}
