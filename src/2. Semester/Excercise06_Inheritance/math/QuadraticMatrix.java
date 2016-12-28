package math;

/**
 * Mit QuadraticMatrix koennen quadratische double Matrizen erstellt werden.
 * Weiterhin kann die Matrix mit sich selber um ein n-faches multipliziert werden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 24.11.16
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
        neueQuadraticMatrix(array);
    }

    /**
     * Erstellt eine neue quadratische Matrix/Array aus vorgegebenen Werten
     *
     * @param array Array Übergabe
     */
    public void neueQuadraticMatrix(double[][] array) {
        // wenn quadratisch, erzeuge Matrix
        if (quadraticCheck(array)) {
            neueMatrix(array);
        } else {
            System.out.println("Keine quadratische Matrix.");
        }
    }

    /**
     * Die Matrix kann um ein n-faches mit sich selber multipliziert werden.
     * 0 erzeugt eine Einheitsmatrix.
     *
     * @param n Matrixpotenz
     * @return multiplizierte Matrix
     */
    public QuadraticMatrix pow(int n) {
        Matrix ergebnis = new Matrix(getArray());

        // wenn n=0, erzeuge Einheitsmatrix
        if (n == 0) {
            ergebnis = new IdentityMatrix(ergebnis.getSpalten());

        } else if (n < 0) {
            System.out.println("Keine negative Potenz möglich.");
        } else {
            // multipliziert n-mal
            // n=1 wird ignoriert, Matrix bleibt unverändert
            for (int i = 1; i < n; i++) {
                ergebnis = ergebnis.multiply(this);
            }
        }
        return new QuadraticMatrix(ergebnis.getArray());
    }

    /**
     * Überprüft ob die Matrix quadratisch ist
     *
     * @param array Array Übergabe
     * @return Quadratisch? True
     */
    private boolean quadraticCheck(double[][] array) {
        if (array.length == 0 || array.length != array[0].length) {
            //System.out.println("Matrix nicht quadratisch");
            return false;
        }
        return true;
    }

    /**
     * Gibt die Matrix als String aus
     *
     * @return Matrix als String
     */
    public String toString() {
        return (super.toString());
    }

}
