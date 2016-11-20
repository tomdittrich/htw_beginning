/**
 * Description
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.3
 * @date 20.11.16
 */
package math;

public class Vektor extends Matrix {

    public Vektor(){
        super(new double[][]{new double[]{1,2,3}});
    }

    public Vektor(double[] feld){
        super(new double[][]{feld});
    }

    public double length()
    {
        double sum = 0;
        for(double n : getArray()[0])
        {
            sum += n * n;
        }
        return Math.sqrt(sum);
    }


}
