package Stack;

public class CharArrayStack implements CharStack {
	public char[] daten;
	private int top= 0;//der n�chste freie Platz
	/**
	 * @author jan.kunert
	 * @version 1.0
	 */

	public CharArrayStack()
	{
		daten = new char[10];
		
	}
	/**
	 * Liefert zur�ck, ob der Keller Leer ist
	 * 
	 *  @return true, wenn das Array leer ist.
	 */
	
	public boolean isEmpty() {
		if (top==0){
		return true;}
		else;return false;
	}
	/**
	 * Liefert zur�ck, ob der Keller voll ist
	 * 
	 *  @return true, wenn das Array voll ist.
	 */
	
	public boolean isFull() {
		if (top==daten.length+1){
		return true;}
		else;return false;
	}
	/**
	 * Liefert das oberste Keller-Element zur�ck 
	 * 
	 * @return das oberste Daten-Element zur�ck
	 */
	

	public char top() {
		if (isEmpty()){
			throw new RuntimeException("daten is leer");}
		
		return daten[top-1];
	}
	/**
	* Liefert die Anzahl an belegten Pl�tzen
	*
	* @return die anzahl an belgten Pl�tzen
	*/
	public int size()
	{
		return top;
	}
	/**
	 * Legt ein Element auf den Stapel.
	 */
	public void push(char inhalt) {
		if (top == daten.length){
			throw new RuntimeException("daten is voll ");}
		daten[top] = inhalt;top++;

	}
	/**
	 Liefert das Oberste Keller-Element und gibt es danach zur �berschreibung frei.
	 
	 @return  das oberste Keller-Element
	 	 */
	public char pop() {
		top--;
		if (top==-1){
			throw new RuntimeException("Das Array ist leer!");
		}
		return daten[top];
		
	}
	/**
	* Wandelt den kompletten Kellerinhalt in eine Zeichenkette um.
	*
	*@return den gesamten Inhalt als String.
	*/
	public String toString(){
		
		String s = "";
		for(int i = 0; i<=top-1;i++){
			s+=daten[i];
			
		}
		
		
		return s;
	}
}
