import interfaces.Fax;

/**
 * Created by Tom on 30.11.2016.
 */
public class Faxgeraet implements Fax {
    private static int counter = 1;
    private int transmitter;

    public Faxgeraet(){
        transmitter = counter;
        counter++;
    }

    @Override
    public void senden(String sendeRef) {
        System.out.printf("Absender ist: Fax%d\n%s\n%s\n", transmitter, faxsimulation, sendeRef);
    }
}
