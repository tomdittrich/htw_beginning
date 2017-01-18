package list;

/**
 * Klasse zum Erstellen und Verwalten von generischen Single-Linked-Lists
 *
 * @param <T> Typ der zu speichernden Daten
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.17
 */

public class List<T> implements Listable<T> {

    private Node<T> begin;
    private int length = 0;

    /**
     * Default Konstruktor
     */
    public List() {
        begin = null;
    }

    /**
     * Konstruktor, ein Element wird angelegt
     *
     * @param a Inhalt des Elements
     */
    public List(T a) {
        begin = new Node<T>(a);
        length++;
    }

    /**
     * Konstruktor, ein Element wird angelegt
     *
     * @param a zu übergebender Node
     */
    public List(Node a) {
        begin = a;
        length++;
    }

    /**
     * berechnet die Laenge der List
     *
     * @return Laenge der List
     */
    public int size() {
        return length;
    }

    /**
     * prueft, ob ein gegebener Wert in der List vorhanden ist
     *
     * @param wert gesuchter Wert
     * @return true, wenn gesuchter Wert in der List vorhanden
     */
    public boolean contains(T wert) {
        Node contains = begin;

        while (contains != null) {

            if (contains.data == wert) {
                return true;
            }
            contains = contains.next;
        }

        return false;
    }

    /**
     * gibt den Wert eines Elementes am gegebenen Index zurueck (Lesen)
     *
     * @param index gefragter Index
     * @return Wert des Elements am gefragten Index
     * @throws NullPointerException wenn Index in der List nicht vorhanden ist
     */
    public T get(int index) throws NullPointerException {
        if (index < 0 || length <= index) {
            throw new NullPointerException("get(): Index out of bounds: " + index);
        }

        Node<T> temp = begin;

        for (int i = 0; temp != null; i++) {

            if (index == i) {
                return temp.data;
            }

            temp = temp.next;
        }

        throw new NullPointerException("get(): Index out of bounds: " + index);
    }

    /**
     * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben)
     * und gibt den alten ueberschriebenen Wert des Elements zurueck
     *
     * @param wert  neuer Wert
     * @param index Index, an dem der Wert ueberschrieben werden soll
     * @return alter ueberschriebener Wert
     * @throws NullPointerException wenn Index in der List nicht vorhanden ist
     */
    public T set(T wert, int index) throws NullPointerException {
        if (index < 0 || length <= index) {
            throw new NullPointerException("set(): Index out of bounds: " + index);
        }

        Node<T> temp = begin;

        for (int i = 0; temp != null; i++) {

            if (index == i) {
                T oldData = temp.data;
                temp.data = wert;
                return oldData;
            }
            temp = temp.next;
        }
        throw new NullPointerException("set(): Index out of bounds: " + index);
    }

    /**
     * fuegt einen Wert an den Anfang der List ein
     *
     * @param wert der einzufuegende Wert
     */
    public void addFirst(T wert) {
        Node<T> newNode = new Node<T>(wert);
        newNode.next = begin;
        begin = newNode;
        length++;
    }

