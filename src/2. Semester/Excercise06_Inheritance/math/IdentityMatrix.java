package math;

/**
 * Mit IdentifyMatrix können n*n Einheitsmatrizen erstellt werden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 24.11.16
 */
public class IdentityMatrix extends QuadraticMatrix {

    /**
     * Default Konstruktor
     * Erzeugt eine 3x3 Einheitsmatrix
     */
    public IdentityMatrix() {
        super(neueIdentifyMatrix(3));
    }

    /**
     * Konstruktor
     * Erzeugt eine Matrix mit n*n Dimension
     *
     * @param dim Dimensionsgröße
     */
    public IdentityMatrix(int dim) {
        super(neueIdentifyMatrix(dim));
    }

    /**
     * Erzeugt eine Matrix mit n*n Dimension
     *
     * @param dim Dimensionsgröße
     * @return Einheitsmatrix
     */
    private static double[][] neueIdentifyMatrix(int dim) {
        // Dimension negativ, dann Betrag
        dim = Math.abs(dim);
        double[][] ergebnis = new double[dim][dim];

        // wenn Dimension 0, erzeuge alternativ 3x3 Einheitsmatrix
        if (dim == 0) {
            ergebnis = neueIdentifyMatrix(3);
        } else {
            for (int i = 0; i < dim; i++) {
                ergebnis[i][i] = 1;
            }
        }

        return ergebnis;
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
