package menu;

import list.List;
import java.util.Scanner;

/**
 * Created by Tom on 18.01.2017.
 */
public class MainMenu {

    private static boolean run = true;

    /*public static MainMenu(){
        startMenu();
    }
    */

    private static void startMenu(){
        System.out.println("Welcome to \"Students Database 1.0\"");

        while (run){
            printMainMenu();

        }

    }

    // public, um es von aussen jederzeit stoppen zu koennen (Panic Mode Option)
    public static void stopMenu(){
        run = false;
    }

    private static void printMainMenu(){
        System.out.println("Bitte waehlen Sie aus:\n" +
                "1. Student erstellen\n" +
                "2. Student loeschen\n" +
                "3. Studenten anzeigen" +
                "4. Datenbank komplett loeschen (Achtung)" +
                "5. Progamm beenden" +
                "" +
                "");
    }
}
