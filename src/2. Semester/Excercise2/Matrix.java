/**
 * blub
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.3
 * @date 19.10.16
 */
public class Matrix {

    private double[][] array;
    private int zeilen;
    private int spalten;

    /**
     * Default Konstruktor
     * Erzeugt 3*3 Matrix, gefüllt mit:
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    public Matrix() {
        neueMatrix(new double[][]{new double[]{1, 2, 3}, new double[]{4, 5, 6}, new double[]{7, 8, 9}});
        //System.out.println("Gefüllte 3x3 Matrix erzeugt");
    }

    /**
     * Konstruktor
     * Erzeugt ein n*m dimensionales Array, welches übergeben werden muss
     *
     * @param array Array Übergabe
     */
    public Matrix(double[][] array) {
        neueMatrix(array);
    }

    /**
     * Getter Array/Matrix
     *
     * @return das Array
     */
    public double[][] getArray() {
        return this.array;
    }

    /**
     * Getter Zeilen
     *
     * @return Zeilenanzahl
     */
    public int getZeilen() {
        return zeilen;
    }

    /**
     * Getter Spalten
     *
     * @return Spaltenanzahl
     */
    public int getSpalten() {
        return spalten;
    }

    /**
     * Erstellt eine neue Matrix/Array aus vorgegebenen Werten
     *
     * @param array Übergabe Array
     */
    public void neueMatrix(double[][] array) {
        // prüft ob Array leer oder ungültig (siehe Methoden)
        // andernfalls Exception Wurf
        if (istLeer(array) || !istGueltig(array)) {
            throw new IllegalArgumentException("Leere oder ungültge Matrix");
        } else {
            this.array = array;
            this.zeilen = array.length;
            this.spalten = array[0].length;
        }
    }

    /**
     * Prueft ob ein Array leer ist
     *
     * @param array Array Übergabe
     * @return Leer: True
     */
    private boolean istLeer(double[][] array) {
        if (array.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Prueft ob eine Matrix gültig ist (eine Zeile/Spalte kürzer)
     *
     * @param array Array Übergabe
     * @return Gültig? True
     */
    private boolean istGueltig(double[][] array) {
        int laenge = array[0].length;
        boolean ergebnis = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length == laenge) {
                ergebnis = true;
            } else {
                ergebnis = false;
                break;
            }
        }
        return ergebnis;
    }

    /**
     * Prüft ob zwei Matrizen identisch sind
     *
     * @param ma zu vergleichendes Matrix-Objekt
     * @return ja: true
     */
    public boolean equals(Matrix ma) {
        if (getZeilen() == ma.getZeilen() && getSpalten() == ma.getSpalten()) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j]!=ma.array[i][j]){
                        return false;
                    }
                }
            }
        } else {
            return false;
        }

        return true;
    }

    public Matrix add(Matrix ma) {
        double[][] ergebnis = new double[getZeilen()][getSpalten()];

        if (getZeilen() == ma.getZeilen() && getSpalten() == ma.getSpalten()) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    ergebnis[i][j] = array[i][j] + ma.array[i][j];
                }
            }
        } else {
            throw new IllegalArgumentException("Matrizen Dimensionen nicht kompatibel");
        }
    return new Matrix(ergebnis);
    }




}
