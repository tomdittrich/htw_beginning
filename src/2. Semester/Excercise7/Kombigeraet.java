import interfaces.Drucker;
import interfaces.Fax;

/**
 * Created by Tom on 30.11.2016.
 */
public class Kombigeraet implements Drucker, Fax {
    private static int counter = 1;
    private int transmitter;

    public Kombigeraet(){
        transmitter = counter;
        counter++;
    }

    @Override
    public void senden(String sendeRef) {
        System.out.printf("Absender ist: Kombigeraet%d\n%s\n%s\n", transmitter, faxsimulation, sendeRef);
    }

    @Override
    public void drucken(String druckRef) {
        System.out.printf("Kombigeraet Kombigeraet%d meldet sich\n%s\n%s\n", transmitter, drucksimulation, druckRef);
    }
}
