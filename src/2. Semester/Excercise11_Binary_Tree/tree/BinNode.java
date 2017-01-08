package tree;

/**
 * Klasse um Baumknoten zu erstellen
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 8.1.17
 */
public class BinNode {

    int data;
    BinNode left, right;

    /**
     * Default Konstruktor, erzeugt Knoten nur mit Dateninhalt 0
     */
    public BinNode(){
        data = 0;
    }

    /**
     * Konstruktor, erzeugt Knoten nur mit Dateninhalt
     *
     * @param d Dateninhalt
     */
    public BinNode(int d) {
        data = d;
        left = right = null;
    }

    /**
     * Konstruktor, erzeugt Knoten mit Dateninhalt und linken&rechten Knoten
     *
     * @param d Dateninhalt
     * @param l linker Knoten
     * @param r rechter Knoten
     */
    public BinNode(int d, BinNode l, BinNode r) {
        data = d;
        left = l;
        right = r;
    }
}
