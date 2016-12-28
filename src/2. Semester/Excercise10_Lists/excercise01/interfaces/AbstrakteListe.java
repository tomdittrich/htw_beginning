package excercise01.interfaces;

public interface AbstrakteListe {
	
	/**
	 * berechnet die Laenge der Liste
	 * @return Laenge der Liste
	 */
	public abstract int size();
	

	/**
	 * prueft, ob ein gegebener Wert in der Liste vorhanden ist
	 * @param wert gesuchter Wert
	 * @return true, wenn gesuchter Wert in der Liste vorhanden
	 */
	public abstract boolean contains(int wert);
	
	
	/**
	 * gibt den Wert eines Elementes am gegebenen Index zurueck (Lesen)
	 * @param index gefragter Index
	 * @return Wert des Elements am gefragten Index
	 * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
	 */
	public abstract int get (int index) throws NullPointerException;
	
	
	/**
	 * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben) 
	 * und gibt den alten ueberschriebenen Wert des Elements zurueck
	 * @param index Index, an dem der Wert ueberschrieben werden soll
	 * @param wert neuer Wert
	 * @return alter ueberschriebener Wert
	 * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
	 */
	public abstract int set (int wert, int index) throws NullPointerException;
	
	
	/**
	 * fuegt einen Wert an den Anfang der Liste ein
	 * @param wert der einzufuegende Wert
	 */
	public abstract void addFirst (int wert);
	
	
	/**
	 * fuegt einen Wert ans Ende der Liste ein
	 * @param wert der einzufuegende Wert
	 */
	public abstract void addLast (int wert);
	
	
	/**
	 * fuegt einen Wert am gegebenen Index in die Liste ein
	 * @param wert der einzufuegende Wert
	 * @param index Index, an dem das neue Element eingefuegt werden soll
	 * @return true, wenn das Element am gegebenen Index erfolgreich eingefuegt wurde
	 */
	public abstract boolean add (int wert, int index);
	
	
	/**
	 * entfernt ein Element mit gegebenem Wert aus der Liste
	 * @param wert zu entfernende Wert
	 * @return true, wenn Element mit gegebenem Wert gefunden und aus der Liste entfernt wurde
	 */
	public abstract boolean remove (int wert);
	
	
	/**
	 * entfernt das erste Element aus der Liste	
	 * @return Wert des entfernten Elements
	 * @throws NullPointerException wenn Liste leer
	 */
	public abstract int removeFirst() throws NullPointerException;
	
	
	/**
	 * entfernt das letzte Element aus der Liste	
	 * @return Wert des entfernten Elements
	 * @throws NullPointerException wenn Liste leer
	 */
	public abstract int removeLast() throws NullPointerException;
	
	
	/**
	 * entfernt das Element am gegebenen Index aus der Liste
	 * @param index Index, an dem das Element entfernt werden soll
	 * @return Wert des entfernten Elements
	 * @throws NullPointerException wenn Index in der Liste nicht vorhanden
	 */
	public abstract int removeAtIndex (int index) throws NullPointerException;
	
	
	/**
	 * liefert die String-Repruesentation der Liste zurueck
	 */
	public abstract String toString();
}
