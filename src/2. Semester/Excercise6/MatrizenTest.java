import math.IdentityMatrix;
import math.QuadraticMatrix;
import math.Vektor;

/**
 * Reine Testklasse für Vektor, QuadraticMatrix, IdentityMatrix
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 24.11.16
 */
public class MatrizenTest {

    public static void main(String[] args) {

        // Vektor
        // Test: Default Konstruktor, toString
        Vektor v1 = new Vektor();
        System.out.print("Vektor, Default Konstruktor:\n" + v1.toString());
        System.out.println("Die Länge des Vektors beträgt: " + v1.length() + "\n");

        // Test: Konstruktor mit Übergabe, toString
        Vektor v2 = new Vektor(new double[]{3, 22.5, -9.3, 300});
        System.out.print("Vektor, Array Konstruktor:\n" + v2.toString());
        System.out.println("Die Länge des Vektors beträgt: " + v2.length() + "\n");

        // ------------------------------------
        // QuadraticMatrix
        // Test: Default Konstruktor, toString
        QuadraticMatrix qm1 = new QuadraticMatrix();
        System.out.println("Qua. Matrix, Default Konstruktor:\n" + qm1.toString());

        // Test: Konstruktor mit Übergabe (4*4), toString, Matrix verändern/neu erstellen
        QuadraticMatrix qm2 = new QuadraticMatrix(new double[][]{
                new double[]{10, 20, 30, 40},
                new double[]{40, 50, 60, 70},
                new double[]{70, 80, 90, -100},
                new double[]{110.7, 120, 130, 140}});

        // neue Matrix
        qm2.neueQuadraticMatrix(new double[][]{
                new double[]{1, 2, 3, 4},
                new double[]{4, 5, 6, 7},
                new double[]{7, 8, 9, -10},
                new double[]{11.5, 12, 13, 14}});
        System.out.println("Qua. Matrix, verändert/neu erstellt:\n" + qm2.toString());

        // Fehlertest: Konstruktor mit nicht qua. Matrix
        QuadraticMatrix qm3 = new QuadraticMatrix(new double[][]{
                new double[]{1, 2, 3, 4},
                new double[]{4, 5, 6, 7},
                new double[]{7, 8, 9, -10}});
        System.out.println();

        // Test: neue multiplizierte Matrix aus Quad. Matrix qm1 mit n=3
        QuadraticMatrix qm4 = qm1.pow(3);
        System.out.println("Qua. Matrix qm1 mit Potenz 3:\n" + qm4.toString());

        // Test: neue multiplizierte Matrix aus Quad. Matrix qm1 mit n=2
        QuadraticMatrix qm5 = qm1.pow(2);
        System.out.println("Qua. Matrix qm1 mit Potenz 2:\n" + qm5.toString());

        // Test: neue multiplizierte Matrix aus Quad. Matrix qm1 mit n=0, Einheitsmatrix
        QuadraticMatrix qm6 = qm1.pow(0);
        System.out.println("Qua. Matrix qm1 mit Potenz 0 (Einheitsmatrix):\n" + qm6.toString());

        // FehlertestTest: neue multiplizierte Matrix aus Quad. Matrix qm1 mit n=-2
        QuadraticMatrix qm7 = qm1.pow(-2);
        System.out.println();

        // ------------------------------------
        // IdentityMatrix
        // Test: Default Konstruktor, toString
        IdentityMatrix im1 = new IdentityMatrix();
        System.out.println("Id. Matrix, Default Konstruktor:\n" + im1.toString());

        // Test: Konstruktor zur n-dimensionalen Erzeugung, 7*7, toString
        IdentityMatrix im2 = new IdentityMatrix(7);
        System.out.println("Id. Matrix, Konstruktor, 7*7 Dimension:\n" + im2.toString());

        // Fehlertest: Konstruktor zur n-dimensionalen Erzeugung, n ist negativ, toString
        IdentityMatrix im3 = new IdentityMatrix(-4);
        System.out.println("Id. Matrix, Konstruktor, negative Dimension ins positive:\n" + im3.toString());

        // Fehlertest: Konstruktor zur n-dimensionalen Erzeugung, n ist 0, alternative 3*3 wird erzeugt, toString
        IdentityMatrix im4 = new IdentityMatrix(0);
        System.out.println("Id. Matrix, Konstruktor, 0 Dimension, alternative 3*3 Id. Matrix wird erzeugt:\n" + im4.toString());
    }
}
