package math;

/**
 * Mit IdentifyMatrix können n*n Einheitsmatrizen erstellt werden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.7
 * @date 23.11.16
 */
public class IdentityMatrix extends QuadraticMatrix{

    public IdentityMatrix() {
        super(neueIdentifyMatrix(3));
    }

    public IdentityMatrix(int dim){
        super(neueIdentifyMatrix(dim));
    }

    private static double[][] neueIdentifyMatrix(int dim){
        dim = Math.abs(dim);
        double[][] ergebnis = new double[dim][dim];

        for(int i=0;i<dim;i++){
            ergebnis[i][i] = 1;
        }

        return ergebnis;
    }
}
