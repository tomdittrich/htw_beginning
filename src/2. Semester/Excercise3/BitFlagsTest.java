import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit Testklasse fuer die Klasse BitFlags
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 10/27/16
 */
public class BitFlagsTest {

    private BitFlags bit5;
    private BitFlags bit6;

    /**
     * Initialisierung von zwei BitFlag Objekten
     * einmal mit Status 5 und 6
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        bit5 = new BitFlags(5);
        bit6 = new BitFlags(6);
    }

    /**
     * Test ob Setter & Getter richtig arbeiten
     */
    @Test
    public void setGetStatusTest() {
        bit5.setStatus(50);
        assertEquals(50, bit5.getStatus());
    }

    /**
     * Test ob switchOn Methode richtig arbeitet
     */
    @Test
    public void switchOnTest() {
        // Zahl 5 = 101, nach Umstellung bei Index 1 111 = 7
        bit5.switchOn(1);
        assertEquals(7, bit5.getStatus());

        // Zahl 7 = 111, nach Umstellung bei Index 3 1111 = 15
        bit5.switchOn(3);
        assertEquals(15, bit5.getStatus());

        // Zahl 6 = 110, nach Umstellung bei Index 0 111 = 7
        bit6.switchOn(0);
        assertEquals(7, bit6.getStatus());

        // Zahl 7 = 111, nach Umstellung bei Index 3 1111 = 15
        bit6.switchOn(3);
        assertEquals(15, bit6.getStatus());

        // Grenzfall
        // Umstellung des ersten Bits: 10....1111
        bit6.switchOn(31);
        assertEquals(-2147483633, bit6.getStatus());
    }

    /**
     * Test ob switchOff Methode richtig arbeitet
     */
    @Test
    public void switchOffTest() {
        // Zahl 5 = 101, nach Umstellung bei Index 0 100 = 4
        bit5.switchOff(0);
        assertEquals(4, bit5.getStatus());

        // Zahl 4 = 100, nach Umstellung bei Index 2 000 = 0
        bit5.switchOff(2);
        assertEquals(0, bit5.getStatus());

        // Zahl 6 = 110, nach Umstellung bei Index 2 010 = 2
        bit6.switchOff(2);
        assertEquals(2, bit6.getStatus());

        // Zahl 2 = 10, nach Umstellung bei Index 1 00 = 0
        bit6.switchOff(1);
        assertEquals(0, bit6.getStatus());

        // Grenzfall
        // Umstellung des ersten Bits: negative Zahl wird zu einer positiven
        bit6.setStatus(-100);
        bit6.switchOff(31);
        assertEquals(2147483548, bit6.getStatus());

    }

    /**
     * Test ob swap Methode richtig arbeitet
     */
    @Test
    public void swapTest() {
        // Zahl 5 = 101, nach Umstellung bei Index 1 111 = 7
        bit5.swap(1);
        assertEquals(7, bit5.getStatus());

        // Zahl 7 = 111, nach Umstellung bei Index 2 und 3 1011 = 11
        bit5.swap(2);
        bit5.swap(3);
        assertEquals(11, bit5.getStatus());

        // Grenzfall
        // Umstellung des ersten Bits: positive Zahl 6 wird zu einer negativen
        bit6.swap(31);
        assertEquals(-2147483642, bit6.getStatus());
    }

    /**
     * Test ob isSet Methode richtig arbeitet
     */
    @Test
    public void isSetTest() {
        // 5 = 101
        assertTrue(bit5.isSet(0));
        assertTrue(bit5.isSet(2));
        assertFalse(bit5.isSet(1));

        // Grenzfall mit einer positiven Zahl
        assertFalse(bit5.isSet(31));

        // Grenzfall mit einer negativen Zahl
        bit5.setStatus(-100);
        assertTrue(bit5.isSet(31));
    }

}