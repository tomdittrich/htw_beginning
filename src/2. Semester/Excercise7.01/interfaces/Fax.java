package interfaces;

/**
 * Interfaces für "Fax" Objekte mit senden Methode
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/11/16
 */
public interface Fax {

    String faxsimulation = "Das Senden wird simuliert";

    public void senden(String sendeRef);
}
