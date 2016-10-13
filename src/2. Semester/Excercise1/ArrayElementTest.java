import java.util.Arrays;


/**
 * reine Testklasse fuer die Klasse ArrayElement
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.1
 * @date 13.10.16
 */
public class ArrayElementTest {

    public static void main(String[] args) {

        byte[] arr = {-128, 5, 5, 5, 5, -6, -6, -6, -6, 3, 3, 3, 20, 20};

        System.out.println(Arrays.toString(ArrayElement.haeufigstesElem(arr)));

    }

}
