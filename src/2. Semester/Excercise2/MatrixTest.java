import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 * JUnit Testklasse fuer die Klasse Matrix
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 23.10.16
 */
public class MatrixTest {

    private Matrix ma1;
    private Matrix ma2;

    /**
     * Erzeugung von zwei Standard 3*3 Matrizen über Default Konstruktor
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        ma1 = new Matrix();
        ma2 = new Matrix();
    }

    /**
     * Konstruktor Test, leeres Array, soll Exception werfen
     */
    @Test(expected = IllegalArgumentException.class)
    public void KontruktorMatrixLeerTest() {
        new Matrix(new double[][]{});
    }

    /**
     * Konstruktor Test, ungültiges Array (4. Zeile zu kurz), soll Exception werfen
     * Fehlerfall
     */
    @Test(expected = IllegalArgumentException.class)
    public void KonstruktorMatrixFalschTest() {
        new Matrix(new double[][]{
                new double[]{1, 2, 3, 4},
                new double[]{4, 5, 6, 7},
                new double[]{7, 8, 9, 10},
                new double[]{7}}
        );
    }

    /**
     * Test ob die Vergleichs Methode richtig arbeitet
     * Normalfall
     */
    @Test
    public void equalsTest() {
        // 3*3 Vergleich, gleicher Inhalt, True Prüfung
        assertTrue(ma1.equals(ma2));

        // 1.Zeile 1.Spalte ist eine andere Zahl, False Prüfung
        Matrix ma10 = new Matrix(new double[][]{
                new double[]{2, 2, 3},
                new double[]{4, 5, 6},
                new double[]{7, 8, 9}});
        assertFalse(ma1.equals(ma10));

        // 3.Zeile 3.Spalte ist eine andere Zahl, False Prüfung
        Matrix ma11 = new Matrix(new double[][]{
                new double[]{1, 2, 3},
                new double[]{4, 5, 6},
                new double[]{7, 8, -8}});
        assertFalse(ma1.equals(ma11));

        // 3*3 mit 2*2 Vergleich, False Prüfung
        Matrix ma12 = new Matrix(new double[][]{
                new double[]{1, 2},
                new double[]{4, 5},
                new double[]{7, 8}});
        assertFalse(ma1.equals(ma12));

        // 3*3 mit 4*4 Vergleich, False Prüfung
        Matrix ma13 = new Matrix(new double[][]{
                new double[]{1, 2, 3, 4},
                new double[]{4, 5, 6, 7},
                new double[]{7, 8, 9, -10}});
        assertFalse(ma1.equals(ma13));

    }

    /**
     * Test ob die Additions Methode richtig arbeitet
     * Normalfall
     */
    @Test
    public void addTest() {
        // zwei Default 3*3 Matrizen werden addiert, ma10 ist die erwartete Matrix, Equal Prüfung
        Matrix ma10 = new Matrix(new double[][]{
                new double[]{2, 4, 6},
                new double[]{8, 10, 12},
                new double[]{14, 16, 18}});
        assertArrayEquals(ma10.getArray(), ma1.add(ma2).getArray());

        // zwei Default 3*3 Matrizen werden addiert, ma11 ist die (falsche) erwartete Matrix, False Prüfung
        Matrix ma11 = new Matrix(new double[][]{
                new double[]{1, 1, 1},
                new double[]{4, 5, 6},
                new double[]{7, 8, 9}});
        assertFalse(Arrays.deepEquals(ma11.getArray(), ma1.add(ma2).getArray()));
    }

    /**
     * Test ob die Additions Methode richtig arbeitet, mit Grenzwerten von double
     * Grenzfall
     */
    @Test
    public void addTestGrenzfallTest(){
        // zwei Matrizen mit den maximal und minimal Werten werden gegeneinander addiert
        // ma12 ist die erwartete Null-Matrix, Equal Prüfung
        Matrix ma10 = new Matrix(new double[][]{
                new double[]{Double.MIN_VALUE, Double.MAX_VALUE},
                new double[]{-Double.MIN_VALUE, -Double.MAX_VALUE}});
        Matrix ma11 = new Matrix(new double[][]{
                new double[]{-Double.MIN_VALUE, -Double.MAX_VALUE},
                new double[]{Double.MIN_VALUE, Double.MAX_VALUE}});
        Matrix ma12 = new Matrix(new double[][]{
                new double[]{0, 0},
                new double[]{0, 0}});
        assertArrayEquals(ma12.getArray(), ma10.add(ma11).getArray());
    }
    /**
     * Test ob die Additions Methode richtig arbeitet
     * nicht mögliche Addition von verschiedenen Dimensionen, soll Exception werfen
     * Fehlerfall
     */
    @Test(expected = IllegalArgumentException.class)
    public void addFalschTest() {
        //3*3 Matrix wird mit 2*2 addiert, nicht möglich
        Matrix ma10 = new Matrix(new double[][]{
                new double[]{1, 2},
                new double[]{3, 4},
                new double[]{5, 6}});
        ma1.add(ma10);
    }

