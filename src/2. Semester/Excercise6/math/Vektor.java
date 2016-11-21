/**
 * Mit Vektor koennen double Vektoren erstellt werden.
 * Einfache Anwendungen wie das Addieren, Multiplizieren mit einem Skalar oder einem anderen Vektor sind möglich.
 * Basis fuer weitere Methoden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.3
 * @date 20.11.16
 */
package math;

public class Vektor extends Matrix {

    /**
     * Default Konstruktur
     * Erzeugt einen Vektor mit den Werten 1,2 und 3
     */
    public Vektor(){
        super(new double[][]{new double[]{1,2,3}});
    }

    /**
     * Konstruktor
     * Erzeugt ein Vektor Array und wandelt es in 2-dimensionales Array
     *
     * @param feld Array Übergabe
     */
    public Vektor(double[] feld){
        super(new double[][]{feld});
    }

    /**
     * Berechnet die Länge des Vektors
     *
     * @return die Länge
     */
    public double length()
    {
        double sum = 0;
        for(double n : getArray()[0])
        {
            sum += n * n;
        }
        return Math.sqrt(sum);
    }

    /**
     * Gibt den Vektor als String aus
     *
     * @return Vektor als String
     */
    public String toString(){
        return ("Der Vektor lautet:\n"+super.toString());
    }




}
