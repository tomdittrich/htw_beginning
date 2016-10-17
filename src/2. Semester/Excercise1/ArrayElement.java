import java.util.Arrays;

/**
 * Mit ArrayElement wird ein Byte Array eingelesen und die am häufigsten vorkommenden
 * Elemente werden in einem Byte Array ausgegeben.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @date 13.10.16
 * @version 1.0
 */
public class ArrayElement {

    public static byte[] haeufigstesElem(byte[] arr) {

        // Array zum Speichern der Werte (aus dem original Array)
        byte[] werte = new byte[0];
        // Array zum Speichern der Anzahl der jeweiligen Werte
        int[] anzahl = new int[0];
        // Array zum Speichern der Ergebnisse
        byte[] ergebnis = new byte[0];

        //Hilfsvariablen für die ArrayPositionen und zum Speichern der Maximal-Anzahl im Array
        int i = 0;
        int k = 0;
        int max = 0;

        Arrays.sort(arr);

        while (i < arr.length) {

            // ist der Wert im "Werte Array" vorhanden? Wenn nicht, füge diese Zahl hinzu
            // und setze "Anzahl" erstmal auf 0
            if (!wertVorhanden(werte, arr[i])) {
                werte = neuElement(werte, arr[i]);
                anzahl = neuElement(anzahl, 0);
            }

            // "Anzahl" auf 1, da Element vorhanden
            anzahl[k]++;

            // hätte man auslagern können, schien mir so aber übersichtlicher (wegen dem "globalen" i Zähler)
            // prüft die Anzahl eines Elements aus dem orig. Array
            // da das Array sorrtiert ist, kann die Position einfach immer um eins weiter rücken
            if (i < arr.length-1) {
                while (arr[i] == arr[i + 1]) {
                    // sind die Elemente gleich, wird die Anzahl erhöht
                    anzahl[k]++;
                    i++;
                    // tritt ein neues größeres Element auf, ist die Zählung beendet
                    if (i >= arr.length - 1) {
                        break;
                    }
                }
            }
            //Zähler für die Array Positionen werden erhöht
            i++;
            k++;
        }

        // welcher Wert im "Anzahl Array" kommt am häufigsten vor?
        // bzw. was ist die höchste vorkommende Anzahl, die ein Element im orig. Array hat
        max =  maximalAnzahl(anzahl);

        // vergleicht aufsteigend den max. Wert mit dem Anzahl Array
        // bei Treffer wird der dazugehörige Wert in das Ergebnis Array übertragen
        for (int m = 0; m < anzahl.length; m++){
            if(anzahl[m]== max){
                ergebnis = neuElement(ergebnis, werte[m]);
            }
        }

        return ergebnis;
    }

    /**
     * prüft, ob ein Wert in einem Array bereits vorhanden ist
     *
     * @param arr Array Übergabe
     * @param wert der zu prüfende Wert
     * @return (boolean) true/false
     */
    public static boolean wertVorhanden(byte[] arr, byte wert) {
        boolean ergebnis = false;

        for (byte elem : arr) {
            if (elem == wert) {
                ergebnis = true;
                break;
            }
        }

        return ergebnis;
    }

    /**
     * Fügt ein Element einem bereits bestehnden int-Array hinzu
     *
     * @param arr Array Übergabe
     * @param wert das hinzufügende Element
     * @return (int) neues Array
     */
    private static int[] neuElement(int[] arr, int wert) {
        // ein neues Array mit +1 Länge vom Original wird erzeugt
        int[] neuArr = new int[arr.length + 1];

        // Werte aus orig. Array werden kopiert
        for (int i = 0; i < arr.length; i++) {
            neuArr[i] = arr[i];
        }

        // neuer Wert hinzugefügt
        neuArr[neuArr.length - 1] = wert;
        return neuArr;
    }

    /**
     * Fügt ein Element einem bereits bestehnden int-Array hinzu
     *
     * @param arr Array Übergabe
     * @param wert das hinzufügende Element
     * @return (byte) neues Array
     */
    private static byte[] neuElement(byte[] arr, byte wert) {
        // ein neues Array mit +1 Länge vom Original wird erzeugt
        byte[] neuArr = new byte[arr.length + 1];

        // Werte aus orig. Array werden kopiert
        for (int i = 0; i < arr.length; i++) {
            neuArr[i] = arr[i];
        }

        // neuer Wert hinzugefügt
        neuArr[neuArr.length - 1] = wert;
        return neuArr;
    }

    /**
     * schaut nach dem höchsten Wert innerhalb eines Arrays
     *
     * @param arr Array Übergabe
     * @return (int) maximal Wert
     */
    private static int maximalAnzahl(int[] arr){
        int max = arr[0];

        for (int elem : arr) {
            if(max < elem) {
                max = elem;
            }
        }

        return max;
    }
}
