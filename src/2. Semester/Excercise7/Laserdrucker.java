import interfaces.Drucker;

/**
 * Created by Tom on 30.11.2016.
 */
public class Laserdrucker implements Drucker {
    private static int counter = 1;
    private int transmitter;

    public Laserdrucker(){
        transmitter = counter;
        counter++;
    }

    @Override
    public void drucken(String druckRef) {
        System.out.printf("Drucker Laser%d meldet sich\n%s\n%s\n", transmitter, drucksimulation, druckRef);
    }
}
