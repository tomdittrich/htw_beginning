import java.util.Arrays;

/**
 * blub
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.1
 * @date 13.10.16
 */
public class ArrayElement {

    public static byte[] haeufigstesElem(byte[] arr) {

        byte[] werte = new byte[0];
        int[] anzahl = new int[0];
        byte[] ergebnis = new byte[0];

        int i = 0;
        int k = 0;
        int max = 0;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        while (i < arr.length) {

            if (!wertVorhanden(werte, arr[i])) {
                werte = neuElement(werte, arr[i]);
                anzahl = neuElement(anzahl, 0);
            }

            anzahl[k]++;

            //hätte man auslagern können, schien mir so aber übersichtlicher (wegen dem "globalen" i Zähler)
            if (i < arr.length-1) {
                while (arr[i] == arr[i + 1]) {
                    anzahl[k]++;
                    i++;
                    if (i >= arr.length - 1) {
                        break;
                    }
                }
            }

            i++;
            k++;
        }

        max =  maximalAnzahl(anzahl);

        for (int m = 0; m < anzahl.length; m++){
            if(anzahl[m]== max){
                ergebnis = neuElement(ergebnis, werte[m]);
            }
        }

        return ergebnis;
    }

    private static boolean wertVorhanden(byte[] arr, byte wert) {
        boolean ergebnis = false;

        for (byte elem : arr) {
            if (elem == wert) {
                ergebnis = true;
                break;
            }
        }

        return ergebnis;
    }

    private static int[] neuElement(int[] arr, int wert) {
        int[] neuArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            neuArr[i] = arr[i];
        }

        neuArr[neuArr.length - 1] = wert;
        return neuArr;
    }

    private static byte[] neuElement(byte[] arr, byte wert) {
        byte[] neuArr = new byte[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            neuArr[i] = arr[i];
        }

        neuArr[neuArr.length - 1] = wert;
        return neuArr;
    }

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
