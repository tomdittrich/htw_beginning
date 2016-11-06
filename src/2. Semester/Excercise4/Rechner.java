/**
 * Mit Rechner können einfache Rechenoperationen durchgeführt werden.
 * Übergabe durch args Argumente: Zahl1 [add|sub|mul|div] Zahl2
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.7
 * @date 06/11/16
 */
public class Rechner {

    public static void main(String[] args) {

        output(args);
    }

    /**
     * gibt die Rechnung und das Ergebnis aus
     *
     * @param werte zu übergebende String-args Array
     */
    private static void output (String[] werte){
        // prüft ob die Anzahl der Argumente übereinstimmt
        if(werte.length!=3){
            throw new IllegalArgumentException("Ungültige Menge an Argumenten.");
        }

        double a = Double.parseDouble(werte[0]);
        double b = Double.parseDouble(werte[2]);

        String op = werte[1];


        // Prüft, welche Rechenoperation statt findet.
        // Die Rechenop. sind mit Absicht ausgelagert: sollte das Programm ggf. weiter geschrieben
        // werden, könnenten die Methoden noch nützlich sein
        if (op.equals("add")) {
            System.out.println(a + " " + op + " " + b + " ist " + add(a, b));

        } else if (op.equals("sub")) {
            System.out.println(a + " " + op + " " + b + " ist " + sub(a, b));

        } else if (op.equals("mul")) {
            System.out.println(a + " " + op + " " + b + " ist " + mul(a, b));

        } else if (op.equals("div")) {
            if(b!=0){
                System.out.println(a + " " + op + " " + b + " ist " + div(a, b));
            } else {
                System.out.println("Division durch 0 nicht möglich.");
            }

        } else {
            throw new IllegalArgumentException("Keine gültige Operation angegeben.");
        }
    }

    /**
     * Addition von zwei Zahlen
     *
     * @param a Zahl1
     * @param b Zahl2
     * @return auf zwei stellen gerundetes Ergebnis
     */
    private static double add(double a, double b) {
        return (Math.round( (a+b) * 100 ) / 100.0);
    }

    /**
     * Subtraktion von zwei Zahlen
     *
     * @param a Zahl1
     * @param b Zahl2
     * @return auf zwei stellen gerundetes Ergebnis
     */
    private static double sub(double a, double b) {
        return (Math.round( (a-b) * 100 ) / 100.0);
    }

    /**
     * Multiplikation von zwei Zahlen
     *
     * @param a Zahl1
     * @param b Zahl2
     * @return auf zwei stellen gerundetes Ergebnis
     */
    private static double mul(double a, double b) {
        return (Math.round( (a*b) * 100 ) / 100.0);
    }

    /**
     * Division von zwei Zahlen
     *
     * @param a Zahl1
     * @param b Zahl2
     * @return auf zwei stellen gerundetes Ergebnis
     */
    private static double div(double a, double b) {
        return (Math.round( (a/b) * 100 ) / 100.0);
    }
}
