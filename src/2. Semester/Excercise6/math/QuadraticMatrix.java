package math;

/**
 * Description
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.3
 * @date 11/21/16
 */
public class QuadraticMatrix extends Matrix {

    /**
     * Default Konstruktor
     * Erzeugt 3*3 Matrix, gefüllt mit:
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    public QuadraticMatrix() {
        super(new double[][]{new double[]{1, 2, 3}, new double[]{4, 5, 6}, new double[]{7, 8, 9}});
    }

    /**
     * Konstruktor
     * Erzeugt ein n*n dimensionales Array, welches übergeben werden muss
     *
     * @param array Array Übergabe
     */
    public QuadraticMatrix(double[][] array) {
        super(array);

        if (!quadraticCheck(array)) {
            throw new IllegalArgumentException("Matrix nicht quadratisch.");
        }
    }

    public Matrix QuadraticMatrix(int n) {
        Matrix ergebnis = new Matrix(getArray());

        if (n == 0) {
            System.out.println("Einheit");
            return ergebnis;
        } else {
            for (int i = 1; i < n; i++) {
                ergebnis = ergebnis.multiply(this);
            }
            return ergebnis;
        }
    }

    private boolean quadraticCheck(double[][] array) {
        if (array.length == 0 || array.length != array[0].length) {
            //System.out.println("Matrix nicht quadratisch");
            return false;
        }
        return true;
    }

    public String toString(){
        return ("Die quadratische Matrix lautet:\n"+super.toString());
    }
}