    /**
     * fuegt einen Wert ans Ende der List ein
     *
     * @param wert der einzufuegende Wert
     */
    public void addLast(T wert) {
        Node<T> newNode = new Node<T>(wert);

        if (begin == null) {
            begin = newNode;
        } else {
            Node<T> temp = begin;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    /**
     * fuegt einen Wert am gegebenen Index in die List ein
     *
     * @param wert  der einzufuegende Wert
     * @param index Index, an dem das neue Element eingefuegt werden soll
     * @return true, wenn das Element am gegebenen Index erfolgreich eingefuegt wurde
     */
    public boolean addAtIndex(T wert, int index) {
        if (index < 0 || length < index) {
            // hätte auch Exception nehmen können, laut Aufgabe habe ich mich an die booleans gehalten
            System.out.println("Index out of range.");
            return false;
        }

        // wenn Index = 0, wird es direkt vorn angefügt
        if (index == 0) {
            addFirst(wert);
            return true;

        } else if (index == length) { // wenn Index hinter dem aktuell letzten Glied, wird es hinten angefügt
            addLast(wert);
            return true;

        } else {
            Node temp = begin;

            for (int i = 0; temp != null; i++) {

                if (i == index - 1) {
                    Node newNode = new Node<T>(wert);
                    newNode.next = temp.next;
                    temp.next = newNode;

                    length++;
                    return true;
                }
                temp = temp.next;
            }
        }
        // hätte auch Exception nehmen können, laut Aufgabe habe ich mich an die booleans gehalten
        System.out.println("Index out of range.");
        return false;
    }

    /**
     * entfernt alle Elemente mit gegebenem Wert aus der Liste
     *
     * @param wert zu entfernende Wert
     * @return true, wenn Element mit gegebenem Wert gefunden und aus der List entfernt wurde
     */
    public boolean remove(T wert) {
        boolean ergebnis = false;

        // wenn erstes Element Wert enthaelt, fuehre removeFirst Methode aus
        // temp != null noetig, da er sonst bei Listen die nur aus
        // Elementen mit diesem einen Wert bestehen in eine Exception laeuft
        while (begin != null && begin.data == wert) {
            removeFirst();
            ergebnis = true;
            // muss jetzt noch weiter laufen, falls Wert noch in einem anderen Element gefunden wird
        }

        Node<T> temp = begin;
        Node<T> temp2;

        // temp != null noetig, da er sonst bei Listen die nur aus
        // Elementen mit diesem einen Wert bestehen in eine Exception laeuft
        while (temp != null && temp.next != null) {
            temp2 = temp.next;

            if (temp2.data == wert) {
                if (temp2.next != null) {
                    temp.next = temp2.next;
                    temp2 = temp.next;
                    ergebnis = true;
                    length--;
                    continue;
                } else {
                    // wenn Wert im letzten Glied gefunden wird, muss der Next vom Vorgänger auf 0 zeigen
                    temp.next = null;
                    length--;
                    return true;
                }
            }
            temp = temp.next;

        }
        return ergebnis;
    }

    /**
     * entfernt das erste Element aus der List
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn List leer
     */
    public T removeFirst() throws NullPointerException {
        if (begin == null) {
            throw new NullPointerException("removeFirst(): List empty.");
        } else {
            T ergebnis = begin.data;
            begin = begin.next;
            length--;
            return ergebnis;
        }
    }

    /**
     * entfernt das letzte Element aus der List
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn List leer
     */
    public T removeLast() throws NullPointerException {
        T ergebnis;

        // wenn List leer
        if (begin == null) {
            throw new NullPointerException("removeLast(): List empty.");

        } else if (begin.next == null) { // wenn nur ein Node vorhanden
            ergebnis = begin.data;
            begin = begin.next;
            length--;
            return ergebnis;

        } else { // wenn mehrere Nodes vorhanden
            Node<T> temp = begin;
            Node<T> temp2 = temp.next;

            while (temp2.next != null) {
                temp = temp2;
                temp2 = temp2.next;
            }
            ergebnis = temp2.data;
            temp.next = null; // Alternative: temp2 = null
            length--;
            return ergebnis;
        }
    }

    /**
     * entfernt das Element am gegebenen Index aus der List
     *
     * @param index Index, an dem das Element entfernt werden soll
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Index in der List nicht vorhanden
     */
    public T removeAtIndex(int index) throws NullPointerException {

        // wenn List leer
        if (begin == null) {
            throw new NullPointerException("removeAtIndex(): List empty.");
        }

        if (index < 0 || length <= index) {
            throw new NullPointerException("removeAtIndex(): Index out of bounds: " + index);
        }

        // wenn Index = 0, wird es direkt entfernt
        if (index == 0) {
            return removeFirst();

        } else if (index == length - 1) { // wenn Index ganz hinten, wird es direkt entfernt
            return removeLast();

        } else { // ansonsten suche Index
            Node<T> temp = begin;

            for (int i = 0; temp != null; i++) {

                if (i == index - 1) {
                    Node<T> temp2 = temp.next;
                    T ergebnis = temp2.data;
                    temp.next = temp2.next;
                    temp2.next = null; // eigentlich obsoloet, aber sicher ist sicher
                    length--;
                    return ergebnis;
                }
                temp = temp.next;
            }
        }
        throw new NullPointerException("removeAtIndex(): Index out of bounds: " + index);
    }

    /**
     * Entfernt die komplette Liste
     */
    public void clearAll(){
        begin = null;
        length = 0;
    }

    /**
     * List wird ausgegeben
     *
     * @return Inhalt der List
     */
    public String toString() {

        if (length != 0) {
            String ergebnis = "[ ";
            Node temp = begin;

            while (temp != null) {
                ergebnis += temp.data + " ";
                temp = temp.next;
            }

            ergebnis += "]";
            return ergebnis;

        }
        return "[ List leer ]";
    }
}
