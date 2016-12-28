import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit Testklasse fuer die Klasse BitFlags
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/10/16
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
    public void setUp() {
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
     * Test ob switchOn Methode richtig arbeitet, Normalfall #1
     */
    @Test
    public void switchOnTestNormal1() {
        // Zahl 5 = 101, nach Umstellung bei Index 1 111 = 7
        bit5.switchOn(1);
        assertEquals(7, bit5.getStatus());

        // Zahl 7 = 111, nach Umstellung bei Index 3 1111 = 15
        bit5.switchOn(3);
        assertEquals(15, bit5.getStatus());
    }

    /**
     * Test ob switchOn Methode richtig arbeitet, Normalfall #2
     */
    @Test
    public void switchOnTestNormal2(){
        // Zahl 6 = 110, nach Umstellung bei Index 0 111 = 7
        bit6.switchOn(0);
        assertEquals(7, bit6.getStatus());

        // Zahl 7 = 111, nach Umstellung bei Index 3 1111 = 15
        bit6.switchOn(3);
        assertEquals(15, bit6.getStatus());
    }

    /**
     * Test ob switchOn Methode richtig arbeitet, Grenzfall
     */
    @Test
    public void switchOnTestGrenzfall(){
        // Umstellung des ersten Bits: 10....0110
        bit6.switchOn(31);
        assertEquals(-2147483642, bit6.getStatus());
    }

    /**
     * Test ob swtichOn Methode richtig arbeitet
     * falscher Index, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void swtichOnExceptionPositivTest(){
        bit5.switchOff(32);
    }

    /**
     * Test ob swtichOn Methode richtig arbeitet
     * falscher Index, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void swtichOnExceptionNegativTest(){
        bit5.switchOff(-1);
    }

    /**
     * Test ob switchOff Methode richtig arbeitet, Normalfall #1
     */
    @Test
    public void switchOffTest1() {
        // Zahl 5 = 101, nach Umstellung bei Index 0 100 = 4
        bit5.switchOff(0);
        assertEquals(4, bit5.getStatus());

        // Zahl 4 = 100, nach Umstellung bei Index 2 000 = 0
        bit5.switchOff(2);
        assertEquals(0, bit5.getStatus());
    }

    /**
     * Test ob switchOff Methode richtig arbeitet, Normalfall #1
     */
    @Test
    public void switchOffTest2() {
        // Zahl 6 = 110, nach Umstellung bei Index 2 010 = 2
        bit6.switchOff(2);
        assertEquals(2, bit6.getStatus());

        // Zahl 2 = 10, nach Umstellung bei Index 1 00 = 0
        bit6.switchOff(1);
        assertEquals(0, bit6.getStatus());
    }

    /**
     * Test ob swtichOff Methode richtig arbeitet, Grenzfall
     */
    @Test
    public void switchOffTestGrenzfall(){
        // Grenzfall
        // Umstellung des ersten Bits: negative Zahl wird zu einer positiven
        bit6.setStatus(-100);
        bit6.switchOff(31);
        assertEquals(2147483548, bit6.getStatus());
    }

    /**
     * Test ob swtichOff Methode richtig arbeitet
     * falscher Index, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void swtichOffExceptionPositivTest(){
        bit5.switchOff(32);
    }

    /**
     * Test ob swtichOff Methode richtig arbeitet
     * falscher Index, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void swtichOffExceptionNegativTest(){
        bit5.switchOff(-1);
    }

    /**
     * Test ob swap Methode richtig arbeitet, Normalfall #1
     */
    @Test
    public void swapTest1() {
        // Zahl 5 = 101, nach Umstellung bei Index 1 111 = 7
        bit5.swap(1);
        assertEquals(7, bit5.getStatus());
    }

    /**
     * Test ob swap Methode richtig arbeitet, Normalfall #2
     */
    @Test
    public void swapTest2(){
        // Zahl 5 = 101, nach Umstellung bei Index 2 und 3 1001 = 9
        bit5.swap(2);
        bit5.swap(3);
        assertEquals(9, bit5.getStatus());
    }

    /**
     * Test ob swap Methode richtig arbeitet, Grenzfall
     */
    @Test
    public void swapTestGrenzfall(){
        // Umstellung des ersten Bits: positive Zahl 6 wird zu einer negativen
        bit6.swap(31);
        assertEquals(-2147483642, bit6.getStatus());
    }

    /**
     * Test ob swap Methode richtig arbeitet
     * falscher Index, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void swapExceptionPositivTest(){
        bit5.swap(32);
    }

    /**
     * Test ob swap Methode richtig arbeitet
     * falscher Index, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void swapExceptionNegativTest(){
        bit5.swap(-1);
    }

    /**
     * Test ob isSet Methode richtig arbeitet, Normalfall
     */
    @Test
    public void isSetTrueTest() {
        // 5 = 101
        assertTrue(bit5.isSet(0));
        assertTrue(bit5.isSet(2));
    }

    /**
     * Test ob isSet Methode richtig arbeitet, Normalfall
     */
    @Test
    public void isSetFalseTest(){
        assertFalse(bit5.isSet(1));
        assertFalse(bit5.isSet(20));
    }

    /**
     * Test ob isSet Methode richtig arbeitet, Grenzfall pos. Zahl
     */
    @Test
    public void isSetGrenzfallPositivTest(){
        assertFalse(bit5.isSet(31));
    }

    /**
     * Test ob isSet Methode richtig arbeitet, Grenzfall neg. Zahl
     */
    @Test
    public void isSetGrenzfallNegativTest(){
        bit5.setStatus(-100);
        assertTrue(bit5.isSet(31));
    }

    /**
     * Test ob isSet Methode richtig arbeitet
     * falscher Index, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void isSetExceptionPositivTest(){
        bit5.isSet(32);
    }

    /**
     * Test ob swap Methode richtig arbeitet
     * falscher Index, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void isSetExceptionNegativTest(){
        bit5.isSet(-1);
    }

}