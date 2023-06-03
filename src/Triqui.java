
public class Triqui {
	//Variables
    //Triqui Tablero
	
	public Tablero tablero; 
	public Jugador p1, p2; /*
	
	/*
     * Constructor
     * Inicia los juaderos con sus jugadas
     */
    public Triqui(Jugador p1, Jugador p2) {
        init(p1, p2);
        }
    /*
     * inicialisa variable 1 y 2 con sus jugadores
     * and creates a new board
     */
    public void init(Jugador p1, Jugador p2) {
        tablero = new Tablero();
        this.p1 = p1;
        this.p2 = p2;
        }
    /*
     * Method
     * asignar un simbolo a p en la posiscion llamando al objeto
     * @param simbolo en la posicion s para ser assignado
     * @param p en la posiscion [1 ... 9]
     * @return true si es assignado si no false
     */
    public boolean assignSymbolBox(int p, String s) {
        return tablero.assignSymbolBox(p, s);
    }

    /*
     * Method
     * Evaluar si es un empate, si el checkeo de box es igual a 9
     * @return true si es un empate si no false
     */
    public boolean isTie() {
        if(this.tablero.usedBoxes == 9)
            return true;
        else
            return false;
    }
   
    /*
     * Method
     * Evaluar si hay un ganador en cualquiera de las formas (top, central, bottom, leftColumn, centralColumn,
     * rightColumn, mainDiagonal, secundaryDiagonal)
     * @param symbolo es simbolo
     * @return true si hay un triqui si no false
     */
    public boolean isTriqui(String simbolo) {
        if(tablero.isTriquiTopRow(simbolo) || tablero.isTriquiCentralRow(simbolo) ||
                tablero.isTriquiBottomRow(simbolo) || tablero.isTriquiLeftColumn(simbolo) ||
                tablero.isTriquiCentralColumn(simbolo) || tablero.isTriquiRightColumn(simbolo) ||
                tablero.isTriquiMainDiagonal(simbolo) || tablero.isTriquiSecondaryDiagonal(simbolo))
        return true;
    return false;
    }
    
    /*
     * siguiente jugador
     * @param cjugador es el jugador actual
     * @return retorna el siguiente jugador en caso del turno
     */
    public Jugador getCurrentJugador(Jugador cJugador) {
        return (p1.equals(cJugador))? p2 : p1;
    }
    
    /*
     * turno jugador que escogio la X
     * @param p1 primer jugador
     * @param p2 Segundo Jugador
     * @return retorna el jugador que escogio la X
     */
    
    public static Jugador getFirstJugador(Jugador p1, Jugador p2) {
        if(p1.simbolo.equals(Box.SIMBOLO_X))
            return p1;
        else
        	return p2;
        }
    /*
    * Paint the Board1
    * @return retorna el tablero
    */
   public String paintTablero() {
       return tablero.paintTablero();
   }
    
}
