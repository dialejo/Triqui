
public class Box {

	//static constantes
	//SIMBOLO_X
	public static final String SIMBOLO_X = "X"; //SYMBOL_O
	
	public static final String SIMBOLO_O = "O"; //SYMBOL_V
	
	public static final String SIMBOLO_V = " "; //Variables
	
	//box Simbolos
	public String simbolo;

	 /* Constructor
     * inicio la box asignando la box sin simbolos de cero
     */
    public Box() {
        this.simbolo = SIMBOLO_V;  
     }
    
    /*
     * Metodo
     * asignar X o O, si  no asignar espacio vacio
     * @param c simbolo para ser asignado
     */
    public void assignSimbolo(String c) {
        String cTemp = c.trim().toUpperCase();
        if(cTemp.equals(Box.SIMBOLO_X) || cTemp.equals(Box.SIMBOLO_O))
            simbolo = cTemp;
        else
            simbolo = Box.SIMBOLO_V;
}
    /*
     * Metodo
     * Rrvisar si las box esta vacia
     * @return true si esta vacia, de lo contrario tiene un valor
     */
    public boolean isEmpty() {
        return this.simbolo.trim().isEmpty();
}
    /*
     * Metodo
     * evalua si el simbolo de la box es un parametro
     * @param c simbolo a ser evaluado
     * @return true si el simbolo es de same
     */
    public boolean isEqual(String c) {
        String cTemp = c.trim().toUpperCase();
        return cTemp.equals(simbolo);
}

}
