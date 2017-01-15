package binärBäume;

/**
 * Reine Testklasse fuer die Baum-Klassen-Methoden
 * depthFirst und breadthFirst
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 15.01.17
 */

public class BinTreeTest {
    public static void main(String[] args) {

        // null-Baum
        BinTree leererBaum = new BinTree();

        System.out.println("Tiefensuche leerer Baum: " + leererBaum.depthFirst());
        System.out.println("Breitensuche leerer Baum: " + leererBaum.breadthFirst());

        // Baum mit nur einem Blatt(=Wurzel)
        BinNode einzigKnoten = new BinNode(5);
        BinTree kleinerBaum = new BinTree(einzigKnoten);

        System.out.println("\nTiefensuche kleiner Baum: " + kleinerBaum.depthFirst());
        System.out.println("Breitensuche kleiner Baum: " + kleinerBaum.breadthFirst());

        // 4 Blaetter
        BinNode blatt1 = new BinNode(7);
        BinNode blatt2 = new BinNode(8);
        BinNode knoten1 = new BinNode(4, blatt1, blatt2);

        BinNode blatt3 = new BinNode(5);
        BinNode knoten2 = new BinNode(2, knoten1, blatt3);

        BinNode blatt4 = new BinNode(6);
        BinNode blatt5 = null;
        BinNode knoten3 = new BinNode(3, blatt4, blatt5);

        BinNode wurzel = new BinNode(1, knoten2, knoten3);
        BinTree baum = new BinTree(wurzel);

        System.out.println("\nTiefensuche Baum: " + baum.depthFirst());
        System.out.println("Breitensuche Baum: " + baum.breadthFirst());
    }

}
