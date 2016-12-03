package interfaces;

/**
 * Created by Tom on 30.11.2016.
 */
public interface Fax {
    String faxsimulation = "Das Senden wird simuliert";

    public void senden(String sendeRef);
}
