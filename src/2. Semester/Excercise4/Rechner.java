/**
 * Mit Rechner können einfache Rechenoperationen durchgeführt werden
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.5
 * @date 02/11/16
 */
public class Rechner {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        String op = args[1];

        if (op.equals("add")) {
            System.out.println(a + " " + op + " " + b + " ist " + add(a, b));

        } else if (op.equals("sub")) {
            System.out.println(a + " " + op + " " + b + " ist " + sub(a, b));

        } else if (op.equals("mul")) {
            System.out.println(a + " " + op + " " + b + " ist " + mul(a, b));

        } else if (op.equals("div")) {
            System.out.println(a + " " + op + " " + b + " ist " + div(a, b));

        } else {
            throw new IllegalArgumentException("Keine gültige Operation angegeben.");
        }
    }

    private static double add(double a, double b) {
        return (Math.round( (a+b) * 100 ) / 100.0);
    }

    private static double sub(double a, double b) {
        return (Math.round( (a-b) * 100 ) / 100.0);
    }

    private static double mul(double a, double b) {
        return (Math.round( (a*b) * 100 ) / 100.0);
    }

    private static double div(double a, double b) {
        return (Math.round( (a/b) * 100 ) / 100.0);
    }
}
