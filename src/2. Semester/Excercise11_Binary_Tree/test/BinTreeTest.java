package test;

import tree.BinNode;
import tree.BinTree;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit Testklasse fuer die Klasse BinTree
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 8.1.17
 */
public class BinTreeTest {

    private BinTree baum;
    private BinTree kleinerBaum;
    private BinTree leererBaum;

    /**
     * Erzeugung von den drei Baumarten, laut Aufgabe
     * Null-Baum, kleiner Baum bestehend nur aus Knoten, sortierter Baum
     */
    // Ich haette die Baeume auch im jeweiligen Test erzeugen koennen,
    // fuer die Uebersichtlichkeit habe ich sie hier ins setUp gesetzt.
    // Bei einem groesseren Test bietet sich das aus Performance Gruenden NICHT an.
    @Before
    public void setUp() {

        // null-Baum
        leererBaum = new BinTree();

        // Baum mit nur einem Blatt(=Wurzel)
        BinNode einzigKnoten = new BinNode(5);
        kleinerBaum = new BinTree(einzigKnoten);

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
        baum = new BinTree(wurzel);
    }

    // isNotEmpty Tests
    /**
     * isNotEmpty Test, sortierter Baum, 4 Blaetter, 4 Knoten
     */
    @Test
    public void isNotEmptyTestGanzerBaum() {
        assertTrue(baum.isNotEmpty());
    }

    /**
     * isNotEmpty Test, kleiner Baum, nur Wurzel
     */
    @Test
    public void isNotEmptyTestKleinerBaum() {
        assertTrue(kleinerBaum.isNotEmpty());
    }

    /**
     * isNotEmpty Test, leerer Baum
     */
    @Test
    public void isNotEmptyTestLeererBaum() {
        assertFalse(leererBaum.isNotEmpty());
    }

    // countLeaves Tests
    /**
     * countLeaves Test, sortierter Baum, 4 Blaetter, 4 Knoten
     */
    @Test
    public void countLeavesTestGanzerBaum() {
        assertEquals(4, baum.countLeaves(), 0);
    }

    /**
     * countLeaves Test, kleiner Baum, nur Wurzel
     */
    @Test
    public void countLeavesTestKleinerBaum() {
        assertEquals(1, kleinerBaum.countLeaves(), 0);
    }

    /**
     * countLeaves Test, leerer Baum
     */
    @Test
    public void countLeavesTestLeererBaum() {
        assertEquals(0, leererBaum.countLeaves(), 0);
    }

    // isSorted Tests
    /**
     * isSorted Test, sortierter Baum, 4 Blaetter, 4 Knoten
     */
    @Test
    public void isSortedTestGanzerBaum() {
        assertTrue(baum.isSorted());
    }

    /**
     * isSorted Test, kleiner Baum, nur Wurzel
     */
    @Test
    public void isSortedTestKleinerBaum() {
        assertTrue(kleinerBaum.isSorted());
    }

    /**
     * isSorted Test, leerer Baum
     */
    @Test
    public void isSortedTestLeererBaum() {
        assertFalse(leererBaum.isSorted());
    }

}