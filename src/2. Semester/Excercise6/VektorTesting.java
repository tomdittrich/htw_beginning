/**
 * Description
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.1
 * @date 11/20/16
 */
import math.*;

public class VektorTesting {

    public static void main(String[] args) {
        Vektor v1 = new Vektor();
        Vektor v2 = new Vektor();

        for(double sum : v1.multiplyScalar(4).getArray()[0]){
            System.out.println(sum);
        }
    }
}
