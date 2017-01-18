package list;

/**
 * Klasse zum Erstellen generischen Nodes
 *
 * @param <T>
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.17
 */

class Node<T> {
    public T data;
    public Node<T> next;

    /**
     * Konstruktor
     *
     * @param d Node Dateninhalt
     */
    public Node(T d) {
        data = d;
        next = null;
    }
}
