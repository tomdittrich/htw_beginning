package binärBäume;

import stapel_warteschlange.Stapel;
import stapel_warteschlange.Warteschlange;

/**
 * Klasse zu binaeren Bauemen
 * Kann grundlegende Abfragen (ist leer?, ist sortiert?)
 * Grundlage fuer weitere Methoden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 15.01.17
 */
public class BinTree {

    private BinNode root = null;

    /**
     * Default Konstruktor
     */
    public BinTree() {
        root = null;
    }

    /**
     * Konstruktor, ein Node wird zur Wurzel
     *
     * @param rn zu uebergebender Node
     */
    public BinTree(BinNode rn) {
        root = rn;
    }

    /**
     * Überprüft ob Baum nicht-leer ist
     *
     * @return nicht leer? true
     */
    public boolean isNotEmpty() {
        return root != null;
    }

    /**
     * Zaehlt die Blaetter des Baums
     *
     * @return Anzahl der Blaetter
     */
    public int countLeaves() {
        return countLeaves(root);
    }

    /**
     * Zaehlt die Blaetter des zu uebergebenden Baums/Knoten
     *
     * @param a der zu ubergebende Baum/Knoten
     * @return Anzahl der Blaetter
     */
    private int countLeaves(BinNode a) {
        int counter = 0;

        if (a != null) {
            if (a.left == null && a.right == null) {
                counter++;
            } else {
                return countLeaves(a.left) + countLeaves(a.right);
            }
        }

        return counter;
    }

    /**
     * Uberprueft, ob Baum sortiert ist
     *
     * @return sortiert? true
     */
    public boolean isSorted() {
        return isSorted(root);
    }

    /**
     * Ueberprueft, ob der zu uebergebende Baum/Knoten sortiert ist
     *
     * @param node der zu uebergebende Baum/Knoten
     * @return sortiert? true
     */
    private boolean isSorted(BinNode node) {
        // leerer Baum, optional Exception werfen
        // false weil: etwas kann nicht sortiert sein, wenn es nicht existiert
        if (node == null) {
            return false;

            // wenn nur ein Blatt/Wurzel, links und rechts aber leer
        } else if (node.left == null && node.right == null) {
            return true;

            //wenn links leer, rechts muss ueberprueft werden
        } else if (node.left == null && node.right.data > node.data && isSorted(node.right)) {
            return true;

            //wenn rechts leer, links muss ueberprueft werden
        } else if (node.right == null && node.left.data < node.data && isSorted(node.left)) {
            return true;

            // beide Seiten muessen geprueft werden
        } else if (node.left.data < node.data && isSorted(node.left) && node.right.data > node.data && isSorted(node.right)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Baum traversieren, Tiefensuche
     *
     * @return (String) Abgearbeitete Knoten
     */
    public String depthFirst() {
        // wenn Baum leer, springe sofort raus, keine Objekt Erzeugung notwendig
        if (root == null) {
            return "leer";
        }

        String result = "";
        Stapel<BinNode> resultStack = new Stapel<BinNode>();

        resultStack.push(root);

        while (!resultStack.isEmpty()) {

            BinNode current = resultStack.pop();

            if (current != null) {
                result += current.data + " ";
                resultStack.push(current.right);
                resultStack.push(current.left);
            }
        }

        return result;
    }

    /**
     * Baum traversieren, Breitensuche
     *
     * @return (String) Abgearbeitete Knoten
     */
    public String breadthFirst() {
        // wenn Baum leer, springe sofort raus, keine Objekt Erzeugung notwendig
        if (root == null) {
            return "leer";
        }

        String result = "";
        Warteschlange<BinNode> resultQue = new Warteschlange<BinNode>();

        resultQue.enqueue(root);

        while (!resultQue.isEmpty()) {

            BinNode current = resultQue.dequeue();

            if (current != null) {
                result += current.data + " ";
                resultQue.enqueue(current.left);
                resultQue.enqueue(current.right);
            }
        }

        return result;
    }
}

