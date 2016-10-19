import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * JUnit Testklasse fuer die Klasse Matrix
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.3
 * @date 19.10.16
 */
public class MatrixTest {

    private Matrix ma1;
    private Matrix ma2;

    @Before
    public void setUp() throws Exception {
        ma1 = new Matrix();
        ma2 = new Matrix();
    }

    @Test(expected = IllegalArgumentException.class)
    public void KontruktorMatrixLeerTest() {
        new Matrix(new double[][]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void KonstruktorMatrixFalschTest() {
        new Matrix(new double[][]{
                new double[]{1, 2, 3, 4},
                new double[]{4, 5, 6, 7},
                new double[]{7, 8, 9, 10},
                new double[]{7}}
        );
    }

    // assertTrue(Arrays.deepEquals(ma1.getArray(), ma2.getArray()));
    // assertArrayEquals(ma1.getArray(), ma2.getArray());

    @Test
    public void equalsTest() {
        assertTrue(ma1.equals(ma2));

        Matrix ma10 = new Matrix(new double[][]{new double[]{1, 1, 3}, new double[]{4, 5, 6}, new double[]{7, 8, 9}});
        assertFalse(ma1.equals(ma10));

        Matrix ma11 = new Matrix(new double[][]{new double[]{1, 2, 3}, new double[]{4, 5, 6}, new double[]{7, 8, -8}});
        assertFalse(ma1.equals(ma11));

        Matrix ma12 = new Matrix(new double[][]{new double[]{1, 2}, new double[]{4, 5}, new double[]{7, 8}});
        assertFalse(ma1.equals(ma12));

    }

    @Test
    public void addTest() {
        Matrix ma10 = new Matrix(new double[][]{new double[]{2, 4, 6}, new double[]{8, 10, 12}, new double[]{14, 16, 18}});
        assertArrayEquals(ma10.getArray(), ma1.add(ma2).getArray());

        Matrix ma11 = new Matrix(new double[][]{new double[]{1, 1, 1}, new double[]{4, 5, 6}, new double[]{7, 8, 9}});
        assertFalse(Arrays.deepEquals(ma11.getArray(), ma1.add(ma2).getArray()));

    }

    @Test(expected = IllegalArgumentException.class)
    public void addFalschTest() {
        Matrix ma10 = new Matrix(new double[][]{new double[]{1, 2}, new double[]{3, 4}, new double[]{5, 6}});
        ma1.add(ma10);
    }

}
