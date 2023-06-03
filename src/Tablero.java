
public class Tablero {
	
	//Variables
	//box arreglo
	public Box[] boxes; //count of used boxes 
	public int usedBoxes = 0;
	
	/*
     * Default constructor
     */
	public Tablero() {
        init();
        }
    /*
     * crear una BOX de 9 espacios vacios
     */
    public void init() {
        boxes = new Box[9];
        for(int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box();
            }
        }
    /*
     * Method
     * Asignar a S simnbolo a la posicion P
     * @param s simbolo para ser assignado
     * @param p position en el tablero [1 ... 9]
     * @return true si se assigno correctamente  de otra forma false
     */
    public boolean assignSymbolBox(int p, String s) {
        if(boxes[p - 1].isEmpty()) {
            boxes[p - 1].assignSimbolo(s);
            usedBoxes++;
            return true;
            }
        return false;
    }
    /*
     * Method
     * evaluar si es ganador en la parte superior
     * @param ultimo simbolo usado
     * @return true isi es triqui en el to de otra forma false
     */
    public boolean isTriquiTopRow(String simbolo) {
        if(boxes[0].isEqual(simbolo) && boxes[1].isEqual(simbolo) && boxes[2].isEqual(simbolo))
        return true;
    return false;
    }
    /*
     * Method
     * evalua si es ganador en el centro
     * @param ultimo simbolo usado
     * @return true si es triqui en el centro si no es false
     */
    public boolean isTriquiCentralRow(String simbolo) {
        if(boxes[3].isEqual(simbolo) && boxes[4].isEqual(simbolo) && boxes[5].isEqual(simbolo))
            return true;
        return false;
        }
    /*
     * Method
     * evalua si es ganador en el de abajo
     * @param ultimo simbolo usado
     * @return true si es triqui en el de abajo si no es false
     */
    public boolean isTriquiBottomRow(String simbolo) {
        if(boxes[6].isEqual(simbolo) && boxes[7].isEqual(simbolo) && boxes[8].isEqual(simbolo))
            return true;
        return false;
        }
    /*
     * Method
     * evalua si es ganador en la isquierda
     * @param ultimo simbolo usado
     * @return true si es triqui en la columna isquierda si no es false
     */
    public boolean isTriquiLeftColumn(String simbolo) {
        if(boxes[0].isEqual(simbolo) && boxes[3].isEqual(simbolo) && boxes[6].isEqual(simbolo))
            return true;
        return false;
        }
    
    /*
     * Method
     * evalua si es ganador en el centro
     * @param ultimo simbolo usado
     * @return true si es triqui en la columna central si no es false
     */
    public boolean isTriquiCentralColumn(String simbolo) {
        if(boxes[1].isEqual(simbolo) && boxes[4].isEqual(simbolo) && boxes[7].isEqual(simbolo))
            return true;
        return false;
        }
    /*
     * Method
     * evalua si es ganador a la derecha
     * @param ultimo simbolo usado
     * @return true si es triqui en la columna de la derecha si no es false
     */
    public boolean isTriquiRightColumn(String simbolo) {
        if(boxes[2].isEqual(simbolo) && boxes[5].isEqual(simbolo) && boxes[8].isEqual(simbolo))
            return true;
        return false;
        }
    /*
     * Method
     * evalua si es ganador en la principal diagonal
     * @param ultimo simbolo usado
     * @return true si es triqui en la principal diagonal si no es false
     */
    public boolean isTriquiMainDiagonal(String simbolo) {
        if(boxes[0].isEqual(simbolo) && boxes[4].isEqual(simbolo) && boxes[8].isEqual(simbolo))
            return true;
        return false;
        }
    /*
     * Method
     * evalua si es ganador en la segunda diagonal
     * @param ultimo simbolo usado
     * @return true si es triqui en la segunda diagonal si no es false
     */
    public boolean isTriquiSecondaryDiagonal(String simbolo) {
        if(boxes[2].isEqual(simbolo) && boxes[4].isEqual(simbolo) && boxes[6].isEqual(simbolo))
            return true;
        return false;
        }
    /*
     * Method
     * muestra el tablero simbolo por simbolo
     * @return tablero completo
     */
    public String paintTablero() {
        String tablero = " ";
        for(int i = 0; i < boxes.length; i++) {
            if(boxes[i].isEmpty())
                tablero = tablero + "[" + (i + 1) + "]" + " ";
    else
                tablero = tablero + " " + boxes[i].simbolo + " ";
            if((i + 1) % 3 == 0)
                tablero = tablero + "\n" + " ";
        }
        return tablero;
    }
}