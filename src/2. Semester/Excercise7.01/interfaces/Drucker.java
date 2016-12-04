package interfaces;

/**
 * Interfaces für "Drucker" Objekte mit drucken Methode
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/11/16
 */
public interface Drucker {

    String drucksimulation = "Das Drucken wird simuliert";

    public void drucken(String druckRef);
}
