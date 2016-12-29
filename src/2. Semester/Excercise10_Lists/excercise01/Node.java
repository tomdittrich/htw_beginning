package excercise01;

/**
 * Klasse zum Erstellen Nodes
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 29.12.16
 */

class Node {
    public int data;
    public Node next;

    /**
     * Konstruktor
     *
     * @param d Node Dateninhalt
     */
    public Node(int d) {
        data = d;
        next = null;
    }
}
