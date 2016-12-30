package excercise01;

import excercise01.interfaces.AbstrakteListe;

/**
 * Klasse zum Erstellen und Verwalten von Single-Linked-Lists
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 29.12.16
 */

public class Liste implements AbstrakteListe {

    private Node begin;
    private int length = 0;

    /**
     * berechnet die Laenge der Liste
     *
     * @return Laenge der Liste
     */

    /**
     * Default Konstruktor
     */
    public Liste() {
        begin = null;
    }

    /**
     * Konstruktor, ein Element wird angelegt
     *
     * @param a Inhalt des Elements
     */
    public Liste(int a) {
        begin = new Node(a);
        length++;
    }

    /**
     * Konstruktor, ein Element wird angelegt
     *
     * @param a zu übergebender Node
     */
    public Liste(Node a) {
        begin = a;
        length++;
    }

    /**
     * berechnet die Laenge der Liste
     *
     * @return Laenge der Liste
     */
    @Override
    public int size() {
        return length;
    }

    /**
     * prueft, ob ein gegebener Wert in der Liste vorhanden ist
     *
     * @param wert gesuchter Wert
     * @return true, wenn gesuchter Wert in der Liste vorhanden
     */
    @Override
    public boolean contains(int wert) {
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
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
     */
    @Override
    public int get(int index) throws NullPointerException {
        if (index < 0 || length <= index) {
            throw new NullPointerException("get(): Index out of bounds: "+index);
        }

        Node temp = begin;

        for (int i = 0; temp != null; i++) {

            if (index == i) {
                return temp.data;
            }

            temp = temp.next;
        }

        throw new NullPointerException("get(): Index out of bounds: "+index);
    }

    /**
     * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben)
     * und gibt den alten ueberschriebenen Wert des Elements zurueck
     *
     * @param wert  neuer Wert
     * @param index Index, an dem der Wert ueberschrieben werden soll
     * @return alter ueberschriebener Wert
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
     */
    @Override
    public int set(int wert, int index) throws NullPointerException {
        if (index < 0 || length <= index) {
            throw new NullPointerException("set(): Index out of bounds: "+index);
        }

        Node temp = begin;

        for (int i = 0; temp != null; i++) {

            if (index == i) {
                int oldData = temp.data;
                temp.data = wert;
                return oldData;
            }
            temp = temp.next;
        }
        throw new NullPointerException("set(): Index out of bounds: "+index);
    }

    /**
     * fuegt einen Wert an den Anfang der Liste ein
     *
     * @param wert der einzufuegende Wert
     */
    @Override
    public void addFirst(int wert) {
        Node newNode = new Node(wert);
        newNode.next = begin;
        begin = newNode;
        length++;
    }

    /**
     * fuegt einen Wert ans Ende der Liste ein
     *
     * @param wert der einzufuegende Wert
     */
    @Override
    public void addLast(int wert) {
        Node newNode = new Node(wert);

        if (begin == null) {
            begin = newNode;
        } else {
            Node temp = begin;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    /**
     * fuegt einen Wert am gegebenen Index in die Liste ein
     *
     * @param wert  der einzufuegende Wert
     * @param index Index, an dem das neue Element eingefuegt werden soll
     * @return true, wenn das Element am gegebenen Index erfolgreich eingefuegt wurde
     */
    @Override
    public boolean add(int wert, int index) {
        if (index < 0 || length < index) {
            // hätte auch Exception nehmen können, laut Aufgabe habe ich mich an die booleans gehalten
            System.out.println("Index ausserhalb des Bereichs.");
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
                    Node newNode = new Node(wert);
                    newNode.next = temp.next;
                    temp.next = newNode;

                    length++;
                    return true;
                }
                temp = temp.next;
            }
        }
        // hätte auch Exception nehmen können, laut Aufgabe habe ich mich an die booleans gehalten
        System.out.println("Index ausserhalb des Bereichs.");
        return false;
    }

    /**
     * entfernt alle Elemente mit gegebenem Wert aus der Liste
     *
     * @param wert zu entfernende Wert
     * @return true, wenn Element mit gegebenem Wert gefunden und aus der Liste entfernt wurde
     */
    @Override
    public boolean remove(int wert) {
        boolean ergebnis = false;

        // wenn erstes Element Wert enthaelt, fuehre removeFirst Methode aus
        // temp != null noetig, da er sonst bei Listen die nur aus
        // Elementen mit diesem einen Wert bestehen in eine Exception laeuft
        while (begin != null && begin.data==wert){
            removeFirst();
            ergebnis = true;
            // muss jetzt noch weiter laufen, falls Wert noch in einem anderen Element gefunden wird
        }

        Node temp = begin;
        Node temp2;

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
     * entfernt das erste Element aus der Liste
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Liste leer
     */
    @Override
    public int removeFirst() throws NullPointerException {
        if (begin == null) {
            throw new NullPointerException("removeFirst(): Liste leer.");
        } else {
            int ergebnis = begin.data;
            begin = begin.next;
            length--;
            return ergebnis;
        }
    }

    /**
     * entfernt das letzte Element aus der Liste
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Liste leer
     */
    @Override
    public int removeLast() throws NullPointerException {
        int ergebnis;

        // wenn Liste leer
        if (begin == null) {
            throw new NullPointerException("removeLast(): Liste leer.");

        } else if (begin.next == null) { // wenn nur ein Node vorhanden
            ergebnis = begin.data;
            begin = begin.next;
            length--;
            return ergebnis;

        } else { // wenn mehrere Nodes vorhanden
            Node temp = begin;
            Node temp2 = temp.next;

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
     * entfernt das Element am gegebenen Index aus der Liste
     *
     * @param index Index, an dem das Element entfernt werden soll
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden
     */
    @Override
    public int removeAtIndex(int index) throws NullPointerException {

        // wenn Liste leer
        if (begin == null) {
            throw new NullPointerException("removeAtIndex(): Liste leer.");
        }

        if (index < 0 || length <= index) {
            throw new NullPointerException("removeAtIndex(): Index out of bounds: "+index);
        }

        // wenn Index = 0, wird es direkt entfernt
        if (index == 0) {
            return removeFirst();

        } else if (index == length-1) { // wenn Index ganz hinten, wird es direkt entfernt
            return removeLast();

        } else {
            Node temp = begin;

            for (int i = 0; temp != null; i++) {

                if (i == index - 1) {
                    Node temp2 = temp.next;
                    int ergebnis = temp2.data;
                    temp.next = temp2.next;
                    temp2.next = null; // eigentlich obsoloet, aber sicher ist sicher
                    length--;
                    return ergebnis;
                }
                temp = temp.next;
            }
        }
        throw new NullPointerException("removeAtIndex(): Index out of bounds: "+index);
    }

    /**
     * Liste wird ausgegeben
     *
     * @return Inhalt der Liste
     */
    @Override
    public String toString(){

        if(length!=0){
            String ergebnis = "[ ";
            Node temp = begin;

            while(temp!=null){
                ergebnis+=temp.data+" ";
                temp = temp.next;
            }

            ergebnis += "]";
            return ergebnis;

        }
        return "[ Liste leer ]";
    }
}
