/**
 * Reine Testklasse für VInteger und NuetzlicheFunktion
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 04/12/16
 */
public class Main {

    public static void main(String[] args) {

        VInteger[] array = new VInteger[]{
                new VInteger(-200),
                new VInteger(-134),
                new VInteger(-0),
                new VInteger(+0),
                new VInteger(12),
                new VInteger(121),
                new VInteger(-200),
                new VInteger(9999999),
        };

        System.out.println(NuetzlicheFunktion.kleinstesElement(array));

    }
}
