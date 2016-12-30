package excercise02;

import excercise01.Liste;
import excercise02.interfaces.StapelSchnittstelle;

/**
 * Klasse zum Erstellen und Verwalten von Stacks
 *
 * @author Tom Dittrich s0555944@htw-berlin.de
 * @version 0.9
 * @date 30.12.16
 */

public class Stapel extends Liste implements StapelSchnittstelle {

    public Stapel(){
        super();
    }

    public Stapel(int wert){
        super(wert);
    }

    /**
     * Legt ein Element auf den Stack
     *
     * @param wert der abzulegende Wert
     */
    @Override
    public void push(int wert) {
        addLast(wert);
    }

    /**
     * Nimmt oberstes Element herunter und liefer es zurueck
     *
     *
     * @return Wert des Elements
     * @throws NullPointerException wenn Stack leer ist
     */
    @Override
    public int pop() throws NullPointerException {
        if (isEmpty()){
            throw new NullPointerException("pop(): Stack leer");
        }
        return removeLast();
    }

    /**
     * Liefert Wert des obersten Elements zurueck
     *
     * @return Wert oberstes Element
     * @throws NullPointerException wenn Stack leer ist
     */
    @Override
    public int top() throws NullPointerException{
        if (isEmpty()){
            throw new NullPointerException("top(): Stack leer");
        }
        return get(size()-1);
    }

    /**
     * Prüft ob Stack leer ist
     *
     * @return true, wenn leer
     */
    @Override
    public boolean isEmpty() {
        if (size()==0){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String ergebnis = "";

        if (size() != 0) {
            for (int i=size()-1;i>=0;i--){
                ergebnis+="** "+get(i)+" **\n";
            }
            ergebnis += "*******";
            return ergebnis;
        }

        ergebnis+="* Leer *\n********";
        return ergebnis;
    }
}
