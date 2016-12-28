package math;

import java.util.Arrays;

/**
 * Mit Matrix koennen double Matrizen erstellt werden.
 * Einfache Anwendungen wie das Addieren, Multiplizieren mit einem Skalar oder einer anderen Matrix sind möglich
 * Basis fuer weitere Methoden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.1
 * @date 20.11.16
 */


public class Matrix {

    // Matrix als Array
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
            System.out.println("Leere oder ungültge Matrix");
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
        boolean ergebnis = false;

        if (array.length == 1) {
            ergebnis = true;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i].length == array[0].length) {
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
                    if (array[i][j] != ma.array[i][j]) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }

        return true;
    }

    /**
     * Addiert zwei Matrizen
     *
     * @param ma zu addierendes Matrix-Objekt
     * @return Ergebnis Matrix
     */
    public Matrix add(Matrix ma) {
        // erzeugt Ergebnis Matrix mit den Dimensionen der ersten Matrix
        double[][] ergebnis = new double[getZeilen()][getSpalten()];

        if (getZeilen() == ma.getZeilen() && getSpalten() == ma.getSpalten()) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    ergebnis[i][j] = array[i][j] + ma.array[i][j];
                }
            }
        } else {
            // Exception, wenn Matrizen unterschiedliche Dimensionen haben
            System.out.println("Matrizen Dimensionen nicht kompatibel");
        }
        return new Matrix(ergebnis);
    }

    /**
     * Multipliziert die Matrix mit einem Skalar
     *
     * @param scalar Skalar Übergabe
     * @return Ergebnix Matrix
     */
    public Matrix multiplyScalar(double scalar) {
        // erzeugt Ergebnis Matrix mit den Dimensionen der ersten Matrix
        double[][] ergebnis = new double[getZeilen()][getSpalten()];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                ergebnis[i][j] = array[i][j] * scalar;
            }
        }
        return new Matrix(ergebnis);
    }

    /**
     * Multipliziert zwei Matrizen
     *
     * @param ma zu multiplizierendes Matrix-Objekt
     * @return Ergebnis Matrix
     */
    public Matrix multiply(Matrix ma) {
        // erzeugt Ergebnis Matrix mit den Zeilen der 1. und den Spalten der 2.Matrix
        double[][] ergebnis = new double[getZeilen()][ma.getSpalten()];

        // Exception, wenn Matrizen inkompatible Dimensionen haben
        if (getSpalten() != ma.getZeilen()) {
            System.out.println("Falsche Dimensionen, keine Multiplikation möglich.");
        } else {
            for (int i = 0; i < ergebnis.length; i++) {
                for (int j = 0; j < ergebnis[0].length; j++) {
                    for (int k = 0; k < ma.array.length; k++) {
                        ergebnis[i][j] += array[i][k] * ma.array[k][j];
                    }
                }
            }
        }

        return new Matrix(ergebnis);
    }

    /**
     * Gibt die Matrix als String aus
     *
     * @return Matrix als String
     */
    public String toString() {
        String ergebnis = "";

        for (double[] n : array) {
            ergebnis += Arrays.toString(n) + "\n";
        }

        return ergebnis;
    }
}
