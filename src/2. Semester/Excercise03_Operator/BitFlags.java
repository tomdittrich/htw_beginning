/**
 * Mit BitFlags können die einzelnen Bits einer Integer Zahl verändert werden.
 * Basis für weitere Methoden.
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 1.0
 * @date 30/10/16
 */
public class BitFlags {

    private int status;

    /**
     * Konstruktor
     * Zu ubergebende Integer Zahl, die bearbeitet werden soll
     *
     * @param status zu übergebende Zahl
     */
    public BitFlags(int status) {
        setStatus(status);
    }

    /**
     * Getter Zahl
     *
     * @return Zahl
     */
    public int getStatus() {
        return status;
    }

    /**
     * Setter Zahl
     *
     * @param status zu übergebende Zahl
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Setzt das Bit bei Indexposition auf 1
     *
     * @param index Indexposition
     */
    public void switchOn(int index) {
        if(index >= 0 && index <= 31){
            int hilf = 1;

            hilf = hilf << index;
            this.status = this.status | hilf;
        } else {
            throw new IllegalArgumentException("Nur Indexwerte von 0 bis 31 sind zulässig");
        }
    }

    /**
     * Setzt das Bit bei Indexposition auf 0
     *
     * @param index Indexposition
     */
    public void switchOff(int index) {
        if(index >= 0 && index <= 31){
            int hilf = 1;

            hilf = ~(hilf << index);
            this.status = this.status & hilf;
        } else {
            throw new IllegalArgumentException("Nur Indexwerte von 0 bis 31 sind zulässig");
        }
    }

    /**
     * dreht das Bit bei Indexposition um
     *
     * @param index Indexposition
     */
    public void swap(int index) {
        if(index >= 0 && index <= 31){
            int hilf = 1;

            hilf = hilf << index;
            this.status = this.status ^ hilf;
        } else {
            throw new IllegalArgumentException("Nur Indexwerte von 0 bis 31 sind zulässig");
        }
    }

    /**
     * gibt zurück, ob Bit bei Indexposition gesetzt ist
     *
     * @param index Indexposition
     * @return gesetzt? True
     */
    public boolean isSet(int index) {
        if(index >= 0 && index <= 31) {
            int hilf = 1;

            hilf = hilf << index;
            return ((this.status & hilf) == hilf) ? true : false;
        } else {
            throw new IllegalArgumentException("Nur Indexwerte von 0 bis 31 sind zulässig");
        }
    }
}