    /**
     * Test ob die Multiplikation mit einem Skalar richtig arbeitet
     * Normalfall
     */
    @Test
    public void multiplyScalarTest(){
        // Default Matrix wird mit 2 multipliziert, ma10 ist die erwartete Matrix, Equal Prüfung
        Matrix ma10 = new Matrix(new double[][]{
                new double[]{2, 4, 6},
                new double[]{8, 10, 12},
                new double[]{14, 16, 18}});
        assertArrayEquals(ma10.getArray(), ma1.multiplyScalar(2).getArray());

        // Default Matrix wird mit -1 multipliziert, ma11 ist die (falsche) erwartete Matrix, False Prüfung
        Matrix ma11 = new Matrix(new double[][]{
                new double[]{-1, -2, -3},
                new double[]{-4, -5, -6},
                new double[]{-7, -8, 9}});
        assertFalse(Arrays.deepEquals(ma11.getArray(), ma1.multiplyScalar(-1).getArray()));

        // Default Matrix wird mit 10.5 multipliziert, ma12 ist die erwartete Matrix, True Prüfung
        Matrix ma12 = new Matrix(new double[][]{
                new double[]{10.5, 21, 31.5},
                new double[]{42, 52.5, 63},
                new double[]{73.5, 84.0, 94.5}});
        assertTrue(Arrays.deepEquals(ma12.getArray(), ma1.multiplyScalar(10.5).getArray()));
    }

    /**
     * Test ob die Multiplikations Methode mit zwei Matrizen arbeitet
     * Normalfall
     */
    @Test
    public void multiplyTest(){
        // zwei Default 3*3 Matrizen werden multipliziert, ma10 ist die erwartete Matrix, Equal Prüfung
        Matrix ma10 = new Matrix(new double[][]{
                new double[]{30, 36, 42},
                new double[]{66, 81, 96},
                new double[]{102, 126, 150}});
        assertArrayEquals(ma10.getArray(), ma1.multiply(ma2).getArray());

        // zwei Default 3*3 Matrizen werden multipliziert, ma11 ist die (falsche) erwartete Matrix, False Prüfung
        Matrix ma11 = new Matrix(new double[][]{
                new double[]{30, 36, 42},
                new double[]{66, 81, 96},
                new double[]{-102, -126, -150}});
        assertFalse(Arrays.deepEquals(ma11.getArray(), ma1.multiply(ma2).getArray()));

        // 4x2 Matrix ma12 wird mit 2x3 Matrix ma13 multipliziert, ma14 ist die erwartete 4x3 Natruxm Equal Prüfung
        Matrix ma12 = new Matrix(new double[][]{
                new double[]{1.5, 2.5},
                new double[]{3, 4},
                new double[]{5, 6},
                new double[]{7,8}});
        Matrix ma13 = new Matrix(new double[][]{
                new double[]{1.5, 2.5, 3},
                new double[]{4, 5, 6}});
        Matrix ma14 = new Matrix(new double[][]{
                new double[]{12.25, 16.25, 19.5},
                new double[]{20.5, 27.5, 33},
                new double[]{31.5, 42.5, 51},
                new double[]{42.5, 57.5, 69}});
        assertArrayEquals(ma14.getArray(), ma12.multiply(ma13).getArray());
    }

    /**
     * Test ob die Multiplikations Methode richtig arbeitet
     * nicht mögliche Multiplikationen von verschiedenen Dimensionen, soll Exception werfen
     * Fehlerfall
     */
    @Test(expected = IllegalArgumentException.class)
    public void multiplyFalschTest(){
        //Default 3*3 Matrix wird mit einer 2*3 multipliziert, nicht möglich
        Matrix ma13 = new Matrix(new double[][]{
                new double[]{1.5, 2.5, 3},
                new double[]{4, 5, 6}});
        ma1.multiply(ma13);

    }

}
