/**
 * Reine Testklasse für die Klasse Rechner
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.7
 * @date 06/11/16
 */
public class RechnerTest {

    public static void main(String[] args) {
        String[][] test = new String[][]{
                //Addition
                new String[]{"2", "add", "2"},
                new String[]{"-5", "add", "2"},
                new String[]{"5", "add", "-2"},
                new String[]{"-5", "add", "-5"},
                new String[]{"2.7", "add", "2.7"},
                new String[]{"2.74", "add", "2.73"},
                new String[]{"5", "add", "0"},

                //Subtraktion
                new String[]{"3", "sub", "2"},
                new String[]{"-5", "sub", "2"},
                new String[]{"5", "sub", "-2"},
                new String[]{"-5", "sub", "-6"},
                new String[]{"2.7", "sub", "2.6"},
                new String[]{"2.89", "sub", "2.73"},
                new String[]{"5", "sub", "0"},

                //Multiplikation
                new String[]{"3", "mul", "2"},
                new String[]{"-5", "mul", "2"},
                new String[]{"5", "mul", "-2"},
                new String[]{"-5", "mul", "-6"},
                new String[]{"2.7", "mul", "2.6"},
                new String[]{"2.34", "mul", "2.73"},
                new String[]{"5", "mul", "0"},

                //Division
                new String[]{"6", "div", "2"},
                new String[]{"-6", "div", "2"},
                new String[]{"6", "div", "-2"},
                new String[]{"-12", "div", "-4"},
                new String[]{"12.55", "div", "6.21"},
                new String[]{"0", "div", "6"},
                new String[]{"5", "div", "0"},

                //Fehler
                new String[]{"eins", "add", "null"},
                new String[]{"eins", "1", "null"},
                new String[]{"2", "add", "2", "4"},
                new String[]{"2", "4", "2"},

        };

        for (int i = 0; i < test.length; i++) {
            Rechner.main(test[i]);
        }


    }
}
