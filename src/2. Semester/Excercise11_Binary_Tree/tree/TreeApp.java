package tree;

/**
 * Simples Testprogramm
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 8.1.17
 */
public class TreeApp {

    public static void main(String[] args) {

        // null-Baum
        BinTree leererBaum = new BinTree();

        // Baum mit nur einem Blatt(=Wurzel)
        BinNode einzigKnoten = new BinNode(5);
        BinTree kleinerBaum = new BinTree(einzigKnoten);

        // sortierter Baum, 4 Blaetter, laut Aufgabenblatt
        BinNode blatt1 = new BinNode(1);
        BinNode blatt2 = new BinNode(3);
        BinNode knoten1 = new BinNode(2, blatt1, blatt2);

        BinNode blatt3 = new BinNode(5);
        BinNode knoten2 = new BinNode(4, knoten1, blatt3);

        BinNode blatt4 = new BinNode(8);
        BinNode blatt5 = null;
        BinNode knoten3 = new BinNode(9, blatt4, blatt5);

        BinNode wurzel = new BinNode(7, knoten2, knoten3);
        BinTree baum = new BinTree(wurzel);

        System.out.println("Blaetter: " + baum.countLeaves());
        System.out.println("Empty? " + !baum.isNotEmpty());
        System.out.println("Sorted? " + baum.isSorted()+"\n");

        System.out.println("Blaetter: " + kleinerBaum.countLeaves());
        System.out.println("Empty? " + !kleinerBaum.isNotEmpty());
        System.out.println("Sorted? " + kleinerBaum.isSorted()+"\n");

        System.out.println("Blaetter: " + leererBaum.countLeaves());
        System.out.println("Empty? " + !leererBaum.isNotEmpty());
        System.out.println("Sorted? " + leererBaum.isSorted());
    }
}
